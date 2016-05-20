import java.awt.*;
import java.util.*;

public class Player extends GameObject {

  private int score;
  private int health;
  
  public Player(Point playerStart) {
  
    image = ImageLoader.loadImage("kanye.jpg");
  
    x = playerStart.x;
    y = playerStart.y;
  
    velocity = 20;
  
  }
  
  public void tick(float deltaTime) {
    updateVelocity();
    super.tick(deltaTime);
    
  }
  
  private void updateVelocity() {
  
  }
}
