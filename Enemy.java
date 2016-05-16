
/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.awt.*;
import java.util.*;
import javax.swing.JPanel;

public class Enemy extends GameObject
{
    private ArrayList<Projectile> bullets;
    private float reload;
    private float cooldown;
    public Enemy(Image image, float x, float y, int w, int l) {
        super(image, x, y, w, l);
        reload = 1;
    }
    
    protected void tick(float deltaTime) {
        System.out.println("Enemy ticked");
        super.tick(deltaTime);
        cooldown += deltaTime;
        if (cooldown >= reload) {
            fire(calculateDirection());
        }
    }
    
    private void fire(Direction d) {
        bullets.add(new Projectile(image, x, y, width, length, d));
    }
    
    private Direction calculateDirection() {
        
        if (Math.abs(velx) > Math.abs(vely)) {
            
            if (velx > 0) {
                return Direction.UP;
            }
            
            else if (velx < 0) {
                return Direction.DOWN;
            }
            
        }
        
        else {
            
            if (vely > 0) {
                return Direction.RIGHT;
            }
            else if (vely < 0) {
                return Direction.LEFT;
            }
            
            else {
                return Direction.UP;
            }
        }
        
        return Direction.UP;
    }
}

  