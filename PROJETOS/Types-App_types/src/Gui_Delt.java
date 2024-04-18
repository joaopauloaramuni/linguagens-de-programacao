/*!*********************************************************
 *  Gui_Delete 
 * ==============
 * @author: Randolfo A Goncalves
 * @since:  24/03/24
 * @file:   Gui_Delete.java 
 *
 * Classe dedicada para remoção por meio gráfico de types.
************************************************************/

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import javax.swing.JTextField;
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Gui_Delt extends Form{
// Fields
// ======
    private JTextField txf =  new JTextField(20); //< Campo de escrita
    private JLabel trash   =  new JLabel();       //< Icone da lixeira
    private String rec = "";    

// Build
// =====
    Gui_Delt(String path){ 
        rec = path+"rec/windown/";
        init(); 
    }

    //! Startup
    private void init(){
        plug(space(VERTICAL,30)); 
        plug(box("Search by name",new Component[]{
            init_field(),
            init_button()
        }));
        plug(space(VERTICAL,68)); 
        plug(init_trash(rec+"trash_fill.png"));
        plug(space(VERTICAL,40)); 
    }


// Define components(Events)
// =========================

    // Button:
    private JButton init_button(){ 
        JButton btn = new JButton("Delete");
        btn.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){
            for(var type:Manager.types()) if(type.get_name().equals(txf.getText())){
                trash.setIcon(new ImageIcon(rec+"trash_empty.png"));
                Manager.remove(txf.getText());
                Gui_main.remove(txf.getText());
            }txf.setText("");
        }});
        return btn; 
    }

    // Text field:
    private JTextField init_field(){ 
        txf.addKeyListener(new KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if(trash.getIcon().toString().equals(rec+"trash_empty.png")) 
                    trash.setIcon(new ImageIcon(rec+"trash_fill.png"));
            }
        });  
        return txf; 
    }
    
    // Trash :
    private JLabel init_trash(String image){
        trash.setIcon(new ImageIcon(image));
        return trash;
    }
};
