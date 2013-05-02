package game;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;

/**
 * User: hudsonw
 * Date: 01/05/13
 * Time: 11:24
 */
public class Game extends Thread {

    private BufferStrategy strategy;
    private JFrame frame;
    private boolean running;

    private final static int MAX_FPS = 50;
    private final static int MAX_FRAME_SKIPS = 5;
    private final static int FRAME_PERIOD = 1000 / MAX_FPS;

    long beginTime, timeDiff;
    int sleepTime, framesSkipped;

    public Game(JFrame gameView) {
        this.frame = gameView;
        this.strategy = gameView.getBufferStrategy();
    }

    public void run() {
        super.run();
        running = true;
        while (running) {
            beginTime = System.currentTimeMillis();
            this.update(timeDiff);

            do {
                do {
                    this.draw();
                } while (strategy.contentsRestored());
                strategy.show();
            } while (strategy.contentsLost());

            timeDiff = System.currentTimeMillis() - beginTime;
            if (timeDiff == 0) timeDiff++;
            sleepTime = (int) (FRAME_PERIOD - timeDiff);

            if (sleepTime > 0) {
                try {
                    sleep(sleepTime);
                } catch (InterruptedException e) {
                }
            }
            while (sleepTime < 0 && framesSkipped < MAX_FRAME_SKIPS) {
                update(timeDiff);
                sleepTime += FRAME_PERIOD;
                framesSkipped++;
            }
        }
    }

    public void draw() {
        Graphics g = strategy.getDrawGraphics();
        g.setColor(Color.darkGray);
        g.fillRect(0, 0, frame.getWidth(), frame.getHeight());
        g.setColor(Color.LIGHT_GRAY);
        g.dispose();
    }

    public void update(long deltaTime) {

    }
}
