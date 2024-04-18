import javax.swing.JFrame;

/*!*********************************************************
 *  Main 
 * ======
 * @author: Randolfo
 * @since:  02/02/24
 * @file:   Main.java 
 *
 * Classe dedicada para chamada e gestão do programa.
************************************************************/


public class Main{
    //make run
    public static void main(String[] argv){ 
        new Manager(argv[0]).setVisible(true);
    }
}
