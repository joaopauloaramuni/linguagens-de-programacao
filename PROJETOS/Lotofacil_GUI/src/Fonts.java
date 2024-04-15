import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;
import java.io.File;

public class Fonts extends Font {
    
    Fonts(){ super("Serif",Font.BOLD,16); }
    Fonts(int size){ super("Serif",Font.BOLD,size); }    
    
    static Font create(String path,int size) {
        try { return Font.createFont(Font.TRUETYPE_FONT,new File(path)).deriveFont(Font.BOLD,size);} 
        catch ( FontFormatException e){ e.printStackTrace(); }
        catch (IOException e) { e.printStackTrace(); }
        return null;
    }

}
