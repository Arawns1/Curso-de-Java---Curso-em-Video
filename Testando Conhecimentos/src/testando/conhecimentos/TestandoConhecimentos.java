
package testando.conhecimentos;

import java.util.Scanner;

public class TestandoConhecimentos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite seu nome:");
        String nome = teclado.nextLine();
        System.out.print("Digite sua idade:");
        int idade = teclado.nextInt();
        
        System.out.println("Oi " + nome + " sua idade é: " + idade + " anos");
    }
    
}
