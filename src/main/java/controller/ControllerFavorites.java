package controller;

import conf.Util;
import daos.AnimeDAO;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;
import model.Anime;
import model.Usuario;
import view.ViewFavorites;

public class ControllerFavorites implements ControllerView {
    private ViewFavorites viewFavorites;

    public ControllerFavorites() {
        viewFavorites = new ViewFavorites();
        addVoltarLoginAction();
        addTablePopularAction();
        applyViewDefaults();
    }
    
    @Override
    public void refreshView() {
        viewFavorites.dispose();
        viewFavorites = new ViewFavorites();
        addVoltarLoginAction();
        addTablePopularAction();
        applyViewDefaults();
    }
    
    @Override
    public void showView() {
        Screen.fullScreen(viewFavorites);
    }
    
    @Override
    public void hideView() {
        Screen.visible(viewFavorites, false);
    }
    
    @Override
    public void applyViewDefaults() {
        HashMap<Point, Anime> animesIndex = new HashMap<Point, Anime>();
        viewFavorites.getJPcontainer().setPreferredSize(new Dimension(1000, 1400));
        
        AnimeDAO animeDAO = new AnimeDAO();
        ArrayList<Anime> animes = animeDAO.buscaTodosFavoritados();
        Collections.sort(animes);
        
        Usuario usuario = Session.getUsuario();
        viewFavorites.getJLnome().setText(usuario.getName());
        
        Util.setMultiLineTable(viewFavorites.getJTPopulares(), viewFavorites.getJScrollPane3(), animes, animesIndex);
        viewFavorites.setAnimesIndex(animesIndex);
    }
    
    @Override
    public JFrame getFrame() {
        return viewFavorites;
    }
    
    private void addVoltarLoginAction() {
        viewFavorites.jLVoltarMouseClicked(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Route.initBackPage();
            }
        });
    }
    
    private void addTablePopularAction() {
        viewFavorites.jTPopularesMouseClicked(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int col = viewFavorites.getJTPopulares().columnAtPoint(e.getPoint());
                int row = viewFavorites.getJTPopulares().rowAtPoint(e.getPoint());
                boolean localizado = false;
                for (Map.Entry<Point, model.Anime> entry : viewFavorites.getAnimesIndex().entrySet()) {
                    Point key = entry.getKey();
                    if (key.y == col && key.x == row) {
                        if (!entry.getValue().getNome().equals("empty")){
                            Session.setAnime(entry.getValue());
                            localizado = true;
                        }
                    }
                }
                if (localizado){
                    Route.initController(ControllerAnime.class);
                }
            }
        });
    }
}
