/*!*********************************************************
 *  Gui_Data 
 * ==============
 * @author: Randolfo A Goncalves
 * @since:  28/03/24
 * @file:   Gui_Data.java 
 *
 * Classe dedicada para exibição de dados.
************************************************************/
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;

public class Gui_info extends Form{
//  Fields
// ========
    private static final int n =12;
    private static JLabel[]  inf  = new JLabel[n];       
    private static JLabel  icn  = new JLabel("                              ");    
    private static Font    font = null;                 
    private JLabel[] sp =new JLabel[]{new JLabel(" "),new JLabel(" "),new JLabel(" ")};                                                 
    private static String path_btn = "";

//  Build
// =======
    Gui_info(String path){ 
        super(path+"rec/windown/note.jpg"); 
        path_btn=path+"rec/types/"; 
        init(path+"rec/");
    }
    
    //! Startup
    private void init(String path){ 
        icn.setHorizontalTextPosition(SwingConstants.LEFT); 
        font = Fonts.create(path+"font/font.ttf",35);
        for(int i=0;i<n;i++) inf[i]=init_label("");
        for(var space: sp) plug(space);
        plug(icn);
        for(var data:inf) plug(data);
    }


    //! Startup labels
    private static JLabel init_label(String text){
        JLabel inf =new JLabel();
        inf.setFont(font);
        inf.setForeground(Color.BLUE);
        inf.setText(text);
        return inf;
    }

// Getting data 
// ============
    static void get_data(Types type){
        //Sound.play(path+"sound/writing.wav");
        inf[4].setText("     ______________________ Dados ____");
        inf[5].setText("      # Name: "+type.get_name()+" ");
        inf[6].setText("      # Category: "+type.get_category_name()+" ");
        inf[7].setText("      # Ex: "+type.get_example()+" ");
        inf[8].setText("      # Size: "+type.get_size()+" ");
        inf[9].setText("      # Extension: ");
        inf[10].setText("          Min: "+type.get_min()+" ");
        inf[11].setText("          MAx: "+type.get_max()+" ");
        icn.setIcon(new ImageIcon(path_btn+type.get_icon()));
        Manager.next("INFO");
    }
}
