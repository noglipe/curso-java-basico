package com.filipe.cursojava.aula43.exercicios;

public class Teste {

	public static void main(String[] args) {

		ContaPoupanca cliente1 = new ContaPoupanca("Filipe Nogeuira", 2345643, 450.5);
		cliente1.setDiaRendimento(0.5);
		
		ContaEspecial cliente2 = new ContaEspecial(2000, "Guilherme Silva" , 22334465, 300);
		
		cliente1.depositar(100.3);
		cliente2.depositar(600.55);
		
		cliente1.sacar(600);
		cliente2.sacar(1000.03);
			
		cliente1.calcularNovoSaldo();
		
		System.out.println("Cliente: "+cliente1.getNomeCliente());
		System.out.println("Conta n�mero: "+cliente1.getNumConta());
		System.out.println("Saldo: "+cliente1.getSaldo());
		System.out.println("Rendimento ao dia: "+cliente1.getDiaRendimento());
		
		System.out.println("Cliente: "+cliente2.getNomeCliente());
		System.out.println("Conta n�mero: "+cliente2.getNumConta());
		System.out.println("Saldo: "+cliente2.getSaldo());
		System.out.println("Limite: "+cliente2.getLimite());
		
		
		

	}

}
