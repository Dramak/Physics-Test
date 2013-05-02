package game;

import graphics.GamePanel;

/**
 * User: hudsonw
 * Date: 01/05/13
 * Time: 11:24
 */
public class Game extends Thread{

    private GamePanel gameView;
    private boolean running;

    private final static int MAX_FPS = 50;
    private final static int MAX_FRAME_SKIPS = 5;
    private final static int FRAME_PERIOD = 1000 / MAX_FPS;


    long beginTime,timeDiff;
    int sleepTime,framesSkipped;

    public Game(GamePanel gameView) {
        this.gameView = gameView;
    }

    public void run() {
        super.run();
        running = true;
        while (running) {
            beginTime = System.currentTimeMillis();
            this.update(timeDiff);
            this.draw();
            timeDiff = System.currentTimeMillis() - beginTime;
            if(timeDiff == 0 ) timeDiff++;
            sleepTime = (int)(FRAME_PERIOD - timeDiff);

            if (sleepTime > 0) {
                try {
                    sleep(sleepTime);
                } catch (InterruptedException e) {}
            }
            while (sleepTime < 0 && framesSkipped < MAX_FRAME_SKIPS) {
                update(timeDiff);
                sleepTime += FRAME_PERIOD;
                framesSkipped ++;
            }

        }
    }
    public void draw() {
        gameView.repaint();
    }
    public void update(long deltaTime){

    }
}
