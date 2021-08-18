package view;

import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ViewRegister extends javax.swing.JFrame {
    public ViewRegister() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLcadatro = new javax.swing.JLabel();
        jPpassword = new javax.swing.JPasswordField();
        jTemail = new javax.swing.JTextField();
        jTname = new javax.swing.JTextField();
        jLname = new javax.swing.JLabel();
        jLemail = new javax.swing.JLabel();
        jLpassword = new javax.swing.JLabel();
        jBcriarConta = new javax.swing.JButton();
        jLpossuiConta = new javax.swing.JLabel();
        jLlogin = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLcadatro.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLcadatro.setForeground(new java.awt.Color(255, 255, 255));
        jLcadatro.setText("Cadastre-se Gratuitamente");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(79, 82, 0, 0);
        getContentPane().add(jLcadatro, gridBagConstraints);

        jPpassword.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.ipadx = 441;
        gridBagConstraints.ipady = 17;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 82, 0, 96);
        getContentPane().add(jPpassword, gridBagConstraints);

        jTemail.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.ipadx = 441;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 82, 0, 96);
        getContentPane().add(jTemail, gridBagConstraints);

        jTname.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.ipadx = 441;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 82, 0, 96);
        getContentPane().add(jTname, gridBagConstraints);

        jLname.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLname.setForeground(new java.awt.Color(255, 255, 255));
        jLname.setText("Nome:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 82, 0, 0);
        getContentPane().add(jLname, gridBagConstraints);

        jLemail.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLemail.setForeground(new java.awt.Color(255, 255, 255));
        jLemail.setText("Email:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 82, 0, 0);
        getContentPane().add(jLemail, gridBagConstraints);

        jLpassword.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLpassword.setForeground(new java.awt.Color(255, 255, 255));
        jLpassword.setText("Senha:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 82, 0, 0);
        getContentPane().add(jLpassword, gridBagConstraints);

        jBcriarConta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jBcriarConta.setForeground(new java.awt.Color(255, 255, 255));
        jBcriarConta.setText("Criar Conta");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.ipadx = 380;
        gridBagConstraints.ipady = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 82, 0, 96);
        getContentPane().add(jBcriarConta, gridBagConstraints);

        jLpossuiConta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLpossuiConta.setForeground(new java.awt.Color(255, 255, 255));
        jLpossuiConta.setText("Já possui uma conta?");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 82, 41, 0);
        getContentPane().add(jLpossuiConta, gridBagConstraints);

        jLlogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLlogin.setForeground(new java.awt.Color(255, 255, 255));
        jLlogin.setText("Login!");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 6, 41, 0);
        getContentPane().add(jLlogin, gridBagConstraints);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/image/logoextenso.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(jLabel6, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void jBcriarContaActionPerformed(ActionListener acao){
        jBcriarConta.addActionListener(acao);
    }
    
    public void jLloginMouseClicked(MouseListener acao){
        jLlogin.addMouseListener(acao);
    }
    
    public JTextField getJTname() {
        return jTname;
    }
    
    public JTextField getJTemail() {
        return jTemail;
    }
    
    public JPasswordField getJPpassword() {
        return jPpassword;
    }
    
    public String getFullName() {
        return jTname.getText();
    }
    
    public String getEmail() {
        return jTemail.getText();
    }
    
    public String getPassword() {
        return jPpassword.getText();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBcriarConta;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLcadatro;
    private javax.swing.JLabel jLemail;
    private javax.swing.JLabel jLlogin;
    private javax.swing.JLabel jLname;
    private javax.swing.JLabel jLpassword;
    private javax.swing.JLabel jLpossuiConta;
    private javax.swing.JPasswordField jPpassword;
    private javax.swing.JTextField jTemail;
    private javax.swing.JTextField jTname;
    // End of variables declaration//GEN-END:variables
}