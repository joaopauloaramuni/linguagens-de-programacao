import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        exercicio1();
        exercicio2();
        exercicio3();
    }
    //1) Escreva um programa que mostre os números pares múltiplos de 3,
    //positivos até o número 1000.
    private static void exercicio1() {
        int cont = 0;
        for(int i = 2; i <= 1000; i+=2){ // i+=2 -> i = i + 2;
            if(i % 3 == 0){ // operador de módulo verifica o resto da divisão
                cont++;
            }
        }
        System.out.println("Quantidade de números pares múltiplos de 3 de 2 até 1000: " + cont);
    }
    //2) Faça um programa que leia 10 números inteiros e calcule e mostre ao
    //final a soma e a média.
    private static void exercicio2() {
        Scanner scn = new Scanner(System.in);
        int numero;
        int soma = 0;
        for(int i = 1; i <= 10; i++){
            System.out.println("Digite o número: ");
            numero = scn.nextInt();
            soma = soma + numero;
        }
        System.out.println("A soma é: " + soma);
        System.out.println("A média é: " + (soma/10));
    }
    //3) Escreva um programa que calcule a área de 4 cômodos de uma casa. O
    //programa deverá ler a largura e comprimento de cada cômodo, calcular e
    //mostrar a área de cada um.
    private static void exercicio3() {
        Scanner scn = new Scanner(System.in);
        double largura = 0.0;
        double comprimento = 0.0;
        double area = 0.0;
        for(int i = 1; i <= 4; i++){
            System.out.print("Digite a largura do " + i + "° cômodo: ");
            largura = scn.nextDouble();
            System.out.print("Digite o comprimento do " + i + "° cômodo: ");
            comprimento = scn.nextDouble();
            area = largura * comprimento;
            System.out.println("A área do " + i + "° cômodo é: " + area);
        }
    }
}
