package controller;

import com.teamdev.jxbrowser.browser.Browser;
import conf.JXBrowserV2;
import conf.Util;
import daos.DataBase;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import model.Anime;
import model.Episode;
import view.ViewVideoPlayer;

public class ControllerVideoPlayer implements ControllerView {
    private ViewVideoPlayer viewVideoPlayer;
    private Browser jxbrowser;

    public ControllerVideoPlayer() {
        viewVideoPlayer = new ViewVideoPlayer();
        addVoltarAction();
        applyViewDefaults();
    }
    
    @Override
    public void refreshView() {
        viewVideoPlayer.dispose();
        viewVideoPlayer = new ViewVideoPlayer();
        addVoltarAction();
        applyViewDefaults();
    }
    
    @Override
    public void showView() {
        Screen.fullScreen(viewVideoPlayer);
    }
    
    @Override
    public void hideView() {
        Screen.visible(viewVideoPlayer, false);
    }
    
    @Override
    public void applyViewDefaults() {
        Anime animeCarregado = DataBase.getAnimeCarregado();
        Episode episodioCarregado = DataBase.getEpisodioCarregado();
        
        // Campos na tela
        viewVideoPlayer.getJAnimeName().setText(animeCarregado.getNome());
        Util.applyTextAreaProperties(viewVideoPlayer.getJTextArea1(), viewVideoPlayer.getJScrollPane3());
        viewVideoPlayer.getJTextArea1().setText(episodioCarregado.getNumero() + " - " + episodioCarregado.getDescricao());
        
        // Browser
        jxbrowser = JXBrowserV2.openInternalFrame(viewVideoPlayer, viewVideoPlayer.getJInternalFrame1(), episodioCarregado.getLink(), new Dimension(800, 450));
    }
    
    @Override
    public JFrame getFrame() {
        return viewVideoPlayer;
    }
    
    private void addVoltarAction() {
        viewVideoPlayer.jVoltarMouseClicked(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (jxbrowser != null) {
                    jxbrowser.close();
                }
                Route.initBackPage();
            }
        });
    }
}
