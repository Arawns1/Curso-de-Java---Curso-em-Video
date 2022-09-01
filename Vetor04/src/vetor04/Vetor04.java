/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor04;

import java.util.Arrays;
/**
 *
 * @author Gabriel
 */
public class Vetor04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int vet[] = {3, 7, 6, 1, 9, 4, 2};
       int p = Arrays.binarySearch(vet, 121);
       for(int v:vet){
           System.out.print(v + " ");
       }
        System.out.println("Encontre o valor 1 na posicao:" + p);
    }
    
}
