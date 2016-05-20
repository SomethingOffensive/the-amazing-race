import java.awt.*;
import java.awt.image.BufferedImage;
import javax.swing.*; 

public class Level_1 extends Board 
{
    private String boardFileName = "placeholder.jpg";
   
    public Level_1()
    {
        super();
    }
    
    public void doDrawing(Graphics g)
    {
        BufferedImage background = ImageLoader.loadImage(boardFileName); 
        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth();
        double height = screenSize.getHeight();
        
        g.drawImage(background,0,0,(int)width,(int)height,this);
        
        super.doDrawing(g);
        }
    }

