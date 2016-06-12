import java.awt.event.MouseEvent;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Game
{
    public static int score;
    public static Board[] levels;
    public static TitleScreen title;
    public static Board level1;
    public static JFrame frame;
    
    private static boolean waitingForTitleInput = true;
    
    public Game()
    {
        
    }

    public static void main()
    {
        frame = new JFrame("The Amazing Race");
        frame.addKeyListener(new PlayerInputListener());
        frame.addMouseListener(new PlayerMouseListener());
        
        title = new TitleScreen();
        level1 = new Level_1();
        frame.getContentPane().add(title);
        
        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);
        level1.setVisible(false);
        while (waitingForTitleInput) {
            if (title.noButtonHasBeenPressed()) {
            
            }
            
            else {
                waitingForTitleInput = false;
            }
        }
        frame.getContentPane().removeAll();
        frame.getContentPane().add(level1);

        title.setVisible(false);
        level1.setVisible(true);
        
        frame.revalidate();
        frame.setVisible(true);
        
        level1.initBoard();
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
            title.mouseClicked(e);
        }
        public void mouseEntered(MouseEvent e){
        
         }
        public void mouseExited(MouseEvent e) {
        
         }
        public void mousePressed(MouseEvent e) {
            level1.mousePressed(e);
        }
        public void mouseReleased(MouseEvent e) {
            level1.mouseReleased(e);
        }
    }
}
