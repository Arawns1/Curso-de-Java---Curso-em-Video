/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caculandomedia;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class CaculandoMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a sua primeira nota:");
        float n1 = teclado.nextFloat();
        System.out.print("Digite a sua segunda nota:");
        float n2 = teclado.nextFloat();
        float m = (n1 + n2)/ 2;
        System.out.printf("A media entre %.2f e %.2f e: %.2f ", n1, n2, m);
        if (m > 9){
            System.out.println("Parabéns!");
        }
    }
    
}
