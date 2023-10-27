package meuapp;

import java.sql.*;

public class TesteBD {
	public static void main(String[] args) {
		String url = "jdbc:sqlite:/Users/joaopauloaramuni/eclipse-workspace/NonoPrj/src/bd/BD";
		String usuario = "root";
		String senha = "";

		try {
			// Faz a conexão com o banco de dados
			Connection conexao = DriverManager.getConnection(url, usuario, senha);

			// Cria uma declaração (statement) para executar a query
			Statement statement = conexao.createStatement();

			// Define a query que deseja executar
			String query = "SELECT * FROM Livro WHERE Titulo LIKE 'Introdução%';";

			// Executa a query e obtém o resultado
			ResultSet resultado = statement.executeQuery(query);

			// Percorre o resultado e exibe os valores
			while (resultado.next()) {
				String titulo = resultado.getString("Titulo");
				// ... outros campos

				System.out.println("Titulo: " + titulo);
			}

			// Fecha os recursos
			resultado.close();
			statement.close();
			conexao.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
