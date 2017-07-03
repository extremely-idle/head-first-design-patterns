package applet;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by ross.moug on 03/07/2017.
 */
public class MyApplet extends Applet {
    private String message;

    public void init() {
        message = "Hello World, I'm alive!";
        repaint();
    }

    public void start() {
        message = "Now I'm starting up...";
        repaint();
    }

    public void stop() {
        message = "Oh, now I'm being stopped...";
        repaint();
    }

    public void destroy() {
        // applt is going away...
    }

    public void paint(Graphics g) {
        g.drawString(message, 5, 15);
    }
}
