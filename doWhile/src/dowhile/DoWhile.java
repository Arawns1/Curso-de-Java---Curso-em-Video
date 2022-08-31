/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dowhile;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class DoWhile {

    
    public static void main(String[] args) {
       int n, s=0;
       String resp;
       Scanner teclado = new Scanner(System.in);
       do{
           System.out.println("Digite um número: ");
           n = teclado.nextInt();
           s += n;
           System.out.println("Quer continuar? [S/N]");
           resp = teclado.next();
       }while(resp.equals("S"));
        
        System.out.println("A soma de todos os números é:" + s);
    }
    
}
