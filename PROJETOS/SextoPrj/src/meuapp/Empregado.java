package meuapp;

import java.io.Serializable;
import java.util.Date;

public class Empregado implements Serializable {

	private static final long serialVersionUID = -7718847802421381774L;

	private String nome;
	private double salario;
	private Date dataEntrada;

	public Empregado() {

	}

	public Empregado(String nome, double salario, Date dataEntrada) {
		super();
		this.nome = nome;
		this.salario = salario;
		this.dataEntrada = dataEntrada;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Date getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	@Override
	public String toString() {
		return "Empregado [nome=" + nome + ", salario=" + salario + ", dataEntrada=" + dataEntrada + "]";
	}

}
