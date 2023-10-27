package meuapp;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ExemploArrayList2 {
	public static void main(String[] args) {
		// Gerar a loteria aleatória
		ArrayList<Integer> numerosLoteria = gerarNumerosLoteria(6, 1, 60);
		System.out.println(numerosLoteria);
		// Ler o número do usuário
		int numeroEscolhido = lerNumero();

		// Verificar se o número acertou na loteria
		boolean acertou = verificarAcerto(numeroEscolhido, numerosLoteria);

		// Exibir o resultado
		if (acertou) {
			System.out.println("Parabéns! Seu número acertou na loteria.");
		} else {
			System.out.println("Não foi dessa vez. Tente novamente.");
		}
	}

	// Método para gerar os números da loteria aleatoriamente
	private static ArrayList<Integer> gerarNumerosLoteria(int quantidadeNumeros, int minimo, int maximo) {
		ArrayList<Integer> numerosLoteria = new ArrayList<>();
		Random random = new Random();

		while (numerosLoteria.size() < quantidadeNumeros) {
			int numero = random.nextInt(maximo - minimo + 1) + minimo;
			if (!numerosLoteria.contains(numero)) {
				numerosLoteria.add(numero);
			}
		}

		return numerosLoteria;
	}

	// Método para ler o número do usuário via teclado
	private static int lerNumero() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite um número entre 1 e 60: ");
		int numero = scanner.nextInt();
		scanner.close();
		return numero;
	}

	// Método para verificar se o número do usuário acertou na loteria
	private static boolean verificarAcerto(int numeroEscolhido, ArrayList<Integer> numerosLoteria) {
		return numerosLoteria.contains(numeroEscolhido);
	}
}
