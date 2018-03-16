/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr1a5;

import java.util.Arrays;

/**
 *
 * @author Thales
 */


public class A05Damas {
    
    public static void mostraTabuleiro(String[][] tabuleiro){ //Mostra o tabuleiro preenchido na tela.
        System.out.println("   --- --- --- --- --- --- --- ---");
        System.out.printf("1 | %s | %s | %s | %s | %s | %s | %s | %s |\n", tabuleiro[0][0], tabuleiro[0][1], tabuleiro[0][2], tabuleiro[0][3], tabuleiro[0][4], tabuleiro[0][5], tabuleiro[0][6], tabuleiro[0][7]);
        System.out.println("   --- --- --- --- --- --- --- ---");
        System.out.printf("2 | %s | %s | %s | %s | %s | %s | %s | %s |\n", tabuleiro[1][0], tabuleiro[1][1], tabuleiro[1][2], tabuleiro[1][3], tabuleiro[1][4], tabuleiro[1][5], tabuleiro[1][6], tabuleiro[1][7]);
        System.out.println("   --- --- --- --- --- --- --- ---");
        System.out.printf("3 | %s | %s | %s | %s | %s | %s | %s | %s |\n", tabuleiro[2][0], tabuleiro[2][1], tabuleiro[2][2], tabuleiro[2][3], tabuleiro[2][4], tabuleiro[2][5], tabuleiro[2][6], tabuleiro[2][7]);
        System.out.println("   --- --- --- --- --- --- --- ---");
        System.out.printf("4 | %s | %s | %s | %s | %s | %s | %s | %s |\n", tabuleiro[3][0], tabuleiro[3][1], tabuleiro[3][2], tabuleiro[3][3], tabuleiro[3][4], tabuleiro[3][5], tabuleiro[3][6], tabuleiro[3][7]);
        System.out.println("   --- --- --- --- --- --- --- ---");
        System.out.printf("5 | %s | %s | %s | %s | %s | %s | %s | %s |\n", tabuleiro[4][0], tabuleiro[4][1], tabuleiro[4][2], tabuleiro[4][3], tabuleiro[4][4], tabuleiro[4][5], tabuleiro[4][6], tabuleiro[4][7]);
        System.out.println("   --- --- --- --- --- --- --- ---");
        System.out.printf("6 | %s | %s | %s | %s | %s | %s | %s | %s |\n", tabuleiro[5][0], tabuleiro[5][1], tabuleiro[5][2], tabuleiro[5][3], tabuleiro[5][4], tabuleiro[5][5], tabuleiro[5][6], tabuleiro[5][7]);
        System.out.println("   --- --- --- --- --- --- --- ---");
        System.out.printf("7 | %s | %s | %s | %s | %s | %s | %s | %s |\n", tabuleiro[6][0], tabuleiro[6][1], tabuleiro[6][2], tabuleiro[6][3], tabuleiro[6][4], tabuleiro[6][5], tabuleiro[6][6], tabuleiro[6][7]);
        System.out.println("   --- --- --- --- --- --- --- ---");
        System.out.printf("8 | %s | %s | %s | %s | %s | %s | %s | %s |\n", tabuleiro[7][0], tabuleiro[7][1], tabuleiro[7][2], tabuleiro[7][3], tabuleiro[7][4], tabuleiro[7][5], tabuleiro[7][6], tabuleiro[7][7]);
        System.out.println("   --- --- --- --- --- --- --- ---");
        System.out.println("    1   2   3   4   5   6   7   8");
    }
    
    public static String[][] inicializaTabuleiro(){
        String[][] tabuleiro = new String[8][8];
        
        for(int linha = 0; linha < 8; linha++){
            for(int coluna = 0; coluna < 8; coluna++){
                switch(linha){
                    case 0:
                        if(coluna % 2 == 1)
                            tabuleiro[linha][coluna] = "B";
                        else
                            tabuleiro[linha][coluna] = " ";
                        break;
                    case 1:
                        if(coluna % 2 == 0)
                            tabuleiro[linha][coluna] = "B";
                        else
                            tabuleiro[linha][coluna] = " ";
                        break;
                    case 2:
                        if(coluna % 2 == 1)
                            tabuleiro[linha][coluna] = "B";
                        else
                            tabuleiro[linha][coluna] = " ";
                        break;
                    case 3:
                        tabuleiro[linha][coluna] = " ";
                        break;
                    case 4:
                        tabuleiro[linha][coluna] = " ";
                        break;
                    case 5:
                        if(coluna % 2 == 0)
                            tabuleiro[linha][coluna] = "W";
                        else
                            tabuleiro[linha][coluna] = " ";
                        break;
                    case 6:
                        if(coluna % 2 == 1)
                            tabuleiro[linha][coluna] = "W";
                        else
                            tabuleiro[linha][coluna] = " ";
                        break;
                    case 7:
                        if(coluna % 2 == 0)
                            tabuleiro[linha][coluna] = "W";
                        else
                            tabuleiro[linha][coluna] = " ";
                        break;
                }
            }
        }
        return tabuleiro;
    }
    
    public static void main(String[] args) {
        String[][] tabuleiro = inicializaTabuleiro();
        mostraTabuleiro(tabuleiro);
    }
}
