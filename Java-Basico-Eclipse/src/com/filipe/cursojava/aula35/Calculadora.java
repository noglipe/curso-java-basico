package com.filipe.cursojava.aula35;

public class Calculadora {

	public static int fatrialRecursivo(int num){
		
		if(num ==0){
			return 1;
		}
		
		return num * fatrialRecursivo(num-1);
	}
	
}

