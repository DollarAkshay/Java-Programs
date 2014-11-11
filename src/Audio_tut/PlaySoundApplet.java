package Audio_tut;

import java.applet.*;
import java.awt.*;

public class PlaySoundApplet extends Applet {
	Button play,stop;
	AudioClip audioClip;

	public void init(){

		audioClip = getAudioClip(getCodeBase(), "TestSnd.wav");
                audioClip.loop();
	}
	

}