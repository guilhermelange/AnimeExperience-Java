package conf;

import com.teamdev.jxbrowser.browser.Browser;
import com.teamdev.jxbrowser.engine.Engine;
import com.teamdev.jxbrowser.engine.EngineOptions;
import com.teamdev.jxbrowser.engine.ProprietaryFeature;
import com.teamdev.jxbrowser.engine.RenderingMode;
import com.teamdev.jxbrowser.view.swing.BrowserView;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class JXBrowser {
        
    public static Browser openInternalFrame(JFrame currentFrame,
                                  JInternalFrame embedFrame, 
                                  String url, 
                                  Dimension dimension) {
        System.setProperty("jxbrowser.license.key", "1BNDHFSC1FZZQVZ0G4D3TRQXPQCKBT3AZ78SNXJ8FDG1ZFLBIHKTGLQC9GGWB666XIVIWW");
        Engine engine = Engine.newInstance(
                EngineOptions.newBuilder(RenderingMode.HARDWARE_ACCELERATED)
                .enableProprietaryFeature(ProprietaryFeature.AAC)
                .enableProprietaryFeature(ProprietaryFeature.H_264)
                .build());
        
        Browser browser = engine.newBrowser();
        
        SwingUtilities.invokeLater(() -> {
            currentFrame.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    engine.close();
                }
            });

            JPanel panel = new JPanel(new BorderLayout());
            panel.add(BrowserView.newInstance(browser));
            panel.setSize(dimension);
            panel.setBorder(null);

            embedFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            embedFrame.add(panel);
            embedFrame.setPreferredSize(dimension);
            embedFrame.setVisible(true);
            embedFrame.setBorder(null);
            ((BasicInternalFrameUI) embedFrame.getUI()).setNorthPane(null);

            // Load the required web page.
            browser.navigation().loadUrl(url);
        });
        
        return browser;
    }
}
