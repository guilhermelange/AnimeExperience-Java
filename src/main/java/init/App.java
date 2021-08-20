package init;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialDeepOceanIJTheme;
import controller.ControllerLogin;
import controller.Route;
import javax.swing.UIManager;

public class App {
    public static void main(String[] args) {
        appSetLookAndFeel();
        Route.initController(ControllerLogin.class);
    }
    
    private static void appSetLookAndFeel() {
        try {
            UIManager.setLookAndFeel(new FlatMaterialDeepOceanIJTheme());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
