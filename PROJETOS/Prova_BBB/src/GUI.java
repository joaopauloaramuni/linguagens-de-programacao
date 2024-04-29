import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class GUI extends JFrame {
    private JPanel painel = new JPanel();
    private JButton jButtonVotar = new JButton("Votar");
    private JButton jButtonApurar = new JButton("Apurar resultado");
    private static ArrayList<Jogador> jogadores = new ArrayList<Jogador>();

    public GUI() {
        //Cadastrar jogadores
        cadastrar();

        this.setTitle("** Eliminação BBB **");
        this.setSize(250, 250);
        painel.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 40));
        painel.setBackground(new Color(255, 255, 255));
        jButtonVotar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                votar();
            }
        });
        painel.add(jButtonVotar);
        jButtonApurar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                apurar();
            }
        });
        painel.add(jButtonApurar);
        this.getContentPane().add(painel);
        this.setLocationRelativeTo(null); // Centralizar janela
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true); // Exibir janela
    }

    private static void cadastrar() {
        //Cadastrar jogadores
        jogadores.add(new Jogador("Alane Dias", 0));
        jogadores.add(new Jogador("Beatriz Reis", 0));
        jogadores.add(new Jogador("Davi Brito", 0));
        jogadores.add(new Jogador("Deniziane Ferreira", 0));
        jogadores.add(new Jogador("Fernanda Bande", 0));
        jogadores.add(new Jogador("Giovanna Lima", 0));
        jogadores.add(new Jogador("Giovanna Pitel", 0));
        jogadores.add(new Jogador("Isabelle Nogueira", 0));
        jogadores.add(new Jogador("Juninho", 0));
        jogadores.add(new Jogador("Leidy Elin", 0));
        jogadores.add(new Jogador("Lucas Henrique", 0));
        jogadores.add(new Jogador("Lucas Luigi", 0));
        jogadores.add(new Jogador("Lucas Pizane", 0));
        jogadores.add(new Jogador("Marcus Vinicius", 0));
        jogadores.add(new Jogador("Matteus Amaral", 0));
        jogadores.add(new Jogador("Maycon Cosmer", 0));
        jogadores.add(new Jogador("MC Bin Laden", 0));
        jogadores.add(new Jogador("Michel Nogueira", 0));
        jogadores.add(new Jogador("Nizam", 0));
        jogadores.add(new Jogador("Raquele Cardozo", 0));
        jogadores.add(new Jogador("Rodriguinho", 0));
        jogadores.add(new Jogador("Thalyta Alves", 0));
        jogadores.add(new Jogador("Vanessa Lopes", 0));
        jogadores.add(new Jogador("Vinicius Rodrigues", 0));
        jogadores.add(new Jogador("Wanessa Camargo", 0));
        jogadores.add(new Jogador("Yasmin Brunet", 0));

    }

    private static void votar() {
        String votoEm = "";
        Boolean encontrado;
        do{
            votoEm = JOptionPane.showInputDialog(null, "Em quem você vota para sair da casa? ");
            encontrado = false;
            for (Jogador jog : jogadores){
                //votar na pessoa
                if(jog.getNome().equals(votoEm)){
                    jog.incrementaUmVoto();
                    JOptionPane.showMessageDialog(null, "Voto computado com sucesso.");
                    encontrado = true;
                    break;
                }
            }
            if(!"sair".equals(votoEm) && !encontrado){
                JOptionPane.showMessageDialog(null, "Pessoa não encontrada.");
            }
        }while(!"sair".equals(votoEm));
  }

    private static void apurar() {
        //Apurar votos
        String eliminado = "";
        int votos = 0;
        //Descobrir quem teve mais votos
        for (Jogador jog : jogadores) {
            if(jog.getVotos() > votos){
                votos = jog.getVotos();
                eliminado = jog.getNome();
            }
        }
        if(!eliminado.equals("")){
            JOptionPane.showMessageDialog(null, "Se eu conseguir mover montanhas, se eu conseguir surfar um tsunami, se eu conseguir domar o sol, se eu conseguir fazer o mar virar sertão, \ne o sertão virar mar, se eu conseguir dizer o que eu nunca vou conseguir dizer, aí terá chegado o dia em que eu vou conseguir te eliminar com alegria. \nCom " + votos + " votos, é você quem sai " + eliminado + ".");
        }
    }

    public static void main(String[] args) {
        new GUI();
    }
}
