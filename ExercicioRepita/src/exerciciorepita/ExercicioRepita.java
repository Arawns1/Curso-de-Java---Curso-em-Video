/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;

import javax.swing.JOptionPane;
/**
 *
 * @author Gabriel
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int n, s=0, par=0, impar=0, cem=0, qntd=0;
      do{
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html> Digite um valor:<br>Para abortar <strong>digite 0</strong> a qualquer momento </html>", "input dialog",JOptionPane.INFORMATION_MESSAGE));
        s += n;
        if (n%2 == 0){
          par++;  
        }
        else{
           impar++;
        }
        if (n > 100){
            cem++;
        }
        qntd++;
        
      }while(n != 0);
      
      int media = s/qntd-1;
      
     JOptionPane.showMessageDialog(null, "Total dos Valores: " + (qntd-1) + "\nSoma dos valores: " + s +"\nTotal de pares: " + (par-1) + "\nTotal de impares: " +impar+"\nAcima de 100: " + cem + "\nMedia dos valores: " + media, "Tela de exercícios",JOptionPane.INFORMATION_MESSAGE);
      
      
    }
    
}
