package controller;

import conf.Util;
import daos.DataBase;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import model.User;
import view.ViewRegister;

public class ControllerRegister implements ControllerView {
    private ViewRegister viewRegister;

    public ControllerRegister() {
        viewRegister = new ViewRegister();
        addRegisterAction();
        addLoginAction();
        applyViewDefaults();
    }
    
    @Override
    public void refreshView() {
        viewRegister.dispose();
        viewRegister = new ViewRegister();
        addRegisterAction();
        addLoginAction();
        applyViewDefaults();
    }
    
    @Override
    public void showView() {
        Screen.fullScreen(viewRegister);
    }
    
    @Override
    public void hideView() {
        Screen.visible(viewRegister, false);
    }
    
    @Override
    public void applyViewDefaults() {
        Util.applyPlaceholder(viewRegister.getJTemail(), "exemplo@dominio.com");
        Util.preventSize(viewRegister.getJTname());
        Util.preventSize(viewRegister.getJPpassword());
    }
    
    @Override
    public JFrame getFrame() {
        return viewRegister;
    }
    
    private void addRegisterAction() {
        viewRegister.jBcriarContaActionPerformed(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Util.verifyIsNotEmpty(viewRegister.getJTname(), "É obrigatório informar um nome de usuário")) {
                     if (Util.verifyEmailIsValid(viewRegister.getJTemail(), "Email inválido")) {
                         if (Util.verifyIsNotEmpty(viewRegister.getJPpassword(), "É obrigatório informar uma senha")) {
                             User newUser = new User(viewRegister.getEmail(), viewRegister.getPassword(), viewRegister.getFullName());
                             boolean addUsuario = DataBase.addUsuario(newUser);
                             if (addUsuario) {
                                 Util.message("Usuário inserido com sucesso!");
                                 Route.initController(ControllerLogin.class);
                             } else {
                                 Util.message("Usuário já cadastrado!");
                             }
                         }
                     }
                 } 
            }
        });
    }
    
    private void addLoginAction() {
        viewRegister.jLloginMouseClicked(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Route.initController(ControllerLogin.class);
            }
        });
    }
}
