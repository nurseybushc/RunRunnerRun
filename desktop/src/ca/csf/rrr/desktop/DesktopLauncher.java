package ca.csf.rrr.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import ca.csf.rrr.RunRunnerRunGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.title = "Run Runner Run";
        config.width = 272;
        config.height = 408;
		new LwjglApplication(new RunRunnerRunGame(), config);
	}
}
