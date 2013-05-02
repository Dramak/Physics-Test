import game.Game;
import graphics.GamePanel;

import javax.swing.*;
import java.awt.*;

/**
 * User: hudsonw
 * Date: 01/05/13
 * Time: 10:58
 */


public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Physics");
        GamePanel panel = new GamePanel();
        Game game = new Game(panel);
        panel.setPreferredSize(new Dimension(500,500));
        frame.add(panel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        game.run();
    }
}
