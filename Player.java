
import java.awt.*;
import java.util.*;
import javax.swing.JPanel;
import java.awt.event.*;

public class Player extends GameObject
{
    private final Image[] Kanye_Albums = {ImageLoader.loadImage("kanye_bear.jpg"), ImageLoader.loadImage("kanye_graduation.jpg"),ImageLoader.loadImage("kanye_Late_registration.jpg"), ImageLoader.loadImage("kanye_pablo.jpg"),ImageLoader.loadImage("kanye_yeezus.jpg"), ImageLoader.loadImage("kanye_808s.png")};
    private boolean isMovingLeft, isMovingRight, isMovingUp, isMovingDown;
    private boolean hasFiredThisClick;
    private ArrayList<Projectile> bullets;
    
    public Player(Image image, float x, float y, int w, int l)
    {
        super(image, x, y, w, l);
    }       
    
    public void tick(float deltaTime) {
            
        if (isMovingUp) {
            vely = velocity * -1;
        }
            
        if (isMovingLeft) {
            velx = velocity * -1;
        }
        
        if (isMovingDown){
            vely = velocity;
        }
        
        if (isMovingRight) {
            velx = velocity;
        }
        super.tick(deltaTime);
    }  
    
    private void fire() {
        java.awt.Point mouseCoords = MouseInfo.getPointerInfo().getLocation();
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
                vely = 0;
                break;
            
            case 65:
                isMovingLeft = false;
                velx = 0;
                break;
            
            case 83:
                isMovingDown = false;
                vely = 0;
                break;
            
            case 68:
                isMovingRight = false;
                velx = 0;
                break;
        }
    }     
    
    public void mouseClicked(MouseEvent e) {
        int Mouse_x = MouseInfo.getPointerInfo().getLocation().x ;
        int Mouse_y = MouseInfo.getPointerInfo().getLocation().y ;
        System.out.println("(" + MouseInfo.getPointerInfo().getLocation().x + ", " + MouseInfo.getPointerInfo().getLocation().y + ")");
    }
    
    public void mousePressed(MouseEvent e) {

        if (!hasFiredThisClick) {
            fire();
            hasFiredThisClick = true;
        }    
    }
    
    public void mouseExited(MouseEvent e) {
        
    }
        
    public void mouseEntered(MouseEvent e) {
        
    }

    public void mouseReleased(MouseEvent e) {
        hasFiredThisClick = false;
    }
    
    public void keyTyped(KeyEvent k) {
         switch(k.getKeyCode()) {
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
}
