package view;

import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import model.Anime;
import model.Episodio;
import model.Colecao;

public class ViewAnime extends javax.swing.JFrame {
    private ArrayList<Episodio> episodiosIndex;
    private model.Anime animeSessao;

    public ViewAnime() {
        initComponents();
    }

    public JPanel getJPanel1() {
        return jPanel1;
    }
    
    public JScrollPane getJScrollPane2() {
        return jScrollPane2;
    }
    
    public JLabel getJLusuario() {
        return jLusuario;
    }
    
    public JTextArea getJTextArea1() {
        return jTextArea1;
    }
    
    public JScrollPane getJScrollPane3() {
        return jScrollPane3;
    }
    
    public JScrollPane getJScrollPane1() {
        return jScrollPane1;
    }
    
    public JLabel getJAnimeNome() {
        return jAnimeNome;
    }
    
    public JInternalFrame getJInternalFrame2() {
        return jInternalFrame2;
    }
    
    public JPanel getJPanel3() {
        return jPanel3;
    }
    
    public JPanel getJPanel2() {
        return jPanel2;
    }

    public JComboBox<Colecao> getJCtemporadas() {
        return jCtemporadas;
    }
    
    public JTable getJTable1() {
        return jTable1;
    }
    
    public JLabel getJLfavorito() {
        return jLfavorito;
    }
    
    public JLabel getJLqtdTemporada() {
        return jLqtdTemporada;
    }
    
    public JLabel getJLclassiInd() {
        return JLclassiInd;
    }
    
    public JLabel getJLanocriacao() {
        return jLanocriacao;
    }
    
    public JLabel getJLestrela1() {
        return jLestrela1;
    }
    
    public JLabel getJLestrela2() {
        return jLestrela2;
    }
    
    public JLabel getJLestrela3() {
        return jLestrela3;
    }
    
    public JLabel getJLestrela4() {
        return jLestrela4;
    }
    
    public JLabel getJLestrela5() {
        return jLestrela5;
    }
    
    public JLabel getJLavaliacaogeral() {
        return jLavaliacaogeral;
    }
    
    public void setAnimeSessao(Anime animeSessao) {
        this.animeSessao = animeSessao;
    }
    
    public void jVoltarMouseClicked(MouseListener acao) {                                     
        jVoltar.addMouseListener(acao);
    }
    
    public void jLfavoritoMouseClicked(MouseListener acao) {                                     
        jLfavorito.addMouseListener(acao);
    }
    
    public void jTable1MouseClicked(MouseListener acao) {                                     
        jTable1.addMouseListener(acao);
    }
    
    public void jLestrela1MouseEntered(MouseListener acao) {                                     
        jLestrela1.addMouseListener(acao);
    }
    
    public void jLestrela2MouseEntered(MouseListener acao) {                                     
        jLestrela2.addMouseListener(acao);
    }
    
    public void jLestrela3MouseEntered(MouseListener acao) {                                     
        jLestrela3.addMouseListener(acao);
    }
    
    public void jLestrela4MouseEntered(MouseListener acao) {                                     
        jLestrela4.addMouseListener(acao);
    }
    
    public void jLestrela5MouseEntered(MouseListener acao) {                                     
        jLestrela5.addMouseListener(acao);
    }
    
    public void jCtemporadasActionPerformed(ActionListener acao) {                                             
        jCtemporadas.addActionListener(acao);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLusuario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLlogo1 = new javax.swing.JLabel();
        jVoltar = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jCtemporadas = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        jAnimeNome = new javax.swing.JLabel();
        jLfavorito = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        JLclassiInd = new javax.swing.JLabel();
        jLanocriacao = new javax.swing.JLabel();
        jLqtdTemporada = new javax.swing.JLabel();
        jLestrela1 = new javax.swing.JLabel();
        jLestrela2 = new javax.swing.JLabel();
        jLestrela3 = new javax.swing.JLabel();
        jLestrela4 = new javax.swing.JLabel();
        jLestrela5 = new javax.swing.JLabel();
        jLavaliacaogeral = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jLusuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLusuario.setForeground(new java.awt.Color(255, 255, 255));
        jLusuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/image/user.png"))); // NOI18N
        jLusuario.setText("Guilherme");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/image/logo.png"))); // NOI18N

        jLlogo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/image/logo.png"))); // NOI18N

        jVoltar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jVoltar.setForeground(new java.awt.Color(255, 255, 255));
        jVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/image/seta.png"))); // NOI18N
        jVoltar.setText("Voltar");

        jTabbedPane1.setToolTipText("");
        jTabbedPane1.setOpaque(true);

        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jCtemporadas.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jCtemporadas.setForeground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(1340, 402));

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Episódio", "Descrição"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setColumnSelectionAllowed(true);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jCtemporadas, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCtemporadas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(376, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("EPISÓDIOS", jPanel2);

        jPanel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jInternalFrame2.setVisible(true);

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 635, Short.MAX_VALUE)
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jInternalFrame2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jInternalFrame2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("TRILHA SONORA", jPanel3);

        jAnimeNome.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jAnimeNome.setForeground(new java.awt.Color(255, 255, 255));
        jAnimeNome.setText("Nome do Anime");

        jLfavorito.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLfavorito.setForeground(new java.awt.Color(255, 255, 255));
        jLfavorito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/image/favorito.png"))); // NOI18N

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(3);
        jScrollPane3.setViewportView(jTextArea1);

        JLclassiInd.setForeground(new java.awt.Color(255, 255, 255));
        JLclassiInd.setText("ClassInd");

        jLanocriacao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLanocriacao.setForeground(new java.awt.Color(255, 255, 255));
        jLanocriacao.setText("AnoCriacao");

        jLqtdTemporada.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLqtdTemporada.setForeground(new java.awt.Color(255, 255, 255));
        jLqtdTemporada.setText("qtdTemporadas");

        jLestrela1.setForeground(new java.awt.Color(255, 255, 255));
        jLestrela1.setText("e1");

        jLestrela2.setForeground(new java.awt.Color(255, 255, 255));
        jLestrela2.setText("e2");

        jLestrela3.setForeground(new java.awt.Color(255, 255, 255));
        jLestrela3.setText("e3");

        jLestrela4.setForeground(new java.awt.Color(255, 255, 255));
        jLestrela4.setText("e4");

        jLestrela5.setForeground(new java.awt.Color(255, 255, 255));
        jLestrela5.setText("e5");

        jLavaliacaogeral.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLavaliacaogeral.setForeground(new java.awt.Color(255, 255, 255));
        jLavaliacaogeral.setText("avaliacao");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLestrela1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLestrela2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLestrela3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLestrela4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLestrela5)
                        .addGap(18, 18, 18)
                        .addComponent(jLavaliacaogeral)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTabbedPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane3)
                                .addGap(151, 151, 151)
                                .addComponent(jLfavorito))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jAnimeNome)
                                            .addComponent(jLlogo1))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jVoltar)
                                        .addGap(40, 40, 40))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLqtdTemporada)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLusuario)
                                        .addGap(43, 43, 43))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLanocriacao)
                                        .addGap(28, 28, 28)
                                        .addComponent(JLclassiInd)))))
                        .addGap(58, 58, 58))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLusuario)
                        .addComponent(jVoltar))
                    .addComponent(jLlogo1))
                .addGap(44, 44, 44)
                .addComponent(jAnimeNome)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLfavorito)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLqtdTemporada)
                    .addComponent(jLanocriacao, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(JLclassiInd)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLestrela1)
                    .addComponent(jLestrela2)
                    .addComponent(jLestrela3)
                    .addComponent(jLestrela4)
                    .addComponent(jLestrela5)
                    .addComponent(jLavaliacaogeral, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("tab1");

        jScrollPane2.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 694, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(42, 42, 42))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 801, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLclassiInd;
    private javax.swing.JLabel jAnimeNome;
    private javax.swing.JComboBox<model.Colecao> jCtemporadas;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLanocriacao;
    private javax.swing.JLabel jLavaliacaogeral;
    private javax.swing.JLabel jLestrela1;
    private javax.swing.JLabel jLestrela2;
    private javax.swing.JLabel jLestrela3;
    private javax.swing.JLabel jLestrela4;
    private javax.swing.JLabel jLestrela5;
    private javax.swing.JLabel jLfavorito;
    private javax.swing.JLabel jLlogo1;
    private javax.swing.JLabel jLqtdTemporada;
    private javax.swing.JLabel jLusuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel jVoltar;
    // End of variables declaration//GEN-END:variables
}
