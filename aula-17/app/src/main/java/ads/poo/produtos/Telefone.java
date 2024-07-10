package ads.poo.produtos;

public class Telefone {

    private int codigo;
    private String numSerie;
    private String modelo;
    private double peso;
    
    
    
    public Telefone(int codigo, String numSerie, String modelo, double peso) {
        this.codigo = codigo;
        this.numSerie = numSerie;
        this.modelo = modelo;
        this.peso = peso;
        
    }


    
    public String imprimirDados() {
        return "Telefone [codigo=" + codigo + ", numSerie=" + numSerie + ", modelo=" + modelo + ", peso=" + peso + "]";
    }

    
    
}
