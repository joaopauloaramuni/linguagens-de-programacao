package lotofacil;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;

public class LotofacilGUI extends JFrame{
    // Atributos
    private JPanel painel = new JPanel();
    private JButton jButtonAposta1 = new JButton("Apostar de 0 a 100");
    private JButton jButtonAposta2 = new JButton("Apostar de A a Z");
    private JButton jButtonAposta3 = new JButton("Apostar par ou ímpar");

    // Construtor
    public LotofacilGUI(){
        this.setTitle("** Lotofácil - Interface Gráfica **");
        this.setSize(400,420);
        painel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 20));
        painel.setBackground(new Color(255, 255, 255));

        jButtonAposta1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aposta1();
            }
        });

        jButtonAposta2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aposta2();
            }
        });

        jButtonAposta3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aposta3();
            }
        });

        jButtonAposta1.setPreferredSize(new Dimension(150, 100));
        jButtonAposta2.setPreferredSize(new Dimension(150, 100));
        jButtonAposta3.setPreferredSize(new Dimension(150, 100));

        painel.add(jButtonAposta1);
        painel.add(jButtonAposta2);
        painel.add(jButtonAposta3);

        this.getContentPane().add(painel);
        this.setLocationRelativeTo(null); // Centralizar janela
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true); // Exibir janela
    }

    private void aposta3() {
        String numeroApostado = JOptionPane.showInputDialog(null, "Digite um número: ");
        int numeroApostadoInt = Integer.parseInt(numeroApostado);
        if(numeroApostadoInt % 2 == 0){
            JOptionPane.showMessageDialog(null, "É par! Você ganhou cenzão.");
        }else{
            JOptionPane.showMessageDialog(null, "Você perdeu, o número apostado deveria ser par.");
        }
    }

    private void aposta2() {
        String letraApostada = JOptionPane.showInputDialog(null, "Digite uma letra de A a Z ");
        char letraApostadaChar = letraApostada.charAt(0);
        char letraPremiada = 'J';

        if(Character.isLetter(letraApostadaChar)){
            char letraApostadaMaiusculo = Character.toUpperCase(letraApostadaChar);
            if(letraApostadaMaiusculo == letraPremiada){
                JOptionPane.showMessageDialog(null, "Você ganhou quinhentão.");
            }else{
                JOptionPane.showMessageDialog(null, "Você perdeu. Letra sorteada é: " + letraPremiada);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Letra inválida.");
        }
    }

    private static void aposta1() {
        ImageIcon icon = new ImageIcon("sorteio.png");
        Object numeroApostado = JOptionPane.showInputDialog
                (null,"Digite um número de 0 a 100: ",
                        "Aposta 1",JOptionPane.INFORMATION_MESSAGE,
                        icon,null,"");
        int numeroApostadoInt = Integer.parseInt(numeroApostado.toString());
        Random rdn = new Random();
        int numeroSorteado = rdn.nextInt(101);
        if(numeroApostadoInt == numeroSorteado){
            JOptionPane.showMessageDialog(null,"Você ganhou milzão.",
                    "Aposta 1",JOptionPane.INFORMATION_MESSAGE,
                    icon);
        }else{
            JOptionPane.showMessageDialog(null,"Você perdeu, o número sorteado foi: " + numeroSorteado,
                    "Aposta 1",JOptionPane.INFORMATION_MESSAGE,
                    icon);
        }
    }


    public static void main(String[] args) {
        new LotofacilGUI();
    }
}
