import java.io.File;

public class DirFinder
{
    public static String findDir()
    {
        File file = new File("");
        String directory = file.getAbsolutePath();
        
        return directory;
    }
    
    public static String findDir(String folderName)
    {
        File file = new File("");
        String directory = file.getAbsolutePath();
        directory += ("\\" + folderName);
        
        return directory;
    }
    
    public static String findDir(String folderName, String fileName)
    {
        File file = new File("");
        String directory = file.getAbsolutePath();
        directory += ("\\" + folderName + "\\" + fileName);
        
        return directory;
    }    
    
    public static String findImgDir(String imgName)
    {
        File file = new File("");
        String directory = file.getAbsolutePath();
        directory += ("\\img\\" + imgName);
        
        return directory;
    }
}
