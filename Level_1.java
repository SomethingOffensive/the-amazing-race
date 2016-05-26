import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.event.*;
import javax.swing.JLabel;
import javax.swing.*;

public class Level_1 extends Board implements ActionListener
{
    private String boardFileName = "title_screen.png";
    private double width;
    private double height;
    private Timer timer;
    public Level_1()
    {
        super();
        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        width = screenSize.getWidth();
        height = screenSize.getHeight();
        setPreferredSize(screenSize);
        timer = new Timer(1, this);
        timer.start();
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
   
    protected void loop() 
    {        
          timeSinceLastTick = System.nanoTime() / 1000000000;
          deltaTime = timeSinceLastTick - oldTimeSinceLastTick;
          oldTimeSinceLastTick = timeSinceLastTick;
          
          
          
          Registry.tickAll(deltaTime);
          
          if (player.x < 0) {
              player.x = 0;
          }
          
          if (player.y < 0) {
              player.y = 0;
          }
          
          if (player.x > width) {
              player.x = (float)width - player.width;
          }
          
          if (player.y > height) {
              player.y = (float)height - player.height;
          }
          
          repaint(); //do this last
 
    } 
    
    protected void initBoard() {
        player = new Player(ImageLoader.loadImage("kanye.png"), (float)width / 2, (float)height / 2, 80, 50);
        player.setVelocity(10);
        super.initBoard();
    }
    
    public void actionPerformed(ActionEvent a) {
        loop();
    }
}

