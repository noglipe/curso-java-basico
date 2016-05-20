package com.filipe.cursojava.exercicios.array;

import java.util.Scanner;

public class JogoDaVelha {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
   
        System.out.println("Informe o nome dos jogadores: ");
        String JogadorUm = scan.next();
        String JogadorDois = scan.next();
    
        int[][] tabuleiro = new int[3][3];

        //zera o tabuleiro
        for (int cont = 0; cont < 3; cont++) {
            for (int cont2 = 0; cont2 < 3; cont2++) {
                tabuleiro[cont][cont2] = 0;
            }
        }

        boolean fim = false;
        int linha, coluna, jogadas;

        jogadas = 0;
        int vencedor = 0;

        do {

            //Exibir
            for (int cont = 0; cont < 3; cont++) {
                for (int cont2 = 0; cont2 < 3; cont2++) {
                    System.out.print(tabuleiro[cont][cont2] + " ");
                }
                System.out.println("");
            }

            System.out.println("Jogador 1 informe a coluna e a linha da sua jogada respectivamente:");
            linha = scan.nextInt();
            coluna = scan.nextInt();

            if (tabuleiro[linha - 1][coluna - 1] == 0) {
                tabuleiro[linha - 1][coluna - 1] = 1;
                jogadas++;
            } else {
                System.out.println("Posicao Ocupada! passou a sua vez");
            }

            for (int cont = 0; cont < 3; cont++) {
                for (int cont2 = 0; cont2 < 3; cont2++) {
                    System.out.print(tabuleiro[cont][cont2] + " ");
                }
                System.out.println("");
            }

            if (jogadas >= 5) {

                //testando linhas              
                if (tabuleiro[0][0] == tabuleiro[0][1] && tabuleiro[0][1] == tabuleiro[0][2] && tabuleiro[0][0]!=0) {
                    fim = true;
                    vencedor = tabuleiro[0][0];
                }
                if (tabuleiro[1][0] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[1][2] && tabuleiro[0][0]!=0) {
                    fim = true;
                    vencedor = tabuleiro[1][0];
                }
                if (tabuleiro[2][0] == tabuleiro[2][1] && tabuleiro[2][1] == tabuleiro[2][2] && tabuleiro[0][0]!=0) {
                    fim = true;
                    vencedor = tabuleiro[2][0];
                }

                //testando colunas
                if (tabuleiro[0][0] == tabuleiro[1][0] && tabuleiro[1][0] == tabuleiro[2][0] && tabuleiro[0][0]!=0) {
                    fim = true;
                    vencedor = tabuleiro[0][0];
                }
                if (tabuleiro[0][1] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][1] && tabuleiro[0][0]!=0) {
                    fim = true;
                    vencedor = tabuleiro[0][1];
                }
                if (tabuleiro[0][2] == tabuleiro[1][2] && tabuleiro[1][2] == tabuleiro[2][2] && tabuleiro[0][0]!=0) {
                    fim = true;
                    vencedor = tabuleiro[0][2];
                }

                //diagonais
                if (tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][2] && tabuleiro[0][0]!=0) {
                    fim = true;
                    vencedor = tabuleiro[0][0];
                }
                if (tabuleiro[0][2] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][0] && tabuleiro[0][0]!=0) {
                    fim = true;
                    vencedor = tabuleiro[0][2];
                }

            }

            if (fim != true) {
                System.out.println("Jogador 2 informe a linha e a coluna da sua jogada respectivamente:");
                linha = scan.nextInt();
                coluna = scan.nextInt();

                if (tabuleiro[linha - 1][coluna - 1] == 0) {
                    tabuleiro[linha - 1][coluna - 1] = 2;
                    jogadas++;

                } else {
                    System.out.println("Posicao Ocupada! passou a sua vez");
                }

                if (jogadas >= 5) {

                    //testando linhas              
                    if (tabuleiro[0][0] == tabuleiro[0][1] && tabuleiro[0][1] == tabuleiro[0][2] && tabuleiro[0][0]!=0) {
                        fim = true;
                        vencedor = tabuleiro[0][0];
                    }
                    if (tabuleiro[1][0] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[1][2] && tabuleiro[0][0]!=0) {
                        fim = true;
                        vencedor = tabuleiro[1][0];
                    }
                    if (tabuleiro[2][0] == tabuleiro[2][1] && tabuleiro[2][1] == tabuleiro[2][2] && tabuleiro[0][0]!=0) {
                        fim = true;
                        vencedor = tabuleiro[2][0];
                    }

                    //testando colunas
                    if (tabuleiro[0][0] == tabuleiro[1][0] && tabuleiro[1][0] == tabuleiro[2][0] && tabuleiro[0][0]!=0) {
                        fim = true;
                        vencedor = tabuleiro[0][0];
                    }
                    if (tabuleiro[0][1] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][1] && tabuleiro[0][0]!=0) {
                        fim = true;
                        vencedor = tabuleiro[0][1];
                    }
                    if (tabuleiro[0][2] == tabuleiro[1][2] && tabuleiro[1][2] == tabuleiro[2][2] && tabuleiro[0][0]!=0) {
                        fim = true;
                        vencedor = tabuleiro[0][2];
                    }

                    //diagonais
                    if (tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][2] && tabuleiro[0][0]!=0) {
                        fim = true;
                        vencedor = tabuleiro[0][0];
                    }
                    if (tabuleiro[0][2] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][0] && tabuleiro[0][0]!=0) {
                        fim = true;
                        vencedor = tabuleiro[0][2];
                    }

                }
            }

        } while (fim == false);
        
        if(vencedor == 1){
            System.out.println(JogadorUm+" Venceu!");
        }else{
            System.out.println(JogadorDois+" Venceu!");
        }

    }

}
