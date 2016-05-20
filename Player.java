import java.awt.*;
import java.util.*;
import javax.swing.JPanel;
import java.awt.event.*;

public class Player extends GameObject implements MouseListener, KeyListener
{
    public Player(Image image, float x, float y, int w, int l)
    {
        super(image, x, y, w, l);
    }       
    
    public void keyPressed(KeyEvent k) {
        switch (k.getKeyCode()) {
            case 87:
                vely = velocity;
                break;
            
            case 65:
                velx = velocity * -1;
                break;
            
            case 83:
                vely = velocity * -1;
                break;
            
            case 68:
                velx = velocity;
                break;
        }
    }     
    
    public void keyReleased(KeyEvent k) {
        switch (k.getKeyCode()) {
            case 87:
                vely = 0;
                break;
            
            case 65:
                velx = 0;
                break;
            
            case 83:
                vely = 0;
                break;
            
            case 68:
                velx = 0;
                break;
        }
    }     
    
    public void mouseClicked(MouseEvent e) {
        
    }
    
    public void mousePressed(MouseEvent e) {
        
    }    
    
    public void mouseExited(MouseEvent e) {
        
    }
        
    public void mouseEntered(MouseEvent e) {
        
    }

    public void mouseReleased(MouseEvent e) {
        
    }
    
    public void keyTyped(KeyEvent k) {
        
    }    
}
