package meuapp;

import java.util.Scanner;

public class Teste {
	public static void main(String[] args) throws java.io.IOException {

		// Demonstra o laço while
		/*
		 * char ch; // exibe o alfabeto usando um laço while ch = 'a'; while(ch <= 'z')
		 * { System.out.print(ch); ch++; }
		 */

		// Adivinhe a letra do jogo, 4a versão.
		char ch, ignore, answer = 'K';
		do {
			System.out.println("I'm thinking of a letter between A and Z.");
			System.out.print("Can you guess it: ");

			// lê um caractere
			ch = (char) System.in.read();

			// descarta qualquer outro caractere do buffer de entrada
			do {
				ignore = (char) System.in.read();
			} while (ignore != '\n');

			if (ch == answer)
				System.out.println("** Right **\n");
			else {
				System.out.print("...Sorry, you're ");

				if (ch < answer)
					System.out.println("too low");
				else
					System.out.println("too high");

				System.out.println("Try again!\n");
			}

		} while (answer != ch);

		// Usando break para sair de um laço.
		int num = 100;
		// executa o laço enquanto i ao quadrado é menor do que num
		for (int i = 0; i < num; i++) {
			if (i * i >= num)
				break; // encerra o laço se i*i >= 100
			System.out.print(i + " ");
		}
		System.out.println("Loop complete.");

		// Usando continue.
		int i;
		// exibe os números pares entre 0 e 100
		for (i = 0; i <= 100; i++) {
			if ((i % 2) != 0)
				continue; // iterate
			System.out.println(i);
		}
		
		// in representa o teclado
		Scanner in = new Scanner(System.in);
		
		System.out.println("\nDigite seu nome: ");
		String nome = in.nextLine();
		System.out.println("Digite sua idade: ");
		int idade = in.nextInt();
		System.out.println("Digite seu salário: ");
		double salario = in.nextDouble();
		in.close();
		
		System.out.println("\n" + nome + "\n" + idade + "\n" + salario);
		
		// Formatação de saída
		double x = 10000.0 / 3.0;
		
		System.out.print(x);			 	// 3333,3333333333335
		
		System.out.printf("%, .3f", x);	 	// 3.333,333
		
		System.out.printf("R$ %, .2f", x);	// R$ 3.333,33

	}
}
