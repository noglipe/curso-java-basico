package com.filipe.cursojava.aula43.exercicios;

public class ContaPoupanca extends ContaBancaria {
	
	private double diaRendimento;
	
	public ContaPoupanca(String nome, int conta, double saldo) {
		super(nome, conta, saldo);
	}

	public double getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(double diaRendimento) {
		this.diaRendimento = diaRendimento;
	}
	
	public void calcularNovoSaldo(){
		super.setSaldo(super.getSaldo()+(super.getSaldo()*this.getDiaRendimento()/100));
		System.out.println("Saldo Atualizado: "+super.getSaldo());
	}

}
