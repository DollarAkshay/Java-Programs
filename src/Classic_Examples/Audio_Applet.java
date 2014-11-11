package Classic_Examples;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.AudioClip;
import javax.swing.JApplet;

/**
 *
 * @author $Akshay$
 */
public class Audio_Applet extends JApplet {
AudioClip ac;
 
    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    @Override
    public void init() {
        setSize(600,400);
       ac = getAudioClip(getCodeBase(), "TestSnd.wav");
       ac.loop();
       // TODO start asynchronous download of heavy resources
    }
    // TODO overwrite start(), stop() and destroy() methods
}
