package meuapp;

import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;

public class ConverterJavaJSON {

	public static void main(String[] args) {
		Informacoes obj = new Informacoes();
		Gson gson = new Gson();

		// converte objetos Java para JSON e retorna JSON como String
		String json = gson.toJson(obj);

		try {
			// Escreve Json convertido em arquivo chamado "file.json"
			FileWriter writer = new FileWriter("file.json");
			writer.write(json);
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}	

		System.out.println(json);

	}

}
