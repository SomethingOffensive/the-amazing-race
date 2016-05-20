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
              timeSinceLastTick = System.nanoTime() / 1000;
              deltaTime = timeSinceLastTick - oldTimeSinceLastTick;
              oldTimeSinceLastTick = timeSinceLastTick;
              
              
              
              Registry.tickAll(deltaTime);
              
              repaint(); //do this last
        }
    } 
    
    protected void initBoard() {
        super.initBoard();
        Player test = new Player(ImageLoader.loadImage("kanye.png"), (float)width/2, (float)height/2, 20, 20);
    }
}

