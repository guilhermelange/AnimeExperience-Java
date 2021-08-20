package view;

import java.awt.Point;
import java.awt.event.MouseListener;
import java.util.HashMap;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import model.Anime;

public class ViewHome extends javax.swing.JFrame {
    private HashMap<Point, model.Anime> animesIndex;
    public ViewHome() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPcontainer = new javax.swing.JPanel();
        jLfavoritos = new javax.swing.JLabel();
        jLnome = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTnovos = new javax.swing.JTable();
        jLogo2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLpopulares = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTPopulares = new javax.swing.JTable();
        jLadicionados = new javax.swing.JLabel();
        jLlogo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jLfavoritos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLfavoritos.setForeground(new java.awt.Color(255, 255, 255));
        jLfavoritos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/image/favorito.png"))); // NOI18N
        jLfavoritos.setText("Favoritos");

        jLnome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLnome.setForeground(new java.awt.Color(255, 255, 255));
        jLnome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/image/user.png"))); // NOI18N
        jLnome.setText("Guilherme");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTnovos.setModel(new javax.swing.table.DefaultTableModel(
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
        jTnovos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTnovos.setAutoscrolls(false);
        jTnovos.setRowHeight(240);
        jTnovos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTnovos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTnovos.getTableHeader().setResizingAllowed(false);
        jTnovos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTnovos);

        jLogo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/image/logo.png"))); // NOI18N

        jLpopulares.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLpopulares.setForeground(new java.awt.Color(255, 255, 255));
        jLpopulares.setText("Populares");

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

        jLadicionados.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLadicionados.setForeground(new java.awt.Color(255, 255, 255));
        jLadicionados.setText("Adicionados Recentemente");

        jLlogo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/image/logo.png"))); // NOI18N

        javax.swing.GroupLayout jPcontainerLayout = new javax.swing.GroupLayout(jPcontainer);
        jPcontainer.setLayout(jPcontainerLayout);
        jPcontainerLayout.setHorizontalGroup(
            jPcontainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPcontainerLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPcontainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)
                    .addGroup(jPcontainerLayout.createSequentialGroup()
                        .addGroup(jPcontainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLadicionados)
                            .addComponent(jLpopulares))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPcontainerLayout.createSequentialGroup()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPcontainerLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLlogo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLfavoritos)
                .addGap(94, 94, 94)
                .addComponent(jLnome)
                .addGap(58, 58, 58))
            .addGroup(jPcontainerLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLogo2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPcontainerLayout.setVerticalGroup(
            jPcontainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPcontainerLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPcontainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPcontainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLfavoritos)
                        .addComponent(jLnome))
                    .addComponent(jLlogo1))
                .addGap(35, 35, 35)
                .addComponent(jLpopulares)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jLadicionados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLogo2)
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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1015, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public HashMap<Point, Anime> getAnimesIndex() {
        return animesIndex;
    }

    public void setAnimesIndex(HashMap<Point, Anime> animesIndex) {
        this.animesIndex = animesIndex;
    }
    
    public JPanel getJPcontainer() {
        return jPcontainer;
    }
    
    public JLabel getJLnome() {
        return jLnome;
    }
    
    public JTable getJTnovos() {
        return jTnovos;
    }
    
    public JScrollPane getJScrollPane1() {
        return jScrollPane1;
    }
    
    public JTable getJTPopulares() {
        return jTPopulares;
    }
    
    public JScrollPane getJScrollPane3() {
        return jScrollPane3;
    }
    
    public void jLfavoritosMouseClicked(MouseListener acao){
        jLfavoritos.addMouseListener(acao);
    }
    
    public void jTPopularesMouseClicked(MouseListener acao){
        jTPopulares.addMouseListener(acao);
    }
    
    public void jTnovosMouseClicked(MouseListener acao){
        jTnovos.addMouseListener(acao);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLadicionados;
    private javax.swing.JLabel jLfavoritos;
    private javax.swing.JLabel jLlogo1;
    private javax.swing.JLabel jLnome;
    private javax.swing.JLabel jLogo2;
    private javax.swing.JLabel jLpopulares;
    private javax.swing.JPanel jPcontainer;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTPopulares;
    private javax.swing.JTable jTnovos;
    // End of variables declaration//GEN-END:variables
}
