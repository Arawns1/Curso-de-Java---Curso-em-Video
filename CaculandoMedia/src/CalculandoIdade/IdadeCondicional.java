/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package CalculandoIdade;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class IdadeCondicional {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite seu ano de nascimento:");
        int nasc = teclado.nextInt();
        int i = 2022 - nasc;
        System.out.printf("Sua idade e: " + i + "\n");
        if (i >= 18){
            System.out.println("Maior");
        }
        else{
            System.out.println("Menor de idade");
        }
        
    }
}
