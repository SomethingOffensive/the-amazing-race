import java.awt.*;
import java.util.*;
import javax.swing.JPanel;

public class Liberal extends Enemy
{

    /**
     * Constructor for objects of class Liberal
     */
    public Liberal(Image image, float x, float y, int w, int l) {
        super(image, x, y, w, l);    
    }
    
    protected void tick(float deltaTime) {
        x += velx;
        y += vely;
    }
    
    public void moveToTarget(GameObject target) {
       
        float dx = x - target.x;
        float dy = y - target.y;
        
        double angle = Math.atan(dy/dx);
        
        velx = (float)Math.cos(angle) * velocity;
        vely = (float)Math.sin(angle) * velocity;
        
        double sep = Math.sqrt(dx * dx + dy * dy);        
        double scale = velocity / sep;
        
        velx = dx * (float)scale * -1;
        vely = dy * (float)scale * -1;
    }
}
