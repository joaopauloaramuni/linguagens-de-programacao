package meuapp;

import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {
        menu();
    }
    private static void menu() {
        System.out.println("Exemplo do while");
        int opcao = -1;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("********** Sistema de Cadastro **********");
            System.out.println("Opção 1: Cadastrar cliente");
            System.out.println("Opção 2: Cadastrar produto");
            System.out.println("Opção 3: Cadastrar vendedor");
            System.out.println("Opção 0: Sair");
            System.out.println("*****************************************");
            System.out.print("Digite a opção: ");
            opcao = in.nextInt();
            System.out.println("*****************************************");
            switch (opcao){
                case 1:
                    System.out.println("Opção 1 escolhida.");
                    // cadastrarCliente();
                    break;
                case 2:
                    System.out.println("Opção 2 escolhida.");
                    // cadastrarProduto();
                    break;
                case 3:
                    System.out.println("Opção 3 escolhida.");
                    // cadastrarVendedor();
                    break;
                case 0:
                    System.out.println("Opção 0 escolhida.");
                    // Sair
                    break;
                default:
                    System.out.println("O número escolhido é inválido!");
            }
        }while(opcao != 0);
    }
}
