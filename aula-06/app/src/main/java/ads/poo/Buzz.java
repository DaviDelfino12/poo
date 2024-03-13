package ads.poo;

import java.util.Random;

public class Buzz {

    //Atributos
    private boolean capacete = true;
    private String[] falas = {"Ao infinito, e além!", 
                            "Eu sou Buzz Lightyear do Comando Estelar",     
                            "Meu objetivo é deter Zurg!",   
                            "Você viu meu amigo Woody por aí?", 
                            "Isto não é voar. Isto é cair, com estilo!",
                            "Preparando para voar!"};
    private boolean asas;
    
    //Métodos

    public boolean isCapaceteAberto(){
        return capacete;
    }

    
    public String laser(){
        return "Disparando laser";
    }

    
    public String golpear(){
        return "Golpeando";
    }


    public boolean mudarCapacete() {
        capacete = !capacete;
        return capacete;
    }

    public boolean mudarAsas(){
        asas = !asas;
        return asas;
    }

    
    public String frasesBuzz() {
        Random r = new Random();
        return falas[r.nextInt(6)];
    }

    



}
