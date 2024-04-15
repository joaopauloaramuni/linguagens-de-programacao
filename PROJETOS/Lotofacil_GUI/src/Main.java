/*!***************************************************
 *  Main
 * ======
 * @author : Randolfo A Goncalves
 * @file   : Main.java 
 * @date   : 04-04-24
 *****************************************************/

import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class Main extends JFrame{
// Fields
// ======
   JPanel    pnl  = new JPanel(new BorderLayout());         //< Panel
   JMenuBar  mn   = new JMenuBar();                         //< Menu

   final int size = 100;                                    //< N° de buttons
         int marking = 6;                                   //< N° de marcações
   
   int hits = 0;                                            //< Acertos
   
   // Buttons
   class Btn extends JButton{
      boolean clicked = false;
      Btn(String text,boolean click){ 
         super(text);
         clicked=click;
      }
   }
   Btn[] btn  = new Btn[size];                      //< Buttons

   JButton   act  = new JButton("",new ImageIcon("rec/images/play.png")); 
   
   JLabel    label  = new JLabel(" Escolha "+marking+" numeros e aperte play "),
             status = new JLabel(" Apostas: ");
   
   boolean   flag = true;                                   //< Flag de controle do botão play

   // Color:
   Color bg = new Color(255,255,224);
   Color fg = Color.BLACK;

   // Icones:
   ImageIcon icn_play = new ImageIcon("rec/images/play.png");
   ImageIcon icn_replay = new ImageIcon("rec/images/replay.png");
   
   // Ticket:
   ArrayList<Integer> choose  = new ArrayList<Integer>();
   ArrayList<Integer> awarded = new ArrayList<Integer>();
   Random rand = new Random();

   //! Slider
   JSlider slider = new JSlider(1,46,marking);



// Build
// =====
   Main(){
      super("Zebra de Ouro 2024");
      init_slider();
      init_mabr();
      init_panel();
      init_label();
      init_buttons();
      init_frame();
   }   

//------------------------------- Startup -------------------------------
   //! Startup Frame
   private void init_frame(){
      setSize(680,470);
      setResizable(false);
      setLocationRelativeTo(null);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setJMenuBar(mn);
      setContentPane(pnl);
      setIconImage(new ImageIcon("rec/images/zebra0.png").getImage());
      setVisible(true);
   }
  
   //! Startup Menu Bar
   private void init_mabr(){
      setAutoRequestFocus(false);
      act.setBorderPainted(false);
      act.setContentAreaFilled(false);
      
      act.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            if(choose.size()<marking){
               JOptionPane.showMessageDialog(null," Numero insulficiente de casas marcadas.","",0,new ImageIcon("rec/images/zebra1.png"));
               return;
            }
            if(flag) play(); 
            else     replay();
            flag=!flag;
         }
      });

      mn.setBorder(BorderFactory.createLineBorder(bg));
      mn.add(new JSeparator(0));
      mn.add(act);
   }

   //! Setting marking
   private void init_slider(){
      slider.setMajorTickSpacing(5);
      slider.setMinorTickSpacing(1);
      slider.setPaintTicks(true);
      slider.setPaintLabels(true);
      status.setFont(Fonts.create("rec/fonts/font.ttf", 25));
      slider.addChangeListener(new ChangeListener() {
         public void stateChanged(ChangeEvent arg0) {
            int value = slider.getValue();
            if(value<marking) 
            { 
               for(int i=choose.size()-1;i>=value;i--) select(btn[choose.get(i)]);
               marking=value;
            }else marking = value;

            label.setText(" Escolha "+marking+" numeros e aperte play "); 
         }
      });
      mn.add(status);
      mn.add(slider);
   }

   //! Startup Label
   private void init_label(){
      JPanel panel = new JPanel();
      panel.setBackground(bg);
      panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
      label.setFont(Fonts.create("rec/fonts/font.ttf",31));
      panel.add(label);
      pnl.add(panel,BorderLayout.SOUTH); 
   }

   //! Startup Panel
   private void init_panel(){ pnl.setBorder(BorderFactory.createLineBorder(bg)); }

   // Startup Buttons
   private void init_buttons(){
      // Setting button
      JPanel panel = new Graph("rec/images/background.png");
      for(int i=0;i<size;i++) {
         btn[i]=(i<10)?(new Btn("0"+i,true)):(new Btn(""+i,true)); //< Create button 
         btn[i].setBackground(bg);
         btn[i].setForeground(fg);
         btn[i].setFont(Fonts.create("rec/fonts/font.ttf",20));
         panel.add(btn[i]); 
         pnl.add(panel);
      }

      // Atribuir evento
      for(var button: btn) button.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            if((choose.size() < marking||
               check_choose(Integer.parseInt(button.getText())))
               &&flag
            ) 
               select(button);
         }
      });
   }

//------------------------------- Actions -------------------------------
   //! Play action
   private void play(){
      act.setIcon(icn_replay); 
      slider.setVisible(false);
      status.setText(" Resultado: ");
      int value=0;
      boolean exist = false;
      for(int i=0;i<marking;i++){
         do{
            exist =false;
            value = rand.nextInt(0,size);
            for(var awd:awarded) if(awd==value){ exist=true;break;}
         }while(exist);
         awarded.add(value);
         btn[value].setBackground(Color.GREEN);
      } 

      for(var awd:awarded)
         for(var chs:choose)
            if(awd==chs) {
               hits++;
               btn[awd].setBackground(Color.YELLOW);
               btn[awd].setForeground(fg);
               break;
            }
      label.setText("Ganhou R$ "+(hits*500.00));
   }

   //! Button default
   private void dft(JButton btn){
      btn.setBackground(bg);
      btn.setForeground(fg);
   }

   //! Replay action
   private void replay(){
      act.setIcon(icn_play);
      slider.setVisible(true);
      status.setText(" Apostas: ");
      for(var i:awarded) dft(btn[i]); 
      for(var i:choose) {
         dft(btn[i]);      
         btn[i].clicked=true;
      }
      choose.clear();
      awarded.clear();
      hits=0;
      label.setText(" Escolha "+marking+" numeros e aperte play ");
   }

   //! Select
   private void select(Btn btn){
      if(btn.clicked){ 
         btn.setBackground(Color.RED);
         btn.setForeground(Color.RED);
         choose.add(Integer.parseInt(btn.getText()));
         btn.clicked=false;
      }else{
         dft(btn);
         btn.clicked=true;
         for(int i=0;i<choose.size();i++) 
            if(choose.get(i)==Integer.parseInt(btn.getText())){
               choose.remove(i);
               break;
            }
      }
   }
   
   // Check chooses
   private boolean check_choose(int n){
      for(var chs:choose) if(n==chs) return true;
      return false;
   }  

//------------------------------- Main -------------------------------
   //! create splash
   private static void create_splash(){ 
      JFrame fm = new JFrame();
      JLabel lb = new JLabel(new ImageIcon("rec/images/zebra0.png"));
      JProgressBar prog =new JProgressBar(0,100);
      JPanel p1 = new JPanel(new BorderLayout());
      fm.setSize(500,470);
      fm.setLocationRelativeTo(null);
      fm.setUndecorated(true);
      
      Color tras = new Color(0,0,0,1);
      
      fm.setBackground(tras); 
      p1.setBackground(tras); 
      prog.setForeground(new Color(255,165,0));

      p1.add(lb,BorderLayout.CENTER);
      p1.add(prog,BorderLayout.SOUTH);
      fm.add(p1);

      fm.setVisible(true);
      try{ 
         for(int i=0;i<100;i++){
            Thread.sleep(30);
            prog.setValue(i);
         }
      }
      catch(Exception e){ e.printStackTrace(); }
      fm.setVisible(false);
   }         

   public static void main(String[] args) { 
      create_splash(); 
      new Main(); 
   }
}

