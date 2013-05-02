import game.Game;

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
        frame.setVisible(true);
        frame.createBufferStrategy(2);
        Game game = new Game(frame);
        frame.setPreferredSize(new Dimension(500,500));
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        game.run();
    }
}
