import game.GamePanel;
import game.GameWindow;

import java.awt.*;

/**
 * Created by huynq on 7/4/17.
 */
//giaiptbac3
    //bufferimage
public class Program {
    // doi ten thanh fn shift f6
    public static void main(String[] args) {
          //JFrame window = new JFrame();
          GameWindow window = new GameWindow();//neu gamewindow bi chu do thi option enter de import class
          window.setSize(800,600);
          window.setTitle("Game Touhou");
          GamePanel panel = new GamePanel();//option enter import class
          window.add(panel);
          window.setVisible(true);

          panel.GameLoop();
          panel.setBackground(Color.BLUE);
            //bien
            //ham
            //if/else switch/case
            //for while

            //try/catch
//            try{
//                divide(10,0);
//            }catch(Exception exception)
//            {
//                exception.printStackTrace();
//            }
//        System.out.println("Hello");

    }
//    private static int divide (int x, int y)
//    {
//        return x/y;
//    }
}
