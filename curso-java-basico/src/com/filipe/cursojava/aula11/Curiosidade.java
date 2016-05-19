package com.filipe.cursojava.aula11;

public class Curiosidade {
    
     public static void main(String[] args){
        
        int var1 = 2147483647;
        
        int var2 = 1;
        
        int decimal = 26;
        int hexidecimal = 0x1a;
        int octadecimal = 032;
        int binario = 0b11010;
        
        // 123.4 == 1.234e2 e2=10 elevado a 2
        double c1= 123.4;
        double c2= 1.234e2;
        
         System.out.println(var1 + var2);
         System.out.println("decimal " +decimal);
         System.out.println("hexidecimal " +hexidecimal);
         System.out.println("octadecimal " +octadecimal);
         System.out.println("binario " +binario);
         System.out.println(+c1+" " +c2);
     }
    
}
