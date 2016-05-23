package com.filipe.cursojava.aula43.exercicios;

public class ContaBancaria {

	private String nomeCliente;
	private int numConta ;
	private double saldo;
	
	public ContaBancaria(String nome, int conta, double saldo) {
		this.setNomeCliente(nome);
		this.setNumConta(conta);
		this.setSaldo(saldo);
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public boolean sacar(double valor){
		if(this.saldo - valor >=0){
			this.saldo = this.saldo -valor;
			System.out.println("Saldo Atualizado: "+this.saldo);
			return true;
		}else{
			System.out.println("Valor n�o dispon�vel");
			return false;
		}	
	}
	
	public boolean depositar(double valor){
		this.saldo = this.saldo + valor;
		System.out.println("Saldo Atualizado: "+this.saldo);
		return true;
	}
}
