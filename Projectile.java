
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
    
    private Direction direction;
    
    /**
     * Constructor for objects of class Projectile
     */
    public Projectile(Image image, float x, float y, int w, int l, Direction d)
    {
       super(image, x, y, w, l);
       target = new Point(0,0);
       targeting = false;
       direction = d;
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
    
    private void calculateVelocity() {
        // make velocity vector intercept target
    }
    
    protected void tick(float deltaTime) {
        if (targeting) {
            calculateVelocity();
        }
        super.tick(deltaTime);
    }
}
