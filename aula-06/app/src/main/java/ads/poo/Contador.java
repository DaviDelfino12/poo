package ads.poo;

public class Contador {

    private int num;

    public void incrementar(double i) {
        i++;
        num+=i;
    }

    public void atribuir(double a) {
        a = num; 

    }

    public int obter() {
        return num;
    }

    
}
