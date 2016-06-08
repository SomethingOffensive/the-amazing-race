import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.event.*;
import javax.swing.JLabel;
import javax.swing.*;
import java.util.*;

public class Level_1 extends Board implements ActionListener
{
    private final Image kanyeImage = ImageLoader.loadImage("kanye.png");
    private final Image[] liberalImages = {ImageLoader.loadImage("student_1.png"), ImageLoader.loadImage("student_2.png"),ImageLoader.loadImage("student_3.png"), ImageLoader.loadImage("420_mark.png")};
    private final int enemyTimer = 10;
    private final int DELAY = 1;
    private final Point enemySize = new Point(56,80);
    private final int KANYE_SPEED = 20;
    private final int LIBERAL_SPEED = 30;
    
    private int timeSinceLastSpawn;
    
    private String boardFileName = "title_screen.png";
    private double width;
    private double height;
    private javax.swing.Timer timer;
    
    private ArrayList<Liberal> enemies;
    public Level_1()
    {
        super();
        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        width = screenSize.getWidth();
        height = screenSize.getHeight();
        setPreferredSize(screenSize);
        timer = new javax.swing.Timer(DELAY, this);
        initBoard();
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
          Random rand = new Random();
          timeSinceLastTick = System.nanoTime() / 1000000000;
          deltaTime = timeSinceLastTick - oldTimeSinceLastTick;
          oldTimeSinceLastTick = timeSinceLastTick;
          
          ArrayList<Liberal> newEnemies = new ArrayList<Liberal>();
          
          timeSinceLastSpawn += DELAY;
          
          if (timeSinceLastSpawn + rand.nextInt(40) - 20 >= enemyTimer) {
              Liberal newLiberal = new Liberal(liberalImages[rand.nextInt(liberalImages.length)], rand.nextInt((int)width - 28) + 1, 0, 80, 56);
              newLiberal.setVelocity(LIBERAL_SPEED);
              newLiberal.moveToTarget(player);
              
              enemies.add(newLiberal);
              timeSinceLastSpawn = 0;
          }
          
          if (!enemies.isEmpty()) {
              for (Liberal enemy : enemies) {
                  if (enemy.x < - enemySize.x || enemy.y < - enemySize.y || enemy.x > width + enemySize.x|| enemy.y > height + enemySize.y) {
                      newEnemies.remove(enemy);
                      Registry.remove(enemy);
                  }
                  
              }
        }
          enemies = newEnemies;
          enemies.trimToSize();
          
          checkCollisions();
          
          Registry.tickAll(deltaTime);
          
          if (player.x < 0) {
              player.x = 0;
          }
          
          if (player.y < 0) {
              player.y = 0;
          }
          
          if (player.x > width - player.width) {
              player.x = (float)width - player.width;
          }
          
          if (player.y > height - player.height) {
              player.y = (float)height - player.height;
          }
          
          repaint(); //do this last
 
    } 
    
    private void checkCollisions() {
        Rectangle playerCollider = player.getBounds();
        for (Liberal enemy : enemies) {
            if (enemy.getBounds().intersects(playerCollider)) {
                playing = false;
                didWin = false;
                System.out.println("BAM! Kanye killed by" + enemy);
            }
        }
    }
    
    protected void initBoard() {
        player = new Player(ImageLoader.loadImage("kanye.png"), (float)width / 2, (float)height / 2, (int)enemySize.y, (int)enemySize.x);
        player.setVelocity(KANYE_SPEED);
        
        //Liberal baddie = new Liberal(ImageLoader.loadImage("kanye.png"), (float)width / 2, 0, 40, 28);
        //baddie.setVelocity(30);
        //baddie.moveToTarget(player);
        enemies = new ArrayList<Liberal>();
        enemies.add(new Liberal(ImageLoader.loadImage("student_1.png"), (float)width / 2, 0, (int)enemySize.y, (int)enemySize.x));
        super.initBoard();

    }
    
    public void actionPerformed(ActionEvent a) {
        loop();
    }
}

