package controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Routes {
    private static ArrayList<Class> accessHistory = new ArrayList<Class>();
    private static HashSet<ControllerView> controllers = new HashSet<ControllerView>();
    private static boolean isNext;
    private static List updatableFrame = Arrays.asList(ControllerFavorites.class, 
                                                       ControllerVideoPlayer.class, 
                                                       ControllerAnime.class);
    
    public static void initController(Class controllerClass) {
        boolean blockResend = false;
        if (accessHistory.size() > 0 && isNext) {
            if (accessHistory.get(accessHistory.size()-1) == controllerClass) {
                blockResend = true;
            }
        }
        
        if (!blockResend) {
            boolean exists = false;
            ControllerView currentController = null;
            for (ControllerView controller : getControllers()) {
                if (controller.getClass() == controllerClass){
                    currentController = controller;
                    exists = true;
                }
            }

            if (!exists) {
                try {
                    currentController = (ControllerView) controllerClass.newInstance();
                    addController(currentController);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }

            if (!isNext) {
                isNext = true;
            } else {
                accessHistory.add(currentController.getClass());
            }


            if (updatableFrame.contains(controllerClass) && exists) {
                currentController.refreshView();
            }

            Screen.initController(currentController, controllers);
        }
    }
    
    public static void addController(ControllerView controller) {
        controllers.add(controller);
    }
    
    public static void initBackPage() {
        isNext = false;
        accessHistory.remove(accessHistory.size() -1);
        initController(accessHistory.get(accessHistory.size()-1));
    }

    public static HashSet<ControllerView> getControllers() {
        return controllers;
    }
    
    public static void logoff() {
        for (ControllerView controller : controllers) {
            controller.getFrame().dispose();
        }
        controllers.clear();
        accessHistory.clear();
        
        Session.setAnime(null);
        Session.setEpisodio(null);
        Session.setUsuario(null);
        Routes.initController(ControllerLogin.class);
    }
}
