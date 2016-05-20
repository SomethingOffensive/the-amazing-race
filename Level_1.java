import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.File; 
import java.awt.Toolkit.*;

public class Level_1 extends Board 
{
    public Level_1()
    {
        super();
    }
    
    public void doDrawing(Graphics g)
    {
        String boardFileName = DirFinder.findDir("placeholder.jpg");    
        
        BufferedImage background = ImageLoader.loadImage(boardFileName); 
        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth();
        double height = screenSize.getHeight();
        
        super.doDrawing(g);
        g.drawImage(background,0,0,(int)width,(int)height,this);
       
        System.out.println(boardFileName); // TEST - to be removed
        
        if (background != null) {
            System.out.println("Image Loaded."); // Also test
        }
    }
}
