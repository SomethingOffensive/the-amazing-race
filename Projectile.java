
/**
 * A fireable projectile.
 * 
 * @author Patrick Higgins 
 * @version 1.0
 */


import java.awt.Graphics;
import java.awt.Image;
import java.util.*;

public class Projectile extends GameObject
{
    private Point target;
    private GameObject targetObj;
    private boolean targeting;
    private boolean first;
    private Direction direction;
    
    private double angle;
    
    /**
     * Constructor for objects of class Projectile
     */
    public Projectile(Image image, float x, float y, int w, int l, Direction d)
    {
       super(image, x, y, w, l);
       target = new Point(0,0);
       targeting = false;
       direction = d;
       first = true;
       calculateVelocity();
    }
    
    public void setTarget(float x, float y) {
        target.x = x;
        target.y = y;
        targeting = true;
    }
    
    public void setTarget(GameObject targetObj) {
        this.targetObj = targetObj;
        targeting = true;
    }
    
    public void abortTarget() {
        targeting = false;
    }
    private void calculateVelocity() {

        if (first) {
            first = false;
            
            switch (direction) {
                
                case UP:
                    velx = 0;
                    vely = velocity;
                    break;
                    
                case DOWN:
                
                    velx = 0;
                    vely = velocity * -1;
                    break;
                    
                case LEFT:
                    velx = velocity * -1;
                    vely = 0;
                    break;
                    
                case RIGHT:
                    velx = velocity;
                    vely = 0;
                    break;
            }
            
        }
        
        else if (!first) {
            
            float dx = x - target.x;
            float dy = y - target.y;
            
            angle = Math.atan(dy/dx);
            velx = (float)Math.cos(angle) * velocity;
            vely = (float)Math.sin(angle) * velocity;
            
            if (target.x < this.x) {
                velx = velx * -1;
            }
            
            if (target.y < this.y) {
                vely = vely * -1;
            }
            
        }
        
    }
    
    protected void tick(float deltaTime) {
        if (targeting) {
            calculateVelocity();
        }
        super.tick(deltaTime);
    }
}
