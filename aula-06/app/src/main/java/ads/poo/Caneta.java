package ads.poo;
public class Caneta {

    // Atributos
    private String cor;
    private int carga;

    // Métodos

   
    public Caneta(String cor, int carga) {
        this.carga = carga;
        this.cor = cor;
    }


    public Caneta(String cor) {
        // this.carga = 100;
        // this.cor = cor;
        this(cor, 100);
    }

    public Caneta() {
        // this.carga = 100;
        // this.cor = "vermelho";
        this("vermelho", 100);
    }
   
   
   
    // public String usandoCaneta(){
    //     if (carga == 0) {
    //         return "Não há tinta";
    //     } else {
    //         carga--;
    //         return "Desenhando na cor " + cor;
    //     }
        
    
    // }

    

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    


    
}
