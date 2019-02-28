package game;

import tklibs.SpriteUtils;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;

public class Enemy extends  GameObject{

    int fireCount;
    int bulletType;
    public Enemy()
    {
        fireCount = 0;
        image = SpriteUtils.loadImage("assets/images/enemies/level0/pink/0.png");
        position.set(-50,-50);
        velocity.set(2,2);
        velocity.setAngle(Math.PI/18);
        velocity.setLength(Settings.ENEMYSPEED);
        bulletType = 1;
    }

    @Override
    public void run()
    {
        super.run();
        changeVelocity();
        enemyFire();
    }
    private void changeVelocity() {
        if(position.x > Settings.BACKGROUND_WIDTH-Settings.ENEMY_WIDTH && velocity.x > 0)
        {
            velocity.set(-velocity.x,velocity.y);
        }
        if(position.x < 0 && velocity.x < 0)
        {
            velocity.set(-velocity.x,velocity.y);
        }
        if(position.y> Settings.GAME_HEIGHT - Settings.ENEMY_HEIGHT && velocity.y >0)
        {
            velocity.set(velocity.x,-velocity.y);
        }
        if(position.y < 0 && velocity.y<0)
        {
            velocity.set(velocity.x,-velocity.y);
        }
    }
    private void enemyFire()
    {
        fireCount+=1;
        if(fireCount>20)
        {
            EnemyBullet bullet = new EnemyBullet();
            bullet.velocity.set(0,3);
            bullet.loadImageByType(1);
            bullet.position.set(this.position.x,this.position.y);

            fireCount = 0;
        }
    }

}
