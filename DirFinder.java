import java.io.File;

public class DirFinder
{
    public static String findDir()
    {
        File file = new File("");
        String directory = file.getAbsolutePath();
        
        return directory;
    }
    
    public static String findDir(String imgName)
    {
        File file = new File("");
        String directory = file.getAbsolutePath();
        directory += "\\img\\" + imgName;
        return directory;
    }
}
