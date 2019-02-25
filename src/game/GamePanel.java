package game;

import tklibs.SpriteUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

// class dung de thao tac voi game
public class GamePanel extends JPanel {

    Background background;
    Player player;
    Enemy enemy;
    //enemy
    public GamePanel()
    {
        player = new Player();
        background = new Background();
        enemy = new Enemy();
        //bulletPosition.add() // them phan tu vao mang
        //bulletPosition.get()//lay ra phan tu o vi tri cu the
        //bulletPosition.size()//lay ra kich thuoc cua mang
    }
    @Override
    public void paint(Graphics g) {
       // g.drawRect(0,0,100,100);
        // load ảnh
        background.render(g);
        player.render(g);
        enemy.render(g);
        // ve anh
    }

    public void GameLoop()
    {
        long lastTime = 0;
        long delay = 1000/60;
        while(true)
        {
            long currentTime = System.currentTimeMillis();
            if(currentTime - lastTime >= delay )
            {
                //ve anh + chay logic
                runAll();
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
        background.run();
        player.run();
        enemy.run();
        //System.out.println(BackgroundY);
    }





    //gioi han di chuyen cho backfround
    // gioi han di chuyen cho background

}
