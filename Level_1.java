import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.File; 

public class Level_1 extends Board 
{ 
    ImageLoader loader = new ImageLoader();
   
    public Level_1()
    {
        initBoard();
    }
    
    public void drawBoard()
    {
        String boardFileName = DirFinder.findDir("placeholder.jpg");	
        
        BufferedImage background = loader.loadImage(boardFileName); 
       
        System.out.println(boardFileName); // TEST - to be removed
        
        if (background != null) {
            System.out.println("Image Loaded."); // Also test
        }
    }
}
