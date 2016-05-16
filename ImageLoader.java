import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.*;
import javax.imageio.ImageIO;
import javax.swing.*;

public class ImageLoader
{
    public BufferedImage loadImage(String fileName)
    {
        BufferedImage image = null;
        try
        {
            URL url = getClass().getResource(fileName);
            image = ImageIO.read(url);
        }
        catch(MalformedURLException mue)
        {
            System.err.println("url: " + mue.getMessage());
        }
        catch(IllegalArgumentException iae)
        {
            System.err.println("arg: " + iae.getMessage());
        }
        catch(IOException ioe)
        {
            System.err.println("read: " + ioe.getMessage());
        }
        if(image == null)
        {
            System.out.println("unable to load image");
        }
        return image;
    }    
}
