package view;

import conf.Util;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ViewLogin extends javax.swing.JFrame {
    public ViewLogin() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPpassword = new javax.swing.JPasswordField();
        jTemail = new javax.swing.JTextField();
        jBlogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLCadastro = new javax.swing.JLabel();
        jLiniciarSessao = new javax.swing.JLabel();
        jLemail = new javax.swing.JLabel();
        jLpassword = new javax.swing.JLabel();
        jLlogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPpassword.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 11;
        gridBagConstraints.ipadx = 443;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 75, 0, 0);
        getContentPane().add(jPpassword, gridBagConstraints);

        jTemail.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTemail.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 11;
        gridBagConstraints.ipadx = 442;
        gridBagConstraints.ipady = 21;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 76, 0, 0);
        getContentPane().add(jTemail, gridBagConstraints);

        jBlogin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jBlogin.setForeground(new java.awt.Color(255, 255, 255));
        jBlogin.setText("Login");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 12;
        gridBagConstraints.ipadx = 432;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(22, 76, 0, 89);
        getContentPane().add(jBlogin, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ainda não possui uma conta?");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(26, 76, 17, 0);
        getContentPane().add(jLabel1, gridBagConstraints);

        jLCadastro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLCadastro.setForeground(new java.awt.Color(255, 255, 255));
        jLCadastro.setText("Cadastre-se aqui!");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(26, 6, 17, 0);
        getContentPane().add(jLCadastro, gridBagConstraints);

        jLiniciarSessao.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLiniciarSessao.setForeground(new java.awt.Color(255, 255, 255));
        jLiniciarSessao.setText("Iniciar Sessão");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(78, 76, 0, 0);
        getContentPane().add(jLiniciarSessao, gridBagConstraints);

        jLemail.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLemail.setForeground(new java.awt.Color(255, 255, 255));
        jLemail.setText("Email:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 76, 0, 0);
        getContentPane().add(jLemail, gridBagConstraints);

        jLpassword.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLpassword.setForeground(new java.awt.Color(255, 255, 255));
        jLpassword.setText("Senha:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 75, 0, 0);
        getContentPane().add(jLpassword, gridBagConstraints);

        jLlogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/image/logoextenso.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(jLlogo, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public JPasswordField getJPpassword() {
        return jPpassword;
    }
    
    public JTextField getJTemail() {
        return jTemail;
    }
    
    public String getEmail() {
        return jTemail.getText();
    }
    
    public String getPassword() {
        return jPpassword.getText();
    }
    
    public void jBloginActionPerformed(ActionListener acao){
        jBlogin.addActionListener(acao);
    }
    
    public void jLCadastroMouseClicked(MouseListener acao){
        jLCadastro.addMouseListener(acao);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBlogin;
    private javax.swing.JLabel jLCadastro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLemail;
    private javax.swing.JLabel jLiniciarSessao;
    private javax.swing.JLabel jLlogo;
    private javax.swing.JLabel jLpassword;
    private javax.swing.JPasswordField jPpassword;
    private javax.swing.JTextField jTemail;
    // End of variables declaration//GEN-END:variables
}
