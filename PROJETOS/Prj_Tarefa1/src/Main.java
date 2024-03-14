import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        exercicio1();
        exercicio2();
        exercicio3();
        exercicio4();
        exercicio5();
    }

    //1) Faça um programa que receba quatro números inteiros, calcule e
    //mostre a soma desses números.
    private static void exercicio1() {
        int num = 0;
        int soma = 0;
        int cont = 1;
        Scanner scn = new Scanner(System.in);
        while(cont <= 4){
            System.out.println("Digite o " + cont + "° número: ");
            num = scn.nextInt();
            soma = soma + num; // ou soma+=num;
            cont++;
        }
        System.out.println("A soma é: " + soma);
    }

    //2) Faça um programa que receba três notas, calcule e mostre a média
    //aritmética entre elas.
    private static void exercicio2() {
        int cont = 1;
        int nota = 0;
        int soma = 0;
        Scanner scn = new Scanner(System.in);
        while(cont <= 3) {
            System.out.println("\nDigite a " + cont + "ª nota: ");
            nota = scn.nextInt();
            soma = soma + nota;
            cont++;
        }
        System.out.println("A média de notas é: " + soma/3);
    }

    //3) Faça um programa que receba o salário de um funcionário, calcule e
    //mostre o novo salário, sabendo-se que este sofreu um aumento de 25%.
    private static void exercicio3() {
        Scanner scn = new Scanner(System.in);
        System.out.println("\nDigite o salário: ");
        double salario = scn.nextDouble();
        double aumento = salario * 0.25;
        double novoSalario = salario + aumento;
        System.out.println("Você obteve um aumento de: " + aumento);
        System.out.println("Seu novo salário é: " + novoSalario);
    }

    //4) Faça um programa que receba o salário de um funcionário e o
    //percentual de aumento, calcule e mostre o valor do aumento e o novo
    //salário.
    private static void exercicio4() {
        Scanner scn = new Scanner(System.in);
        System.out.println("\nDigite o salário: ");
        double salario = scn.nextDouble();
        System.out.println("\nDigite o percentual de aumento: ");
        double percentualAumento = scn.nextDouble();
        double aumento = salario * (percentualAumento / 100);
        double novoSalario = salario + aumento;
        System.out.println("Você obteve um aumento de: " + aumento);
        System.out.println("Seu novo salário é: " + novoSalario);
    }

    //5) Faça um programa que receba o salário base de um funcionário,
    //calcule e mostre o salário a receber, sabendo-se que o funcionário tem
    //gratificação de 5% sobre o salário base e paga imposto de 7% sobre este
    //salário.
    private static void exercicio5() {
        Scanner scn = new Scanner(System.in);
        System.out.println("\nDigite o salário: ");
        double salario = scn.nextDouble();
        double gratificacao = salario * 0.05;
        double novoSalario = salario + gratificacao;
        double imposto = novoSalario * 0.07;
        double novoSalarioDescontado = novoSalario - imposto;
        System.out.println("Sua gratificação foi de 5%: " + gratificacao);
        System.out.println("Seu novo salário com a gratificação é: " + novoSalario);
        System.out.println("O imposto de 7% será de: " + imposto);
        System.out.println("Seu novo salário descontado do imposto é: " + novoSalarioDescontado);
    }
}
