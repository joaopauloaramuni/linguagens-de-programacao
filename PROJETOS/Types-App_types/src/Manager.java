/*!*********************************************************
 *  Manager
 * =========
 * @author: Randolfo
 * @since:  19/02/24
 * @file:   Manager.java 
 *
 * Classe dedicada para gestão de paineis e memoria.
************************************************************/
import java.awt.Container;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;

import java.awt.Font;

public class Manager extends JFrame{
//  Fields
// ========
    private static Container    panels = null;                 //< Buffer de paineis.
    private static CardLayout   cards  = new CardLayout();     //< Manager panel
    private static Query        query  = null;                 //< Memory             
    private JMenuBar mbar = new JMenuBar();                    //< Menu Bar   

    // Paths:
    static private String   
        root = "",   //< Path absolute.
        rec  = "";
    
// Build 
// =====
    Manager(String path){ 
        root = path;
        rec  = path+"rec/windown/"; 
        init(path); 
    }

    //! Startup
    private void init(String path){
        init_bank(); 
        init_windown();
        init_menu();
        init_panels();
    }

    //! Startup bank
    private void init_bank(){ query = new Query(root+"sql/"); }

    //! Startup Windown
    private void init_windown(){
       setJMenuBar(mbar);
       setSize(530, 590);                               
       setResizable(false);
       setBackground(Form.bg);
       setIconImage(new ImageIcon(root+"/rec/windown/int.png").getImage());
       setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    //! Startup Panels
    private void init_panels(){
       panels=getContentPane();
       panels.setLayout(cards);      
       panels.add("MAIN",new Gui_main(root)); 
       panels.add("INFO",new Gui_info(root));
       panels.add("DELT",new Gui_Delt(root));
       panels.add("INSR",new Gui_insr(root));
    }

    //! Startup Menu
    private void init_menu(){
       mbar.add(edit()); 
       //mbar.add(search());
       //mbar.add(new JSeparator());
       mbar.add(disk());
    }


    //! Finish
    void finish(){
        query.disconnet();
        System.exit(0);
    }

//  Menus
// =======
    //! Menu edit
    private JMenu edit(){
        JMenu menu = menu("Edit");
        //menu.add(item(" Insert","INSR"));
        //menu.add(item(" Update","EDIT"));
        menu.add(item(" Remova","DELT"));
        return menu;
    }

    //! Menu search
    private JMenu search(){
        JMenu menu = menu("Search");
        menu.add(item("Name"     , ""));
        menu.add(item("Category" , ""));
        return menu;
    }

    //! Menu Disk
    private JMenu disk(){
        JMenu menu = new JMenu();
        menu.setIcon(new ImageIcon(rec+"Menu.png"));
        menu.add(item("Menu","MAIN"));
        return menu;
    }

    //! Menu 
    JMenu menu(String name){
        JMenu menu = new JMenu(name); 
        menu.setIcon(new ImageIcon(rec+name+".png")); 
        menu.setFont(font(27));
        return menu;
    }

    //! Itens
    private JMenuItem item(String name,String local){ 
        JMenuItem item = new JMenuItem(name);
        item.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){next(local);}});
        item.setFont(font(20));
        return item;
    }

    //! Font
    static Font font(int size){ return Fonts.create(root+"rec/font/digtal.ttf", size); }

//  Methods Move
// ==============
    //! Move panels
    static void next(String local){ cards.show(panels, local); }

//  Memory 
// ========
    
    //! Get types
    static List<Types> types(){return query.select_all();}
    
    //! Remove type
    static void remove(String type){ query.delete(type);; }
}

