import java.util.*;
import java.awt.*;
import javax.swing.*;
public class TestTick
{
    public static Image img = null;

    static public void main() {
        GameObject newObj = new GameObject(img, 1, 1, 1, 1);
        Registry.tickAll(1);
    }
}
