/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication19;

/**
 *
 * @author Gabriel
 */
public class JavaApplication19 {

    /**
     * @param args the command line arguments
     */
    public static int main(String[] args) {
      int a = 0;
      int b = 0;
        try{
          return a/b;
      }catch(RuntimeException e){
          return -1;
      }
        catch(ArithmeticException e){
          return 0;
      }finally{
          System.out.println("Concluído");
      }
    }
    
}
