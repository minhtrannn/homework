package game.enemy;

import game.GameObject;
import tklibs.SpriteUtils;

public class EnemyBullet extends GameObject {
    public EnemyBullet() {
        this.image = SpriteUtils.loadImage("assets/images/enemies/bullets/red.png");
        this.velocity.set(0, 4);
    }

    @Override
    public void run() {
        super.run();
        deactiveIfNeeded1();
    }

    private void deactiveIfNeeded1() {
        if(this.position.y > 630) {
            this.deactive();
        }
    }
}
