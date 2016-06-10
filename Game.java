import java.awt.event.MouseEvent;
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
    
    static class PlayerMouseListener implements MouseListener
    {
        public void mouseClicked(MouseEvent e) { 
            level1.mouseClicked(e);
        }
        public void mouseEntered(MouseEvent e){
        
         }
        public void mouseExited(MouseEvent e) {
        
         }
        public void mousePressed(MouseEvent e) {
           
        }
        public void mouseReleased(MouseEvent e) {
        
        }
    }
}
