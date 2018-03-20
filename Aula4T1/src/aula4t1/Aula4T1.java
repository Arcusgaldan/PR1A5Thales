/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4t1;

import java.util.Scanner;

/**
 *
 * @author Thales
 */
public class Aula4T1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//Inicializa o scanner
        System.out.print("Insira o número inicial: ");
        int inicio = scan.nextInt(); //Lê o primeiro numero
        System.out.print("Insira o número final: ");
        int fim = scan.nextInt();//Lê o último número
        for(inicio = inicio; inicio <= fim; inicio++)//Inicia o laço 
            System.out.println(inicio);//Imprime o número
    }
    
}
