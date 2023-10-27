package meuapp;

import java.util.ArrayList;
import java.util.List;

public class Informacoes {

	private int cod_id = 500;
	private String nome = "Aramuni";

	private List<String> listaPreferencias = new ArrayList<String>() {
		{
			add("Python");
			add("JavaScript");
			add("Java");
		}
	};

	public int getCod_id() {
		return cod_id;
	}

	public void setCod_id(int cod_id) {
		this.cod_id = cod_id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<String> getListaPreferencias() {
		return listaPreferencias;
	}

	public void setListaPreferencias(List<String> listaPreferencias) {
		this.listaPreferencias = listaPreferencias;
	}

	public String toString() {
		return "Informacoes [id =" + cod_id + ", Nome =" + nome + ", Preferências =" + listaPreferencias + "]";
	}

}