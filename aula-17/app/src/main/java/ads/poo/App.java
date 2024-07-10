package ads.poo;

import ads.poo.produtos.Semfio;
import ads.poo.produtos.Telefone;

public class App {

    public static void main(String[] args) {
        
        
        Telefone telefone = new Telefone(1000, "abc123", "Raizer", 6);
        Telefone semfio = new Semfio(70, "123abc", "RaizerPlus", 9, 440, 3, 20);
        Semfio c = (Semfio) semfio;

        System.out.println(telefone.imprimirDados());
        System.out.println(semfio.imprimirDados());
    }
}