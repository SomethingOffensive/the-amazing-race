import java.awt.*;
import java.util.*;
import javax.swing.JPanel;
import java.awt.event.*;

public class Player extends GameObject
{
    private boolean isMovingLeft, isMovingRight, isMovingUp, isMovingDown;
    public Player(Image image, float x, float y, int w, int l)
    {
        super(image, x, y, w, l);
    }       
    
    public void tick(float deltaTime) {
            if (isMovingUp) {
                vely = velocity;
            }
            
            if (isMovingLeft) {
                velx = velocity * -1;
            }
            
            if (isMovingDown){
                vely = velocity * -1;
            }
            
            if (isMovingRight) {
                velx = velocity;
            }
            super.tick(deltaTime);
    }  
    
    public void keyPressed(KeyEvent k) {
        switch (k.getKeyCode()) {
            case 87:
                isMovingUp = true;
                break;
            
            case 65:
                isMovingLeft = true;
                break;
            
            case 83:
                isMovingDown = true;
                break;
            
            case 68:
                isMovingRight = true;
                break;
        }
    }
    
    public void keyReleased(KeyEvent k) {
        switch (k.getKeyCode()) {
            case 87:
                isMovingUp = false;
                break;
            
            case 65:
                isMovingLeft = false;
                break;
            
            case 83:
                isMovingDown = false;
                break;
            
            case 68:
                isMovingRight = false;
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
