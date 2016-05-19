import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageLoader 
{
  public static BufferedImage loadImage(String imgName) 
  {
    
    String imgDir = DirFinder.findImgDir(imgName);
    BufferedImage img = null;
    
    	try {
	  img = ImageIO.read(new File(imgDir)); 
	 } 	
    
    catch (IOException e) {
     }
    
    if (img == null) { 
      System.out.println(imgDir + " failed to load."); 
    }
    
    return img;
  }
}
