import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.*;
import javax.imageio.ImageIO;
import javax.swing.*;
 

public class Level_1 extends Board 
{ 
    public String boardFileName;
    ImageLoader loader = new ImageLoader();    
    public Level_1()
    {
        initBoard();
    }
    
    private void drawBoard() {
        BufferedImage background = loader.loadImage(boardFileName);
        
    }
}
