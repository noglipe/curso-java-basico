package com.filipe.cursojava.aula29;

public class Carro {
	
	String marca;
	String modelo;
	int numeroDePassageiros;
	double capacidadeDeCombustvel;
	double consumoDeCombustivel;
	
	Carro(){
		System.out.println("Classe Carro foi instanciada");
		this.numeroDePassageiros = 4;
	}
	
	Carro(String marca){
		this.marca = marca;
		this.numeroDePassageiros = 3;
	}
	
	void exibirAutonomia(){		
		System.out.println("A auntonomia do "+modelo +" é: "+capacidadeDeCombustvel*consumoDeCombustivel +" Km");
	}
	
	double obterAutonomia(){
		return capacidadeDeCombustvel * consumoDeCombustivel;
	}
	

}