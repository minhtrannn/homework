package game;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

// class dai dien cho cua so
public class GameWindow extends JFrame
{
    public static boolean isUpPress;
    public static boolean isDownPress;
    public static boolean isRightPress;
    public static boolean isLeftPress;
    //static se tao ra moi thuoc tinh khi game window co 1 class
    public GameWindow()
    {
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                //su kien giu phim
                //System.out.println(e.getKeyCode());
                if(e.getKeyCode() == KeyEvent.VK_A)
                {
                    isLeftPress = true;
                }
                if(e.getKeyCode() == KeyEvent.VK_W)
                {
                    isUpPress = true;
                }
                if(e.getKeyCode() == KeyEvent.VK_S)
                {
                    isDownPress = true;
                }
                if(e.getKeyCode() == KeyEvent.VK_D)
                {
                    isRightPress = true;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                //su kien nha phim
                if(e.getKeyCode() == KeyEvent.VK_A)
                {
                    isLeftPress = false;
                }
                if(e.getKeyCode() == KeyEvent.VK_W)
                {
                    isUpPress = false;
                }
                if(e.getKeyCode() == KeyEvent.VK_S)
                {
                    isDownPress = false;
                }
                if(e.getKeyCode() == KeyEvent.VK_D)
                {
                    isRightPress = false;
                }
            }
        }
        );
        //addMouseListener();
    }
}
