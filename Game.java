public class Game
{
    public static int score;
    public static Board[] levels;
    public static Board level1;
    
    public Game()
    {
        
    }

    public static void main()
    {
        level1 = new Level_1();
        level1.doLevel();
    }
    
    public static void doLevel(Board level){
    }
}
