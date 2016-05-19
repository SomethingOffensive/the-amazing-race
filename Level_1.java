import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.File; 

public class Level_1 extends Board 
{
    public Level_1()
    {
        initBoard();
    }
    
    public void doDrawing(Graphics g)
    {
        String boardFileName = DirFinder.findDir("placeholder.jpg");	
        
        BufferedImage background = loadImage(boardFileName); 
        setBackground(background);
        super.doDrawing(g);
        g.drawImage(0,0,100,100,this);
       
        System.out.println(boardFileName); // TEST - to be removed
        
        if (background != null) {
            System.out.println("Image Loaded."); // Also test
        }
    }
}
