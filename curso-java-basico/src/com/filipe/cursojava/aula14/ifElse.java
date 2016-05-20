package com.filipe.cursojava.aula14;

import java.util.Scanner;

public class ifElse {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe sia idade");
       
        int idade = scan.nextInt();
        String texto;
        
        if(idade>=18){
           texto = "é maior de idade";
        }else{
           texto = "nao é maior de idade";
        }
        
        System.out.println(texto);
        
    }
            
    
}
