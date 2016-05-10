import java.awt.Color;
import java.awt.Image;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import javax.swing.JPanel;
import javax.swing.Timer;

public abstract class Board extends JPanel
{
    private GameObject player;
    private Image background;
    private int currentLevel;
    
    public Board() {       
        initBoard();
    }
    
    private void setBackground(Image board) {
        background = board;
    }
    
    private void initBoard() {
        setBackground(background);      
    }
    
    private void loop() {
        
    }
    
    private void playerWin(){
        
    }
    
    private void playerLose() { 
        
    }
    
    private void endLevel(int score) {
        
    }
}
