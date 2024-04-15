package montyhall;

import java.util.Scanner;
import java.util.Random;

public class MontyHall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo ao jogo Monty Hall!");
        System.out.print("Escolha uma porta (1, 2 ou 3): ");
        int portaEscolhida = scanner.nextInt();

        // Validar a entrada do usuário
        if (portaEscolhida < 1 || portaEscolhida > 3) {
            System.out.println("Escolha inválida. O número da porta deve ser 1, 2 ou 3.");
        } else {
            Random random = new Random();
            // Definir a porta premiada
            int portaPremiada = random.nextInt(3) + 1;

            // Simulação da abertura de uma das outras portas vazias
            int portaVazia = -1;
            do {
                portaVazia = random.nextInt(3) + 1;
            } while (portaVazia == portaPremiada || portaVazia == portaEscolhida);
            System.out.println("O apresentador abriu a porta " + portaVazia + ", que está vazia.");

            // Oferecer a opção de trocar de porta ou não
            System.out.print("Você deseja trocar para a outra porta? (s/n): ");
            String opcao = scanner.next();
            boolean trocarPorta = opcao.equalsIgnoreCase("s");

            // Determinar a nova porta escolhida (caso o jogador opte por trocar)
            int portaEscolhidaOriginal = portaEscolhida;
            if (trocarPorta) {
                do {
                    portaEscolhida = random.nextInt(3) + 1;
                } while (portaEscolhida == portaVazia || portaEscolhida == portaEscolhidaOriginal);
                System.out.println("Você trocou para a porta " + portaEscolhida + ".");
            }

            // Determinar o resultado final
            if (portaEscolhida == portaPremiada) {
                System.out.println("Você ganhou! Parabéns!");
            } else {
                System.out.println("Você perdeu. A porta premiada era a " + portaPremiada + ".");
            }

            // Resultado final
            System.out.println("\nPorta premiada: " + portaPremiada);
            System.out.println("Porta vazia: " + portaVazia);
            System.out.println("Porta escolhida: " + portaEscolhida);
            System.out.println("Porta escolhida Originalmente: " + portaEscolhidaOriginal);
        }
    }
}
