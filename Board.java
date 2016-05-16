import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.*;
import javax.imageio.ImageIO;
import javax.swing.*;

public abstract class Board extends JPanel
{
    private GameObject player;
    private BufferedImage background;
    private int currentLevel;
    private boolean playing;
    private String boardName;
    private float timeSinceLastTick;
    private float oldTimeSinceLastTick;
    private float deltaTime;
    
    public Board() {
        timeSinceLastTick = System.currentTimeMillis() / 1000;
        oldTimeSinceLastTick = 0;
        deltaTime = 1;
        initBoard();
    }
    
    private void setBackground(BufferedImage board) {
        background = board;
    }
    
    public void initBoard() {
        setBackground(background);      
    }
    
    private void loop() 
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
    
    private void doDrawing(Graphics g) {
        Registry.drawAll(g, this);
    }
    
    private void playerWin(){
        
    }
    
    private void playerLose() { 
        
    }
    
    private void endLevel(int score) {
        
    }
}
