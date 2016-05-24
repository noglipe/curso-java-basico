package com.lipe.cursojava.aula38;

public class Professor extends Pessoa {


	private double salario;
	private String depatarmento;
	private String nomeCurso;
	
	
	public double getSalario() {
		return salario;
	}
	public String getDepatarmento() {
		return depatarmento;
	}
	public void setDepatarmento(String depatarmento) {
		this.depatarmento = depatarmento;
	}
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double calcularSalarioLiquido(){
		return 0;
	}
	
	
}
