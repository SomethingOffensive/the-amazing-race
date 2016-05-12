
/**
 * Write a description of class GameObject here.
 * 
 * @author Patrick Higgins 
 * @version 1.0
 */

import java.awt.*;
import java.util.*;
import javax.swing.JPanel;


public class GameObject
{
    //keep track of all active GameObject instances
    private static ArrayList<GameObject> objects;
    
    private int length;
    private int width;
    
    // xy position of object
    protected float x;
    protected float y;
    
    //xy velocity of object
    protected float velx;
    protected float vely;
    
    //image to represent object
    private Image image;
    
    private static void add(GameObject obj) {
        objects.add(obj);
    }
    
    public static void TickAll(float deltaTime) {
        for (GameObject o : objects) {
            o.tick(deltaTime);
        }
    }
    
    public static void DrawAll(Graphics g, JPanel pane) {
        for (GameObject o : objects) {
            o.drawObject(g, pane);
        }
    }
    
    public static ArrayList<GameObject> AllGameObjects() {
        return objects;
    }
    
    /**
     * Constructor for objects of class GameObject
     */
    public GameObject(Image image, float x, float y, int w, int l)
    {
        // initialise instance variables
        this.x = x;
        this.y = y;
        
        width = w;
        length = l;
        
        this.image = image;
        GameObject.add(this);
    }
    
    protected void tick(float deltaTime) {
        x += velx;
        y += vely;
    }
    
    private void drawObject(Graphics g, JPanel pane) {
        int x, y;
        
        //we round our floats to drawable int coordinates instead of casting to avoid truncation
        x = Math.round(this.x);
        y = Math.round(this.y);
        
        g.drawImage(image, x, y, length, width, pane);
    }
    
    public Rectangle getBounds() {
        
        // round instead of casting to prevent truncation, we DEFINITELY don't want truncated bounds
        int x = Math.round(this.x);
        int y = Math.round(this.y);
        
        return new Rectangle(x, y, width, length);
    }
}
