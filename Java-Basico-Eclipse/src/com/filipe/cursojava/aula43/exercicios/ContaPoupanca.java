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
	
	public boolean sacar(double valor){
		if(super.getSaldo() - valor >=0){
			super.setSaldo(super.getSaldo() -valor); 
			System.out.println("Saldo Atualizado: "+super.getSaldo());
			return true;
		}else{
			System.out.println("Valor n�o dispon�vel");
			return false;
		}	
	}

}
