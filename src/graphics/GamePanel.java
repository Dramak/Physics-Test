package graphics;

import javax.swing.*;
import java.awt.*;
import java.util.Iterator;
import java.util.Vector;

/**
 * User: hudsonw
 * Date: 01/05/13
 * Time: 11:15
 */
public class GamePanel extends JPanel {

    public GamePanel() {
        super();
    }

    public void paintComponent(Graphics g) {
        g.setColor(Color.darkGray);
        g.fillRect(0,0,getWidth(),getHeight());
        g.setColor(Color.LIGHT_GRAY);

    }
}
