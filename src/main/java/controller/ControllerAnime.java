package controller;

import com.teamdev.jxbrowser.browser.Browser;
import conf.JXBrowserV2;
import conf.Util;
import daos.DataBase;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Optional;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import model.Episode;
import model.PlayList;
import model.Season;
import model.User;
import view.ViewAnime;

public class ControllerAnime implements ControllerView {
    private ViewAnime viewAnime;
    private ArrayList<Episode> episodiosIndex;
    private model.Anime animeSessao;
    private Browser jxbrowser;

    public ControllerAnime() {
        viewAnime = new ViewAnime();
        addVoltarAction();
        addFavoritarAction();
        addTableAction();
        addSeasonAction();
        applyViewDefaults();
    }
    
    @Override
    public void refreshView() {
        viewAnime.dispose();
        viewAnime = new ViewAnime();
        addVoltarAction();
        addFavoritarAction();
        addTableAction();
        addSeasonAction();
        applyViewDefaults();
    }
    
    @Override
    public void showView() {
        Screen.fullScreen(viewAnime);
    }
    
    @Override
    public void hideView() {
        Screen.visible(viewAnime, false);
    }
    
    @Override
    public void applyViewDefaults() {
        viewAnime.getJPanel1().setPreferredSize(new Dimension(720, 1150));
        viewAnime.getJScrollPane2().setPreferredSize(new Dimension(400, 950));
        
        // Atualizar Usuário
        Optional<User> usuario = DataBase.getUsuarios()
                                              .stream()
                                              .filter(user -> user.isAuthenticate())
                                              .findFirst();
        viewAnime.getJLusuario().setText(usuario.get().getName());

        Util.applyTextAreaProperties(viewAnime.getJTextArea1(), viewAnime.getJScrollPane3());
        
        // Atualiza ViewAnime
        model.Anime animeCarregado = DataBase.getAnimeCarregado();
        this.animeSessao = animeCarregado;
        
        PlayList playlist = null;
        if (animeCarregado != null) {
            viewAnime.getJAnimeNome().setText(animeCarregado.getNome());
            viewAnime.getJTextArea1().setText(animeCarregado.getDescricao());
            Optional<PlayList> optionalPlay = animeCarregado.getPlaylists().stream().findFirst();
            if (!optionalPlay.isEmpty()) {
                playlist = optionalPlay.get();
            }
        }
        
        // Abre Player no Spotify
        if (playlist != null) {
            jxbrowser = JXBrowserV2.openInternalFrame(viewAnime, viewAnime.getJInternalFrame2(), playlist.getLink(), new Dimension(1260, 340));
            viewAnime.getJPanel3().setBorder(null);
        }
        ((BasicInternalFrameUI) viewAnime.getJInternalFrame2().getUI()).setNorthPane(null);
        viewAnime.getJInternalFrame2().setBorder(null);
        viewAnime.getJPanel3().setBorder(null);
        viewAnime.getJPanel2().setBorder(null);
        viewAnime.getJScrollPane2().setBorder(null);

        // Carrega Episodios;
        ArrayList<Season> temporadas = animeCarregado.getTemporadas();
        viewAnime.getJCtemporadas().removeAll();
        temporadas.forEach(temporada -> {
            viewAnime.getJCtemporadas().addItem(temporada);
            
        });
        updateEpisodios();
        
        // Icon Favorito
        String iconImage = (animeCarregado.isFavorito() ? "favoritoSet.png" : "favorito.png");
        Util.setIcon(viewAnime.getJLfavorito(), iconImage);
    }
    
    @Override
    public JFrame getFrame() {
        return viewAnime;
    }

    private void updateEpisodios() {
        viewAnime.getJTable1();
        viewAnime.getJTable1().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        viewAnime.getJTable1().setBorder(null);
        viewAnime.getJScrollPane1().setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        TableColumnModel columnModel = viewAnime.getJTable1().getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(140);
        columnModel.getColumn(1).setPreferredWidth(1200);
        columnModel.getColumn(0).setCellRenderer(Util.getNumberEpCellRender());
        columnModel.getColumn(1).setCellRenderer(Util.getDescriptionCellRender());
        viewAnime.getJScrollPane1().setPreferredSize(new Dimension(1340, 600));
        viewAnime.getJTable1().setRowHeight(40);
        
        DefaultTableModel dm = (DefaultTableModel) viewAnime.getJTable1().getModel();
        while (dm.getRowCount() > 0) {
            dm.removeRow(0);
        }

        Season tempSelected = (Season) viewAnime.getJCtemporadas().getSelectedItem();
        episodiosIndex = new ArrayList<Episode>();
        try {
            ArrayList<Episode> episodios = tempSelected.getEpisodios();
            for (int i = 0; i < episodios.size(); i++) {
                Episode episodio = episodios.get(i);
                ArrayList row = new ArrayList();
                episodiosIndex.add(i, episodio);
                row.add(episodio.getNumero());
                row.add(episodio.getDescricao());
                dm.addRow(row.toArray());
            }
        } catch (Exception e) {
        }
    }
    
    private void addVoltarAction() {
        viewAnime.jVoltarMouseClicked(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (jxbrowser != null) {
                    jxbrowser.close();
                }
                Route.initBackPage();
            }
        });
    }
    
    private void addFavoritarAction() {
        viewAnime.jLfavoritoMouseClicked(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (animeSessao.isFavorito()) {
                    animeSessao.setFavorito(false);
                    viewAnime.getJLfavorito().setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/image/favorito.png"))); // NOI18N
                } else {
                    animeSessao.setFavorito(true);
                    viewAnime.getJLfavorito().setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/image/favoritoSet.png")));
                }
            }
        });
    }
    
    private void addTableAction() {
        viewAnime.jTable1MouseClicked(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = viewAnime.getJTable1().rowAtPoint(e.getPoint());
                DataBase.setEpisodioCarregado(episodiosIndex.get(row));
                Route.initController(ControllerVideoPlayer.class);
            }
        });
    }
    
    private void addSeasonAction() {
        viewAnime.jCtemporadasActionPerformed(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateEpisodios();
            }
        });
    }
}
