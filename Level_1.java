import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.event.*;

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
        while(playing) {
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
    } 
    
    protected void initBoard() {
        player = new Player(ImageLoader.loadImage("kanye.png"), (float)width / 2, (float)height / 2, 20, 20);
        player.setVelocity(20);
        super.initBoard();
    }
    
}

