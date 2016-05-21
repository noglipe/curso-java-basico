package com.filipe.cursojava.aula29;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro van = new Carro("Fiat");
		
		van.modelo = "Ducato";
		van.numeroDePassageiros = 10;
		van.capacidadeDeCombustvel = 100;
		van.consumoDeCombustivel = 0.2;
		
		System.out.println(van.marca);
		
		
	}

}
