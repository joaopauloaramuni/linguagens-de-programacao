import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercício Loops");
        exercicio1();
        exercicio2();
    }
    /* Exercício 1:
    Faça um algoritmo que leia X números, faça a leitura dos números e imprima quantos
    números são pares e quantos números são impares. O algoritmo pára quando o usuário digitar 0. */
    private static void exercicio1() {
        int contpar = 0;
        int contimpar = 0;
        int num = -1;
        Scanner scn = new Scanner(System.in);
        while(num != 0){
            System.out.println("Digite um número, para encerrar digite 0.");
            num = scn.nextInt(); //lendo a variável do teclado
            if(num != 0){
                if(num % 2 == 0){ //Se o resto da divisão por 2 for 0 então é par
                    contpar = contpar + 1; // ou contpar++
                }else{
                    contimpar = contimpar + 1; // ou contimpar++
                }
            } //else sai do loop
        }
        System.out.println("A quantidade de números pares é: " + contpar);
        System.out.println("\nA quantidade de números ímpares é: " + contimpar);
    }
    /* Exercício 2:
    Faça um algoritmo que leia X números, faça a contagem e a soma dos números e imprima a mesma.
    O algoritmo pára quando o usuário digitar -1. */
    private static void exercicio2() {
        int num = -999;
        int contnum = 0;
        int soma = 0;
        Scanner scn = new Scanner(System.in);
        while(num != -1){
            System.out.println("Digite um número, para encerrar digite -1.");
            num = scn.nextInt(); //lendo a variável do teclado
            if(num != -1){
                contnum = contnum + 1; // ou contnum++ Contando os números
                soma = soma + num; // Somando os números
            }
        }
        System.out.println("A quantidade de números digitados é: " + contnum);
        System.out.println("A soma dos números digitados é: " + soma);
    }
}