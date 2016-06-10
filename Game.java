import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Game
{
    public static int score;
    public static Board[] levels;
    public static Board level1;
    public static JFrame frame;
    
    public Game()
    {
        
    }

    public static void main()
    {
        frame = new JFrame("The Amazing Race");
        frame.addKeyListener(new PlayerInputListener());
        
        TitleScreen title = new TitleScreen();
        frame.getContentPane().add(title);
        
        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);
    }
    
    static class PlayerInputListener implements KeyListener 
    {
        public void keyReleased(KeyEvent k) {
            level1.keyReleased(k);
        }
        
        public void keyPressed(KeyEvent k) {
            level1.keyPressed(k);
        }
        
        public void keyTyped(KeyEvent k) {
        
        }
    }
}
