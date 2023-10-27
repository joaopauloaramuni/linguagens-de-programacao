package meuapp;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Vector;

public class ExemploExcecoes {

	public static void main(String[] args) {
		Estoque est = new Estoque(0, 200);

		try {
			est.decrementaEstoque(100);
		} catch (EIException e) {
			System.out.println(e.getMessage() + "  Produto: " + e.getCodProduto() + "  Estoque: " + e.getQtdeEstoque());
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw e; // <- relançar exceção
		} finally {
			// Exemplos
			// Fechar arquivo
			// Encerrar conexão com o banco de dados
			// Mensagem padrão, etc
			System.out.println("Programa finalizado.");
		}

		try {
			leDados();
		} catch (ClassNotFoundException e) {
			System.out.println("O arquivo de dados não é compatível. " + "Um novo arquivo será criado!");
		} catch (IOException e) {
			System.out.println("Arquivo de dados não encontrado. " + "Um novo arquivo será criado!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Programa finalizado.");
		}

	}

	@SuppressWarnings("unchecked")

	private static void leDados() throws IOException, ClassNotFoundException {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("estoque.dat"));
		ArrayList<Estoque> estoque = new ArrayList<Estoque>();
		estoque = (ArrayList<Estoque>) in.readObject();
		System.out.println(estoque);
		in.close();
	}

	public class Pedido {
		// ...
		public void adicionaItem(Estoque est, int qtde) throws EIException {
			// . . .
			est.decrementaEstoque(qtde); // <-lança a exceção
			// . . .
		}
	}

}
