package com.filipe.cursojava.aula25;

public class Carro {
	
	String marca;
	String modelo;
	int numeroDePassageiros;
	double capacidadeDeCombustvel;
	double consumoDeCombustivel;
	
	void exibirAutonomia(){
		
		System.out.println("A auntonomia do "+modelo +" é: "+capacidadeDeCombustvel*consumoDeCombustivel +" Km");
		
	}
	
	double obterAutonomia(){
		return capacidadeDeCombustvel * consumoDeCombustivel;
	}
	

}

