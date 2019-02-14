package game;

import tklibs.SpriteUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
// class dung de thao tac voi game
public class GamePanel extends JPanel {

    BufferedImage backgroundImage;
    BufferedImage playerImage;
    int BackgroundX;
    int BackgroundY;
    int playerX;
    int playerY;
    public GamePanel()
    {
        backgroundImage = SpriteUtils.loadImage("assets/images/background/0.png");
        playerImage = SpriteUtils.loadImage("assets/images/players/straight/0.png");
        BackgroundX = 0;
        BackgroundY = 600 - 3109;
        playerX = 200;
        playerY = 500;
    }
    @Override
    public void paint(Graphics g) {
       // g.drawRect(0,0,100,100);
        // load ảnh
        g.drawImage(backgroundImage,BackgroundX,BackgroundY,null);
        g.drawImage(playerImage,playerX,playerY,null);
        // ve anh
    }

    public void GameLoop()
    {
        long lastTime = 0;
        long delay = 500/60;
        while(true)
        {
            long currentTime = System.currentTimeMillis();
            if(currentTime - lastTime >= delay )
            {
                //ve anh + chay logic
                runAll();
//                if(BackgroundY == 0)
//                {
//                    break;
//                }
                renderAll();//ve tat ca anh trong game
                lastTime = currentTime;
            }
        }
    }

    private void renderAll()
    {
        repaint();
    }

    private void runAll()
    {
//        if(BackgroundY < 0 )
//        {
//            BackgroundY += 1;
//        }
        //System.out.println(BackgroundY);
        if(GameWindow.isUpPress && playerY > 0 ) {
            playerY--;
            System.out.println(playerY);
        }
        if(GameWindow.isDownPress && playerY <530)
        {
            playerY++;
        }
        if(GameWindow.isRightPress&& playerX <352) // 384 - 32
        {
            playerX++;
        }
        if(GameWindow.isLeftPress && playerX > 0)
        {
            playerX--;
        }
    }
    //gioi han di chuyen cho backfround
    // gioi han di chuyen cho background

}
