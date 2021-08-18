package controller;

import javax.swing.JFrame;

public interface ControllerView {
    public void refreshView();
    
    public void showView();
    
    public void hideView();
    
    public void applyViewDefaults(); 
    
    public JFrame getFrame();
}
