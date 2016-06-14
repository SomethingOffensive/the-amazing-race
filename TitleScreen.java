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
   
    private int sButtonX, sButtonY, qButtonX, qButtonY;
    private Rectangle startButton;
    private Rectangle quitButton;
    
    public boolean playPressed = false;
    public boolean quitPressed = false;
    
    public TitleScreen() {
        super();
        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        width = screenSize.getWidth();
        height = screenSize.getHeight();
        
        sButtonX = (int)width / 2 -150;
        sButtonY = (int)height / 2 -20;
        qButtonX = sButtonX;
        qButtonY = (int)height / 2 + 70;
        
        startButton = new Rectangle(sButtonX, sButtonY, 300, 60);
        quitButton = new Rectangle(qButtonX, qButtonY, 300, 60);
        
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
       
        
        g.setColor(Color.gray);
        g.fillRect(sButtonX, sButtonY, 300, 60);  
        g.fillRect(qButtonX, qButtonY, 300, 60);
        
        g.setFont(new Font("Comic Sans", Font.PLAIN, 24));

        super.doDrawing(g);
        
        g.drawString("Play!", sButtonX + 20, sButtonY + 16);
        g.drawString("Don't Quit", qButtonX + 20, qButtonY + 16);
    }
    
    public boolean noButtonHasBeenPressed() {
        if (!playPressed && !quitPressed) {
            return true;
        }
        else if (playPressed || quitPressed) {
            return false;
        }
        
        return true;
    }
    public void mouseClicked(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        System.out.println(x + "," + y);
        if (startButton.contains(new java.awt.Point(x,y))) {
            playPressed = true;
            System.out.println("START PRESSED");
        }
        
        if (quitButton.contains(new java.awt.Point(x,y))) {
            quitPressed = true;
            System.out.println("QUIT PRESSED");
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
