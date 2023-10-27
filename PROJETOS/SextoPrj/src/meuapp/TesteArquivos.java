package meuapp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TesteArquivos {
	public static void main(String[] args) {
		String path = "teste.txt";
		try {
			escritor(path);
			leitor(path);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static void escritor(String path) throws IOException {
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
		String linha = "";
		Scanner in = new Scanner(System.in);
		System.out.println("Escreva algo: ");
		linha = in.nextLine();
		buffWrite.append(linha + "\n");
		buffWrite.close();
		in.close();
	}

	private static void leitor(String path) throws IOException {
		File arquivo = new File(path);
		if (arquivo.exists()) {

			BufferedReader buffRead = new BufferedReader(new FileReader(path));
			String linha = "";
			while (true) {
				if (linha != null) {
					System.out.println(linha);

				} else
					break;
				linha = buffRead.readLine();
			}
			buffRead.close();
		} else {
			throw new FileNotFoundException("Arquivo não encontrado.");
		}
	}

}
