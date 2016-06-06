import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.event.*;
import javax.swing.JLabel;
import javax.swing.*;
import java.util.*;

public class TitleScreen extends Board implements ActionListener
{
    private String boardFileName = "title_screen.png";
    private double width;
    private double height;
    
    public TitleScreen() {
        super();
        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        width = screenSize.getWidth();
        height = screenSize.getHeight();
        setPreferredSize(screenSize);    
        
        initBoard();
    }
    
    @Override
    public void paintComponent(Graphics g) {
        doDrawing(g);
    }
    
    public void doDrawing(Graphics g)
    {
        BufferedImage background = ImageLoader.loadImage(boardFileName); 
        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        g.drawImage(background,0,0,(int)width,(int)height,this);
        
        super.doDrawing(g);
        }
        
    public void actionPerformed(ActionEvent a) {
        
    }
}
