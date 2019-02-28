package game;

import tklibs.SpriteUtils;

import java.awt.image.BufferedImage;

public class EnemyBullet extends GameObject
{
    static BufferedImage type1Image = SpriteUtils.loadImage("assets/images/enemies/bullets/red.png");
    static BufferedImage type2Image = SpriteUtils.loadImage("assets/images/enemies/bullets/yellow.png");

    public EnemyBullet()
    {
        velocity.set(1,1);
        velocity.setLength(Settings.PLAYER_BULLET_SPEED);
    }

    public void loadImageByType(int type) {
        switch (type)
        {
            case 1:
                this.image = type1Image;
                break;
            case 2:
                this.image = type2Image;
                break;
            default:
                this.image = type1Image;
        }
    }
}
