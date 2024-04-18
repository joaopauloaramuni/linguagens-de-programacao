/*!*********************************************************
 *  Gui_insr 
 * ==========
 * @author: Randolfo A Goncalves
 * @since:  09/02/24
 * @file:   Gui_insr.java 
 *
 * Classe dedicada para Cadastramento de novos tipos.
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

class Gui_insr extends Form{
 //  Fields
 // ========
    private Types type = new Types();
    private JTextField 
        tx_name= new JTextField(30),
        tx_catg= new JTextField(30);

//  Build
// =======
    Gui_insr(String path){ init(); }
    
    //! Startup 
    private void init(){
        plug(name());
        plug(Category()); 
        JPanel pnl = panel("");
        pnl.add(init_button());
        plug(pnl);
    }
    
    //! Get Name
    private JPanel name(){
        JPanel pnl = panel("Name");
        pnl.add(tx_name);
        return pnl;
    }
   
    //! Get Category
    private JPanel Category(){
        JPanel pnl = panel("Name");
        pnl.add(tx_catg);
        return pnl;
    }

    // --------------------
    //
    //
    //
    // Em Desenvolvimento 
    //
    //
    // ---------------------

    // Button:
    private JButton init_button(){ 
        JButton btn = new JButton("Create");
        btn.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){
        
        }});
        return btn; 
    }




}
