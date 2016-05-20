package com.filipe.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        /*System.out.println("Digite seu nome completo:");
        String nomeCompleto = scan.nextLine();
        System.out.println("Seu Nome Completo é: "+nomeCompleto);
        
        System.out.println("Digite seu Primeiro Nome:");
        String primeiroNome = scan.next();
        System.out.println("Seu Primeiro Nome é: "+primeiroNome);
        
        System.out.println("Digite Sua Idade:");
        int idade = scan.nextInt();
        System.out.println("Sua Idade é :"+idade);
        */
        
        System.out.println("Digite seu Nome, idade, se tem filhos e altura");
        String primeiroNome = scan.next();
        int idade = scan.nextInt();
        boolean temFilho = scan.nextBoolean();
        
        System.out.println("Voce Digitou: ");
        System.out.println(primeiroNome);
        System.out.println(idade);
        System.out.println(temFilho);
        
    }
    
}
