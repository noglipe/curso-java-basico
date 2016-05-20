
package com.filipe.cursojava.aula19;

public class Arrays {
    
    public static void main(String[] args){
        
        double[] temperaturas = new double[365];
        
        temperaturas[0] = 31.3;
        temperaturas[1] = 37;
        temperaturas[2] = 32.6;
        temperaturas[3] = 30;
        
        System.out.println("A temperatura 1 é: "+temperaturas[0]);
    
        System.out.println("O tamno do array " + temperaturas.length);
        
    }
    
}
