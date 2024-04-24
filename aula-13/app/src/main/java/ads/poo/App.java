package ads.poo;

import java.util.ArrayList;
import java.util.HashMap;

public class App {

    
    public static void main(String[] args) {
        
        HashMap<String, Livro> bancoDeDados = new HashMap<>();        
        
        
        ArrayList<Autor> autor1 = new ArrayList<>();
       
        Autor isaac = new Autor("Isaac Asimov", "Estadunidense");

        autor1.add(isaac);

        Livro a = new Livro("Eu, Robô", 70.0, autor1, "9780194230698");


        ArrayList<Autor> autor2 = new ArrayList<>();

        Autor csl = new Autor("C.S Lewis", "Irlandês");

        autor2.add(csl);

        Livro b = new Livro("Os 4 Amores", 50.0, autor2, "9780006207993");

        
        ArrayList<Autor> autoresJava = new ArrayList<>();
        
        Autor deitel = new Autor("Deitel", "Estadunidense");

        autoresJava.add(deitel);

        Livro javaComoProgramar = new Livro ("Java como programar", 70.0, autoresJava, "123");

        bancoDeDados.put(javaComoProgramar.getIsbn(), javaComoProgramar);
        
        Livro l = bancoDeDados.get("123");
        if (l !=null){
            Autor outro = new Autor("outro", "Br");
            l.addAutor(outro);
        }

    }
}