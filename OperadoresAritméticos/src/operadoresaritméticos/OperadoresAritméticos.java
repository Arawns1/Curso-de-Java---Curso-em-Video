/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoresaritméticos;

/**
 *
 * @author Gabriel
 */
public class OperadoresAritméticos {
    public static void main(String[] args) {

        try{
/*         int n1 = 2;
*          int n2 = 5;
*          float media = (n1 + n2)/2;
*        
*        System.out.printf("A média é igual a %.2f", media);
*/
        
        int numero = 5;
        numero++;
        System.out.println(numero);
        }
        catch(RuntimeException e){
            System.out.println("Erro! \n" + e.getMessage() + "\n" + e.getCause() + "\n" + e.getClass().getCanonicalName());
        }
        
    }
    
}
