package view;

import conf.Util;
import daos.DataBase;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Optional;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import model.Anime;
import model.User;

public class ViewFavorites extends javax.swing.JFrame {
    public HashMap<Point, Anime> animesIndex = new HashMap<Point, Anime>();
    public ViewFavorites() {
        initComponents();
        jPcontainer.setPreferredSize(new Dimension(1000, 1400));
        ArrayList<Anime> animes = DataBase.getAnimes();
        Collections.sort(animes);
        
        Optional<User> usuario = DataBase.getUsuarios()
                                            .stream()
                                            .filter(user -> user.isAuthenticate())
                                            .findFirst();
        jLnome.setText(usuario.get().getName());
        
        Util.setMultiLineTable(jTPopulares, jScrollPane3, animes, animesIndex);
        
    }

    public HashMap<Point, Anime> getAnimesIndex() {
        return animesIndex;
    }

    public void setAnimesIndex(HashMap<Point, Anime> animesIndex) {
        this.animesIndex = animesIndex;
    }
    
    public JPanel getJPcontainer(){
        return jPcontainer;
    }
    
    public JLabel getJLnome() {
        return jLnome;
    }
    
    public JTable getJTPopulares() {
        return jTPopulares;
    }
    
    public JScrollPane getJScrollPane3() {
        return jScrollPane3;
    }
    
    public void jLVoltarMouseClicked(MouseListener acao){
        jLVoltar.addMouseListener(acao);
    }
    
    public void jTPopularesMouseClicked(MouseListener acao){
        jTPopulares.addMouseListener(acao);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPcontainer = new javax.swing.JPanel();
        jLnome = new javax.swing.JLabel();
        jLpopulares = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTPopulares = new javax.swing.JTable();
        jLlogo1 = new javax.swing.JLabel();
        jLVoltar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jLnome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLnome.setForeground(new java.awt.Color(255, 255, 255));
        jLnome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/image/user.png"))); // NOI18N
        jLnome.setText("Guilherme");

        jLpopulares.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLpopulares.setForeground(new java.awt.Color(255, 255, 255));
        jLpopulares.setText("Títulos Favoritados");

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTPopulares.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTPopulares.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTPopulares.setAutoscrolls(false);
        jTPopulares.setRowHeight(240);
        jTPopulares.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTPopulares.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTPopulares.getTableHeader().setResizingAllowed(false);
        jTPopulares.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(jTPopulares);

        jLlogo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/image/logo.png"))); // NOI18N

        jLVoltar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLVoltar.setForeground(new java.awt.Color(255, 255, 255));
        jLVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/image/seta.png"))); // NOI18N
        jLVoltar.setText("Voltar");
        jLVoltar.setToolTipText("");

        javax.swing.GroupLayout jPcontainerLayout = new javax.swing.GroupLayout(jPcontainer);
        jPcontainer.setLayout(jPcontainerLayout);
        jPcontainerLayout.setHorizontalGroup(
            jPcontainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPcontainerLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPcontainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPcontainerLayout.createSequentialGroup()
                        .addComponent(jLpopulares)
                        .addGap(0, 631, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPcontainerLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLlogo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLVoltar)
                .addGap(76, 76, 76)
                .addComponent(jLnome)
                .addGap(58, 58, 58))
        );
        jPcontainerLayout.setVerticalGroup(
            jPcontainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPcontainerLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPcontainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPcontainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLnome)
                        .addComponent(jLVoltar))
                    .addComponent(jLlogo1))
                .addGap(35, 35, 35)
                .addComponent(jLpopulares)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane2.setViewportView(jPcontainer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(42, 42, 42))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 728, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 785, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLVoltar;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLlogo1;
    private javax.swing.JLabel jLnome;
    private javax.swing.JLabel jLpopulares;
    private javax.swing.JPanel jPcontainer;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTPopulares;
    // End of variables declaration//GEN-END:variables
}
