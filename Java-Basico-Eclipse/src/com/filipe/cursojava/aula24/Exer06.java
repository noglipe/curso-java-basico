package com.filipe.cursojava.aula24;

public class Exer06 {
	
	public static void main(String[] args){
		
		ContatoCelular contato1 = new ContatoCelular();
		
		contato1.nome = "joão";
		contato1.endereco = "Av Java, 1000";
		contato1.email = "joao@java.com";
		
		contato1.telefones = new String[5];
		
		contato1.telefones[0] = "(31)9999-9999";
	}

}
