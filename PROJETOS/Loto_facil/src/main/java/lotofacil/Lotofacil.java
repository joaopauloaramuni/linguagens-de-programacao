package lotofacil;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Lotofacil {
    public static void main(String[] args) throws IOException{
        menu();
    }

    private static void menu() throws IOException{
        int opcao = -1;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("***********************************");
            System.out.println("******** PROJETO LOTOFÁCIL ********\n");
            System.out.println("Opção 1 - Apostar de 0 a 100");
            System.out.println("Opção 2 - Apostar de A a Z");
            System.out.println("Opção 3 - Apostar em par ou ímpar");
            System.out.println("Opção 0 - Sair");
            System.out.println("***********************************");
            System.out.print("Digite a opção: ");
            opcao = in.nextInt();
            switch (opcao) {
                case 1:
                    aposta1();
                    break;
                case 2:
                    aposta2();
                    break;
                case 3:
                    aposta3();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Você digitou uma opção inválida.\n");
                    break;
            }
        } while (opcao != 0);
    }

    private static void aposta1() {
        System.out.println("\nAposta de 0 a 100");
        Random rnd = new Random();
        int sorteio = rnd.nextInt(101);
        // System.out.println("Numero sorteado: " + sorteio);
        Scanner in = new Scanner(System.in);
        System.out.print("Digite sua aposta, de 0 a 100: ");
        int aposta = in.nextInt();
        if(aposta == sorteio){
            System.out.println("Você ganhou milzão.");
        }else {
            System.out.println("Você perdeu!, o número sorteado foi: " + sorteio);
        }
    }

    private static void aposta2() throws IOException {
        System.out.println("\nAposta de A a Z");
        char letraSorteada = 'J';
        System.out.print("Digite a letra de A a Z: ");
        char letraApostada = (char)System.in.read();

        if(Character.isLetter(letraApostada)){
            char letraApostadaMaiusculo = Character.toUpperCase(letraApostada);
            if(letraApostadaMaiusculo == letraSorteada){
                System.out.println("Você ganhou quinhentão.\n");
            }else {
                System.out.println("Você perdeu!, a letra sorteada foi: " + letraSorteada + "\n");
            }
        }else{
            System.out.println("Não é uma letra válida.");
        }
    }

    private static void aposta3() {
        System.out.println("\nAposta em par ou ímpar");
        System.out.print("Digite um número: ");
        Scanner in = new Scanner(System.in);
        int numeroDigitado = in.nextInt();
        if(numeroDigitado % 2 == 0){
            System.out.println("Você ganhou cenzão.");
        }else{
            System.out.println("Você perdeu!");
        }
    }
}
