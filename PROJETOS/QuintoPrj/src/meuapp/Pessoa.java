package meuapp;

/**
 * Representa uma pessoa da agenda utilizada em {@link ExemploArrayList3}.
 */
public class Pessoa {

	private String nome;
	private String endereco;
	private String telefone;

	public Pessoa() {
	}

	public Pessoa(String nome, String endereco, String telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone + "]";
	}
}
