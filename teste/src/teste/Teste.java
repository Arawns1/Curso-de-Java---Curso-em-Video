/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teste;

import java.util.Arrays;
import java.util.List;

public class Teste {

    
    public static void main(String[] args) {
        List<String>objetos = Arrays.asList("garrafa","copo");
        for(int tam = objetos.size() - 1; tam >=0; tam--){
            System.out.print(objetos.get(tam)+ ",");
        }
    }
    
}
