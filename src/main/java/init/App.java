package init;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialDeepOceanIJTheme;
import controller.ControllerLogin;
import controller.Route;
import daos.DataBase;
import javax.swing.UIManager;

public class App {
    public static void main(String[] args) {
        DataBase.init();
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
