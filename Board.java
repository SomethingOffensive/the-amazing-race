import java.awt.Color;
import java.awt.Image;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import javax.swing.JPanel;
import javax.swing.Timer;

public abstract class Board extends JPanel
{
    private Graphics gfx;
    private GameObject player;
    private Image background;
    private int currentLevel;
    private boolean playing;
    
    private float timeSinceLastTick;
    private float oldTimeSinceLastTick;
    private float deltaTime;
    
    public Board() {
        timeSinceLastTick = System.nanoTime() / 1000;
        oldTimeSinceLastTick = 0;
        deltaTime = 1;
        initBoard();
    }
    
    private void setBackground(Image board) {
        background = board;
    }
    
    private void initBoard() {
        setBackground(background);      
    }
    
    private void loop() {
        
        while(playing) {
              timeSinceLastTick = System.nanoTime() / 1000;
              deltaTime = timeSinceLastTick - oldTimeSinceLastTick;
              oldTimeSinceLastTick = timeSinceLastTick;
              
              GameObject.TickAll(deltaTime);
        }
    }
    
    @Override
    public void paintComponent(Graphics g) {
        doDrawing(g);
    }
    
    private void doDrawing(Graphics g) {
        GameObject.DrawAll(g);
    }
    
    private void playerWin(){
        
    }
    
    private void playerLose() { 
        
    }
    
    private void endLevel(int score) {
        
    }
}
