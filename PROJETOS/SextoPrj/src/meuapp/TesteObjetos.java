package meuapp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class TesteObjetos {

	public static void main(String[] args) {
		try {
			escritor();
			leitor();
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static void escritor() throws IOException {
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("empregado.dat"));

		Empregado e1 = new Empregado("João", 2500, new Date());
		Gerente g1 = new Gerente("Maria", 3800, new Date());
		out.writeObject(e1);
		out.writeObject(g1);

		out.close();

	}

	private static void leitor() throws IOException, ClassNotFoundException {

		File arquivo = new File("empregado.dat");
		if (arquivo.exists()) {

			ObjectInputStream in = new ObjectInputStream(new FileInputStream("empregado.dat"));

			Empregado e1 = (Empregado) in.readObject();
			Gerente g1 = (Gerente) in.readObject();

			System.out.println(e1.toString());
			System.out.println(g1.toString());

			in.close();
		} else {
			throw new FileNotFoundException("Arquivo não encontrado.");
		}

	}
}
