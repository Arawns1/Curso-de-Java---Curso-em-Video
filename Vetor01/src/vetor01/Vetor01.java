/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor01;

import java.util.Arrays;

/**
 *
 * @author Gabriel
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*int n[] = {3,2,8,7,5,4};
        for(int i = 0; i < n.length; i++){
            System.out.println(n[i]);
            
        }
        */
        int num[] = {3, 5, 8, 2};
        Arrays.sort(num);
        for(int valor: num){
            System.out.print(valor);
}
    }
    
}
