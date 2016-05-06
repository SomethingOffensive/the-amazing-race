
/**
 * Write a description of class GameObject here.
 * 
 * @author Patrick Higgins 
 * @version 1.0
 */

import java.awt.Graphics;
import java.awt.Image;
public class GameObject
{
    // xy position of object
    protected float x;
    protected float y;
    
    //xy velocity of object
    protected float velx;
    protected float vely;
    
    //image to represent object
    private Image image;

    /**
     * Constructor for objects of class GameObject
     */
    public GameObject(Image image, float x, float y)
    {
        // initialise instance variables
        this.x = x;
        this.y = y;
        
        this.image = image;
    }

}
