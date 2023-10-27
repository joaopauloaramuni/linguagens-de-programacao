package montyhall;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;

public class MontyHallGUI extends JFrame {
    private JPanel painel = new JPanel();
    private JButton jButtonJogar = new JButton("Jogar");
    public MontyHallGUI() {
        this.setTitle("** Monty Hall **");
        this.setSize(200, 150);
        painel.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 40));
        painel.setBackground(new Color(255, 255, 255));
        jButtonJogar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jogar();
            }
        });
        painel.add(jButtonJogar);
        this.getContentPane().add(painel);
        this.setLocationRelativeTo(null); // Centralizar janela
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true); // Exibir janela
    }

    private static void jogar() {
        String portaEscolhida = JOptionPane.showInputDialog(null, "Escolha uma porta (1, 2 ou 3): ");
        int portaEscolhidaInt = Integer.parseInt(portaEscolhida);
        // Validar a entrada do usuário
        if (portaEscolhidaInt < 1 || portaEscolhidaInt > 3) {
            JOptionPane.showMessageDialog(null, "Escolha inválida. O número da porta deve ser 1, 2 ou 3.");
        } else {
            Random random = new Random();
            // Definir a porta premiada
            int portaPremiada = random.nextInt(3) + 1;

            // Simulação da abertura de uma das outras portas vazias
            int portaVazia = -1;
            do {
                portaVazia = random.nextInt(3) + 1;
            } while (portaVazia == portaPremiada || portaVazia == portaEscolhidaInt);
            JOptionPane.showMessageDialog(null, "O apresentador abriu a porta " + portaVazia + ", que está vazia.");

            // Oferecer a opção de trocar de porta ou não
            String opcao = JOptionPane.showInputDialog(null, "Você deseja trocar para a outra porta? (s/n): ");
            boolean trocarPorta = opcao.equalsIgnoreCase("s");

            // Determinar a nova porta escolhida (caso o jogador opte por trocar)
            int portaEscolhidaOriginal = portaEscolhidaInt;
            if (trocarPorta) {
                do {
                    portaEscolhidaInt = random.nextInt(3) + 1;
                } while (portaEscolhidaInt == portaVazia || portaEscolhidaInt == portaEscolhidaOriginal);
                JOptionPane.showMessageDialog(null, "Você trocou para a porta " + portaEscolhidaInt + ".");
            }

            // Determinar o resultado final
            if (portaEscolhidaInt == portaPremiada) {
                JOptionPane.showMessageDialog(null, "Você ganhou! Parabéns!");
            } else {
                JOptionPane.showMessageDialog(null, "Você perdeu. A porta premiada era a " + portaPremiada + ".");
            }

            // Resultado final
            JOptionPane.showMessageDialog(null, "Porta premiada: " + portaPremiada + " // Porta vazia: " + portaVazia + " // Porta escolhida: " + portaEscolhidaInt + " // Porta escolhida Originalmente: " + portaEscolhidaOriginal);
        }
    }

    public static void main(String[] args) {
        new MontyHallGUI();
    }
}
