import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercícios Loops");
        exercicio1();
        exercicio2();
        exercicio3();
    }
    /* Faça um algoritmo que leia X números, faça a leitura
    dos números e imprima quantos números são pares e quantos números são impares.
    O algoritmo pára quando o usuário digitar 0. */
    private static void exercicio1() {
        int contpar = 0;
        int contimpar = 0;
        int num = -1;
        Scanner scn = new Scanner(System.in);
        while(num!=0){
            System.out.println("Digite o número: ");
            num = scn.nextInt(); //lendo o número
            if(num != 0){
                if(num % 2 == 0){ //operador de módulo
                    contpar = contpar + 1; //contpar++;
                }else{
                    contimpar = contimpar + 1; //contimpar++;
                }
            } //else sai do loop
        }
        System.out.println("A quantidade de números pares é: " + contpar);
        System.out.println("A quantidade de números ímpares é: " + contimpar);
    }
    /* Faça um algoritmo que leia X números, faça a contagem dos números e a soma e
    imprima ambos. O algoritmo pára quando o usuário digitar -1.*/
    private static void exercicio2() {
        int cont = 1;
        int soma = 0;
        int num = 0;
        Scanner scn = new Scanner(System.in);
        while(num != -1){
            System.out.println("Digite o " + cont + "° número:");
            num = scn.nextInt(); //lendo a variável
            if(num != -1) {
                cont = cont + 1; //cont++;
                soma = soma + num; //soma+=num;
            }
        }
        System.out.println("Total de números digitados: " + (cont - 1));
        System.out.println("Soma dos números: " + soma);
    }
    /*Faça um programa que receba três notas, calcule e mostre a média
    aritmética entre elas.*/
    private static void exercicio3() {
        Scanner scn = new Scanner(System.in);
        Double nota;
        Double soma = 0.0;
        for(int i = 1; i <= 3; i++){
            System.out.println("Digite a " + i + "ª nota:");
            nota = scn.nextDouble();
            soma = soma + nota;
        }
        System.out.println("A soma das notas foi: " + soma);
        System.out.println("A média das notas foi: " + (soma/3));
    }
}
