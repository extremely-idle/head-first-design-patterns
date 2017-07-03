package swing;

import javax.swing.*;
import java.awt.*;

/**
 * Created by ross.moug on 03/07/2017.
 */
public class MyFrame extends JFrame {

    public MyFrame(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(300, 300);
        this.setVisible(true);
    }

    public void paint(Graphics graphics) {
        super.paint(graphics);
        final String msg = "I rule!!";
        graphics.drawString(msg, 100, 100);
    }

    public static void main(String[] args) {
        final MyFrame frame = new MyFrame("Head First Design Patterns");
    }
}
