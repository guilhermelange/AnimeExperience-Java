package controller;

import java.util.HashSet;
import javax.swing.JFrame;

public class Screen {
    public static void init(JFrame ... frames ) {
        for (int i = 0; i < frames.length; i++) {
            if (i == 0) {
                Screen.fullScreen(frames[i]);
                Screen.visible(frames[i], true);
            } else {
                Screen.visible(frames[i], false);
            }
        }
    }
    
     public static void init(JFrame frame,  HashSet<JFrame> frames) {
        fullScreen(frame);
        frames.stream()
              .filter(jFrame -> jFrame != frame)
              .forEach(jFrame -> visible(jFrame, false));
    }
     
    public static void initController(ControllerView controller, HashSet<ControllerView> controllers) {
        fullScreen(controller.getFrame());
        controllers.stream()
              .filter(controllerView -> controller.getFrame().getClass() != controllerView.getFrame().getClass())
              .forEach(controllerView -> visible(controllerView.getFrame(), false));
        
    }
    
    public static void fullScreen(JFrame frame) {
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        visible(frame, true);
    }
    
    public static void visible(JFrame frame, boolean bool) {
        frame.setVisible(bool);
    }
}
