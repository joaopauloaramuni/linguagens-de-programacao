package meuapp;

import java.io.Serializable;
import java.util.Date;

public class Gerente extends Empregado implements Serializable {

	private static final long serialVersionUID = -7633327157673107837L;

	public Gerente() {
		super();
	}

	public Gerente(String nome, double salario, Date dataEntrada) {
		super(nome, salario, dataEntrada);
	}

	@Override
	public String toString() {
		return "Gerente [nome=" + getNome() + ", salario=" + getSalario() + ", dataEntrada=" + getDataEntrada() + "]";
	}
}
