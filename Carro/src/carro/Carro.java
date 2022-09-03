
package carro;

public class Carro {

    public static void main(String[] args) {
        Veiculo van = new Veiculo();
        Veiculo moto = new Veiculo();
        
        System.out.println(van.Cor("Azul"));
        System.out.println(van.Assento(10));
        System.out.println(van.tipoVeiculo("Van"));
        System.out.println("=================");
        System.out.println(moto.Cor("verde"));
        System.out.println(moto.Assento(1));
        System.out.println(moto.tipoVeiculo("moto"));
        

        
        
        
    }
    
}
