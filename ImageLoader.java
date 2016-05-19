import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageLoader 
{
  public BufferedImage loadImage(String imgDir) {
    BufferedImage img = null;
	try {
    img = ImageIO.read(new File(imgDir)); } 	
    
    catch (IOException e) {
     }
    return img;
  }
}
