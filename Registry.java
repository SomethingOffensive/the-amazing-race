
/**
 * Write a description of class Registry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;
import java.awt.*;
import javax.swing.*;
public class Registry
{
    // instance variables - replace the example below with your own
    private static ArrayList<GameObject> allObjects = new ArrayList<GameObject>();
    
    public static void register(GameObject obj) {
        allObjects.add(obj);
    }
    
    public static void tickAll(float deltaTime) {
        for (GameObject obj : allObjects) {
            obj.tick(deltaTime);
        }
    }
    
    public static void drawAll(Graphics g, JPanel pane) {
        for (GameObject obj : allObjects) {
            obj.drawObject(g, pane);
        }
    }
}
