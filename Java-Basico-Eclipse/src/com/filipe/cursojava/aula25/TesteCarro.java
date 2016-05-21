package com.filipe.cursojava.aula25;

public class TesteCarro {

	public static void main(String[] args) {

		Carro van = new Carro();
		Carro fusca = new Carro();
		
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numeroDePassageiros = 10;
		van.capacidadeDeCombustvel = 100;
		van.consumoDeCombustivel = 0.2;
		
		fusca.marca = "Volkswagem";
		fusca.modelo = "Fusca";
		fusca.numeroDePassageiros = 4;
		fusca.capacidadeDeCombustvel = 30;
		fusca.consumoDeCombustivel = 0.15;
		
		van.exibirAutonomia();
		fusca.exibirAutonomia();
		
		System.out.println("\nA auntonomia do "+van.modelo +" �: "+van.obterAutonomia() +" Km");
		System.out.println("A auntonomia do "+fusca.modelo +" �: "+fusca.obterAutonomia() +" Km");
		

	}

}
