package com.filipe.cursojava.exercicios.aula13;

import java.util.Scanner;

public class Exercicio4 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe 4 número");
        int numero1 = scan.nextInt();
        int numero2 = scan.nextInt();
        int numero3 = scan.nextInt();
        int numero4 = scan.nextInt();
        System.out.println("A média deles e: " + (numero1+numero2+ numero3+numero4)/2);
        
        
    }
            
    
}
