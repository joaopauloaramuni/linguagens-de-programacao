package meuapp;

import java.util.Scanner;

public class ExemploRecursao {

	/**
	 * Fatorial
	 * 
	 * @param n
	 * @return o fatorial de n (n!)
	 */
	// Um exemplo simples de recursão.
	// Esta é uma função recursiva.
	private static int factR(int n) {
		int result;
		if (n == 1) {
			return 1;
		}
		// Executa a chamada recursiva a factR( ).
		result = factR(n - 1) * n;
		return result;
	}

	/**
	 * Máximo Divisor Comum recursivo
	 * 
	 * @param a
	 * @param b
	 * @return O MDC de a e b
	 */
	private static int mdc(int a, int b) {
		if (b == 0) {
			return a;
		}
		return mdc(b, (a % b));
	}

	/**
	 * Conta todos os números pares até n, recursivamente
	 * 
	 * @param n
	 * @return
	 */
	private static int contaPares(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		if (n % 2 == 0) {
			return contaPares(n - 1) + 1;
		} else {
			return contaPares(n - 1);
		}
	}

	/**
	 * Potência recursiva
	 * 
	 * @param n   número a ser elevado
	 * @param pot grau da potência
	 * @return n ^ pot
	 */
	public static double potencia(int n, int pot) {
		if (pot == 1) {
			return n;
		}
		return n * potencia(n, pot - 1);
	}

	/**
	 * Números de Fibonacci
	 * 
	 * @param n
	 * @return O número da sequencia desejado
	 */
	public static int fibo(int n) {
		if (n < 2) {
			return n;
		}
		return fibo(n - 1) + fibo(n - 2);

	}

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite um numero para calcular o fatorial: ");
		int num = ler.nextInt();
		System.out.println(factR(num));

		System.out.println("Digite dois numeros para o MDC: ");
		int num1 = ler.nextInt();
		int num2 = ler.nextInt();
		System.out.println(mdc(num1, num2));

		System.out.println("Digite um numero para contar os pares: ");
		int num3 = ler.nextInt();
		System.out.println(contaPares(num3));

		System.out.println("Digite um numero para calcular a potência: ");
		int num4 = ler.nextInt();
		System.out.println("Digite a potência: ");
		int num5 = ler.nextInt();
		System.out.println(potencia(num4, num5));

		System.out.println("Digite um numero para calcular a Fibonacci: ");
		int num6 = ler.nextInt();
		System.out.println(fibo(num6));
		
		ler.close();

	}
}
