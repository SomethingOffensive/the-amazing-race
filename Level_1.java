import java.awt.*;
import java.awt.image.BufferedImage;

public class Level_1 extends Board 
{
    private String boardFileName = "placeholder.jpg";
    private double width;
    private double height;
    public Level_1()
    {
        super();
        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        width = screenSize.getWidth();
        height = screenSize.getHeight();
        setPreferredSize(screenSize);
    }
    
    public void doDrawing(Graphics g)
    {
        BufferedImage background = ImageLoader.loadImage(boardFileName); 
        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        
        g.drawImage(background,0,0,(int)width,(int)height,this);
        
        super.doDrawing(g);
        }
    }

