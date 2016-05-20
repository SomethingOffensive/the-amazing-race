import java.awt.*;
import java.awt.image.BufferedImage;
import javax.swing.*;

public abstract class Board extends JPanel
{
    private GameObject player;
    private BufferedImage background;
    private int currentLevel;
    protected boolean playing;
    protected boolean didWin;
    protected String boardName;
    protected float timeSinceLastTick;
    protected float oldTimeSinceLastTick;
    protected float deltaTime;
    
    public Board() {
        timeSinceLastTick = System.currentTimeMillis() / 1000;
        oldTimeSinceLastTick = 0;
        deltaTime = 1;
        playing = true;
    }
    
    protected void setBackground(BufferedImage board) {
        background = board;
    }
    
    protected void initBoard() {
        setBackground(background);      
    }
    
    public void doLevel() {
        initBoard();
        loop();
        if (didWin) {
            playerWin();
        }
        else {
            playerLose();
        }
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
    
    @Override
    public void paintComponent(Graphics g) {
        doDrawing(g);
    }
    
    protected void doDrawing(Graphics g) {
        Registry.drawAll(g, this);
    }
    
    protected void playerWin(){
        
    }
    
    protected void playerLose() { 
        
    }
    
    protected void endLevel(int score) {
        
    }
}
