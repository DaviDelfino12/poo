package ads.poo;
public class Caneta {

    // Atributos
    private String cor = "preto";
    private int carga = 10;

    // Métodos

    public String usandoCaneta(){
        if (carga == 0) {
            return "Não há tinta";
        } else {
            carga--;
            return "Desenhando na cor " + cor;
        }
        
    }

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
