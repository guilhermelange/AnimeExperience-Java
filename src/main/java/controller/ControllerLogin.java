package controller;

import conf.Util;
import exceptions.NotFoundException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import model.Authenticate;
import model.User;
import view.ViewLogin;

public class ControllerLogin implements ControllerView {
    private ViewLogin viewLogin;

    public ControllerLogin() {
        viewLogin = new ViewLogin();
        addRegisterAction();
        addLoginAction();
        applyViewDefaults();
    }
    
    @Override
    public void refreshView() {
        viewLogin.dispose();
        viewLogin = new ViewLogin();
        addRegisterAction();
        addLoginAction();
        applyViewDefaults();
    }
    
    @Override
    public void showView() {
        Screen.fullScreen(viewLogin);
    }
    
    @Override
    public void hideView() {
        Screen.visible(viewLogin, false);
    }
    
    @Override
    public void applyViewDefaults() {
        Util.applyPlaceholder(viewLogin.getJTemail(), "exemplo@dominio.com");
        Util.preventSize(viewLogin.getJPpassword());
    }
    
    @Override
    public JFrame getFrame() {
        return viewLogin;
    }
    
    private void addRegisterAction() {
        viewLogin.jLCadastroMouseClicked(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Route.initController(ControllerRegister.class);
            }
        });
    }
    
    private void addLoginAction() {
        viewLogin.jBloginActionPerformed(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = viewLogin.getEmail();
                String password = viewLogin.getPassword();
                Authenticate user = new User(email, password, "");
                try {
                    user.authenticate();
                    Route.initController(ControllerHome.class);
                } catch (NotFoundException ex) {
                    Util.message("Algo está incorreto, tente novamente!");
                }
            }
        });
    }
}
