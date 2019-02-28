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

        background = new Background();
        player = new Player();
        enemy = new Enemy();
        //bulletPosition.add() // them phan tu vao mang
        //bulletPosition.get()//lay ra phan tu o vi tri cu the
        //bulletPosition.size()//lay ra kich thuoc cua mang
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
    @Override
    public void paint(Graphics g) {
        //ve anh
        for (int i = 0; i < GameObject.objects.size(); i++)
        {
            GameObject object = GameObject.objects.get(i);
            if(object.active)
            {
                object.render(g);
            }
        }
    }
    private void runAll()
    {
        for (int i = 0; i < GameObject.objects.size(); i++)
        {
            GameObject object = GameObject.objects.get(i);
            if(object.active)
            {
                object.run();
            }
        }
    }





    //gioi han di chuyen cho backfround
    // gioi han di chuyen cho background

}
