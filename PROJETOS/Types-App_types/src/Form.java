/*!*********************************************************
 *  Form 
 * ======
 * @author: Randolfo A Goncalves
 * @since:  09/02/24
 * @file:   Form.java 
 *
 * Classe dedicada para padronização de recursos gui.
************************************************************/
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.LayoutManager;
import java.awt.Component;

import javax.swing.Box;

public class Form extends JPanel{
//  Fields
// ========
    // Colour:
    protected static Color  
        bg  = Color.DARK_GRAY, //< Background
        fg  = Color.WHITE;     //< Foreground
    
    //! Buffer de Components
    private BoxLayout layout = new BoxLayout(this, BoxLayout.Y_AXIS); 

    //! Positions
    protected final boolean 
        VERTICAL    = true,
        HORITZONTAL = false; 
    protected Component sp = space(HORITZONTAL,10); //< Default separation
    
    //! Image
    ImageIcon img=null; 

//  Build
// =======
   Form()                              { init(layout,null);  } //< Default layout
   Form(LayoutManager mng)             { init(mng,null);     } //< Custmized layout
   Form(String image)                  { init(layout,image); } //< Panel image with default layout 
   Form(String image,LayoutManager mng){ init(mng,image);    } //< Panel image with custmized layout 

   //! Initialization
   private void init(LayoutManager mng,String image){
       if(image!=null) img = new ImageIcon(image);    
       setBorder(BorderFactory.createLineBorder(fg,1,true));
       setLayout(mng);
       setBackground(bg);
   }
  
   // Sobrecremos o método grafico da classe pai:
   @Override
   public void paintComponent(Graphics g){
       if(img==null) return;
       super.paintComponent(g);
       g.drawImage(img.getImage(), 0, 0, this.getWidth(), this.getHeight(), this); 
    }
    
   protected ImageIcon getImg()        { return this.img; } //< Getting Background
   protected void setImg(ImageIcon img){ this.img = img;  } //< Setting Background

//  Methods
// =========
    // Position -> ( Posicinar elementos em tela )
    // --------
    void plug(Component cpm){ add(cpm); }
    
    //  Panel
    // -------
    JPanel panel()                               { return factory(new JPanel(   ),false,"");    }
    JPanel panel(String title)                   { return factory(new JPanel(   ),true, title); }
    JPanel panel(LayoutManager mng)              { return factory(new JPanel(mng),false,"");    }
    JPanel panel(String title,LayoutManager mng) { return factory(new JPanel(mng),true, title); }
    JPanel panel(String title,String image)      { return factory(new Graph(image),true, title);}
    JPanel panel(String image,boolean border)    { return factory(new Graph(image),border,"");  }

    //! ( patterns ) - Fabrica de JPanel: 
    private JPanel factory(JPanel pnl,boolean bord,String title){
        pnl.setBackground(bg);
        if(bord) pnl.setBorder(BorderFactory.createTitledBorder(null, title, 0, 0,Manager.font(22), fg)); 
        return pnl;
    } 
    
    //  Label
    // -------
    JLabel label(String text,int size)         { return factory(new JLabel(text),size);       }
    JLabel label(ImageIcon image)              { return factory(new JLabel(image),0);         }
    JLabel label(Icon img,String text,int size){ return factory(new JLabel(text,img,0),size); }

    //! ( patterns ) - Fabrica de JLabel:
    private JLabel factory(JLabel label,int size){
        label.setForeground(fg);
        label.setFont(new Font("Serif",Font.BOLD,size));
        return label;
    } 

    //  Separador
    // -----------
    Component space(boolean position,int n){
        return (position)?Box.createVerticalStrut(n):Box.createHorizontalStrut(n); 
    }

    //  Blocks
    // --------
    private JPanel fill(JPanel pnl,Component[] list){  for(var cmt:list) pnl.add(cmt); return pnl; }

    JPanel box(String title,Component[] list){ 
        return fill(panel(),new Component[]{sp,fill(panel(title),list),sp}); 
    }
}
