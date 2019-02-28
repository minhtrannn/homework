import game.GamePanel;
import game.GameWindow;
import game.Settings;
import game.Vector2D;

import java.awt.*;
import java.util.ArrayList;

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
          panel.setPreferredSize(new Dimension(Settings.GAME_WIDTH,Settings.GAME_HEIGHT));
          window.add(panel);
          window.pack();
          window.setVisible(true);
          panel.setBackground(Color.cyan);
          panel.GameLoop();
        /*ArrayList <Vector2D> vectors = new ArrayList<>();
        Vector2D v1 = new Vector2D(1,2);
        Vector2D v2 = new Vector2D(3,3);
        Vector2D v3 = new Vector2D(2,2);
        Vector2D v4 = new Vector2D(4,1);
        vectors.add(v1);
        vectors.add(v2);
        double max = 0;
        int maxIndex=0;
        for(int i =0 ;i<vectors.size();i++)
        {
            Vector2D vector = vectors.get(i);
            if(vector.x + vector.y > max)
            {
                max = vector.x + vector.y;
                maxIndex = i;
            }
        }
        //TODO: tim vector co tong x y lon nhat
        Vector2D vectorMax = vectors.get(maxIndex);
        System.out.println(vectorMax.x + " " + vectorMax.y);*/

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
