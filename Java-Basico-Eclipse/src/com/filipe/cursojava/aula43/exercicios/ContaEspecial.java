package com.filipe.cursojava.aula43.exercicios;

public class ContaEspecial extends ContaBancaria{
	
	private double limite;

	public ContaEspecial(double limite, String nome, int conta, double saldo) {
		super(nome, conta, saldo);
		this.limite = limite;
	}
	
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public boolean sacar(double valor){
		if(valor <= this.getLimite()){
			double saldo = super.getSaldo() - valor;
			super.setSaldo(saldo);	
			return true;
		}else{
			System.out.println("Valor n�o dispon�vel \nSeu limite � de: "+this.getLimite());
			return false;
		}			
	}

}
