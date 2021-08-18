package controller;

import conf.Util;
import daos.DataBase;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Stream;
import javax.swing.JFrame;
import model.Anime;
import model.User;
import view.ViewHome;

public class ControllerHome implements ControllerView {
    private ViewHome viewHome;

    public ControllerHome() {
        viewHome = new ViewHome();
        addFavoritesAction();
        addTableNewAction();
        addTablePopularAction();
        applyViewDefaults();
    }
    
    @Override
    public void refreshView() {
        viewHome.dispose();
        viewHome = new ViewHome();
        addFavoritesAction();
        addTableNewAction();
        addTablePopularAction();
        applyViewDefaults();
    }
    
    @Override
    public void showView() {
        Screen.fullScreen(viewHome);
    }
    
    @Override
    public void hideView() {
        Screen.visible(viewHome, false);
    }
    
    @Override
    public void applyViewDefaults() {
        HashMap<Point, model.Anime> animesIndex = new HashMap<Point, Anime>();
        viewHome.setAnimesIndex(animesIndex);
        viewHome.getJPcontainer().setPreferredSize(new Dimension(720, 1400));
        ArrayList<Anime> animes = DataBase.getAnimes();
        animes.sort(new Comparator<Anime>(){
            Random random = new Random();
            @Override
            public int compare(Anime o1, Anime o2) {
                return Integer.compare(random.nextInt(), random.nextInt());
            }
        });
        
        Optional<User> findFirst = DataBase.getUsuarios()
                                              .stream()
                                              .filter(user -> user.isAuthenticate())
                                              .findFirst();
        viewHome.getJLnome().setText(findFirst.get().getName());
        
        Stream<Anime> filter = animes.stream().filter(anime -> anime.getIndex() == 1);
        Util.setOneLineTable(viewHome.getJTnovos(), 1, viewHome.getJScrollPane1(), filter, animesIndex);
        
        filter = animes.stream().filter(anime -> anime.getIndex() == 0);
        Util.setOneLineTable(viewHome.getJTPopulares(), 0, viewHome.getJScrollPane3(), filter, animesIndex);
    }
    
    @Override
    public JFrame getFrame() {
        return viewHome;
    }
    
    
    private void addFavoritesAction() {
        viewHome.jLfavoritosMouseClicked(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Route.initController(ControllerFavorites.class);
            }
        });
    }
    
    private void addTableNewAction() {
        viewHome.jTnovosMouseClicked(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int col = viewHome.getJTnovos().columnAtPoint(e.getPoint());
                for (Map.Entry<Point, model.Anime> entry : viewHome.getAnimesIndex().entrySet()) {
                    Point key = entry.getKey();
                    if (key.y == col && key.x == 1) {
                        DataBase.setAnimeCarregado(entry.getValue());
                    }
                }
                Route.initController(ControllerAnime.class);
            }
        });
    }
    
    private void addTablePopularAction() {
        viewHome.jTPopularesMouseClicked(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int col = viewHome.getJTPopulares().columnAtPoint(e.getPoint());
                for (Map.Entry<Point, model.Anime> entry : viewHome.getAnimesIndex().entrySet()) {
                    Point key = entry.getKey();
                    if (key.y == col && key.x == 0) {
                        DataBase.setAnimeCarregado(entry.getValue());
                    }
                }
                Route.initController(ControllerAnime.class);
            }
        });
    }
}
