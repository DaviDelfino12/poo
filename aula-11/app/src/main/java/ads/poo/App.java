package ads.poo;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        
        ArrayList<String> nomes = new ArrayList<>();

        String s = "Deive";

        nomes.add(s);

        nomes.add("Alex");
        nomes.add("André");

        System.out.println(nomes);

        
        // if (!nomes.isEmpty()){
        //     nomes.clear();
        // }    
        
        
        // nomes.remove(s);

       
       // for i
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println("Nomes: " + nomes.get(i));
        }


        // for each
        for (String elemento :nomes) {
            System.out.println("Nome: " + elemento);
        }


    }
}