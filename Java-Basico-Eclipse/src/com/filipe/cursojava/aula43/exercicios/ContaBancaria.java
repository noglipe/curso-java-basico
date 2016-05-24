package com.filipe.cursojava.aula43.exercicios;

public abstract class ContaBancaria {

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
	
	public abstract boolean sacar(double valor);
	
	public boolean depositar(double valor){
		this.saldo = this.saldo + valor;
		System.out.println("Saldo Atualizado: "+this.saldo);
		return true;
	}
}
