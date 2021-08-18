package conf;
/*
import com.kingaspx.util.BrowserUtil;
import com.kingaspx.version.Version;
import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.BrowserPreferences;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;
import java.awt.BorderLayout;*/
import java.awt.Dimension;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class JXBrowser {
    /*private Browser browser;
    private BrowserView view;
    private JPanel panelAuxiliar;*/
    
    public JXBrowser() {
        /*BrowserUtil.setVersion(Version.V6_22);
        BrowserPreferences.setChromiumSwitches("--disable-software-rasterizer", "--disable-web-security", "--allow-file-access-from-files");
        this.browser = new Browser();
        this.view = new BrowserView(browser);*/
    }
    /*
    public JPanel getPanelAuxiliar() {
        return panelAuxiliar;
    }
    
    public BrowserView getView() {
        return view;
    }*/
    
    public JInternalFrame openInternalFrame(String url, Dimension dimension) {
        /*JPanel panel = new JPanel(new BorderLayout());
        panel.add(this.view);
        panel.setPreferredSize(dimension);
        
        JInternalFrame frame = new JInternalFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setSize(dimension);
        frame.setVisible(true);
        
        browser.loadURL(url);
        panelAuxiliar = panel;
        return frame;*/
        return null;
    }
}
