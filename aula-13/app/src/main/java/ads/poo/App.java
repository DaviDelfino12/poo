package ads.poo;

import java.util.ArrayList;

public class App {

    
    public static void main(String[] args) {
        
        ArrayList<Autor> autor1 = new ArrayList<>();
       
        Autor isaac = new Autor("Isaac Asimov", "Estadunidense");

        autor1.add(isaac);

        Livro a = new Livro("Eu, Robô", 70.0, autor1, "9780194230698");


        ArrayList<Autor> autor2 = new ArrayList<>();

        Autor csl = new Autor("C.S Lewis", "Irlandês");

        autor2.add(csl);

        Livro b = new Livro("Os 4 Amores", 50.0, autor2, "9780006207993");

        

    }
}