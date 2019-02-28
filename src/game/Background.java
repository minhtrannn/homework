package game;

import tklibs.SpriteUtils;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Background extends  GameObject{

    public  Background()
    {
        this.image = SpriteUtils.loadImage("assets/images/background/0.png");
        //position = new Vector2D(0,Setting-3109);
        position.set(0,Settings.GAME_HEIGHT-Settings.BACKGROUND_HEIGHT);
        this.velocity.set(0,Settings.BACKGROUND_SPEED);
    }
    @Override
    public void run() {
//        position.y += 1; //background move

        super.run(); // == this.position.add(this.velocity.x,this.velocity.y);
        if(position.y > 0 ) // limit background
        {
            position.y = 0;
        }
    }
    //this.image dai dien cho doi tuong trong class
    // super.image dai dien cho doi tuong trong lop cha cua class
}
