import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.event.*;
import javax.swing.JLabel;
import javax.swing.*;
import java.util.*;

public class TitleScreen extends Board implements MouseListener
{
    private String boardFileName = "title_screen.png";
    private double width;
    private double height;
   
    int sButtonX;
    int sButtonY; 
    int qButtonX;
    int qButtonY;
    
    public boolean playPressed = false;
    public boolean quitPressed = false;
    
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
       
        sButtonX = (int)width / 2 -150;
        sButtonY = (int)height / 2 -20;
        qButtonX = sButtonX;
        qButtonY = (int)height / 2 + 70;
        
        g.setColor(Color.gray);
        g.fillRect(sButtonX, sButtonY, 300, 60);  
        g.fillRect(qButtonX, qButtonY, 300, 60);
        

        super.doDrawing(g);
        }
        
    public void mouseClicked(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        
        if (x >= sButtonX && x <= sButtonX + 450 && y >= sButtonY && y<= sButtonY + 80) {
            playPressed = true;
            System.out.println("START PRESSED");
        }
    }
    
    public void mousePressed(MouseEvent e) {
        
    }    
    
    public void mouseExited(MouseEvent e) {
        
    }
        
    public void mouseEntered(MouseEvent e) {
        
    }

    public void mouseReleased(MouseEvent e) {
        
    }
}
