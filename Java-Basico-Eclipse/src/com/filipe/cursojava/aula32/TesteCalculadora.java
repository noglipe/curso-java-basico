package com.filipe.cursojava.aula32;

public class TesteCalculadora {

	public static void main(String[] args) {
		
		MinhaCalculadora calc = new MinhaCalculadora();
		
		System.out.println(MinhaCalculadora.soma(1, 2));
		System.out.println(calc.soma(1.5, 2.3));
		System.out.println(calc.soma(1, 2, 3));
		
		int[] vetor = { 1, 2, 3 };
		
		System.out.println(calc.soma(vetor));

	}

}
