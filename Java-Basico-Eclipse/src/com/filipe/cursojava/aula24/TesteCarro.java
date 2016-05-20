package com.filipe.cursojava.aula24;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro van = new Carro();
		Carro fusca = new Carro();
		
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numeroDePassageiros = 10;
		van.capacidadeDeCombustvel = 100;
		van.comsumoDeCombustivel = 0.2;
		
		fusca.marca = "Volkswagem";
		fusca.modelo = "Fusca";
		fusca.numeroDePassageiros = 4;
		fusca.capacidadeDeCombustvel = 30;
		fusca.comsumoDeCombustivel = 0.15;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		System.out.println(van.numeroDePassageiros);
		System.out.println();
		System.out.println(fusca.marca);
		System.out.println(fusca.modelo);
		System.out.println(fusca.numeroDePassageiros);
		
	}

}
