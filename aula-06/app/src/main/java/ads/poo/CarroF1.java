package ads.poo;

public class CarroF1 {

    //Atributos

    private int velocidadeAtual = 0;

  
    //Métodos

    public CarroF1() {
        this.velocidadeAtual = 0;
    }

    public CarroF1(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
        if (this.velocidadeAtual > 200) {
            velocidadeAtual = 0;
        }

        if (this.velocidadeAtual < 0) {
            velocidadeAtual = 0;
        }

    }
    
    public int getvelocidadeAtual() {
        return velocidadeAtual;
    }

    public int acelerar(int a) {
        if (a < 0) {
            return velocidadeAtual;
        }

        if (velocidadeAtual + a <= 200) {
            velocidadeAtual += a;
        } else {
            velocidadeAtual = 200;
        }
        
        return velocidadeAtual;
        
        // velocidadeAtual += a;

        // if (velocidadeAtual > 200) {
        //     velocidadeAtual = 200;
            
        // }
        // return velocidadeAtual;
    }

    public int freiar(int a) {
        if (a < 0) {
            return velocidadeAtual;
        }

        if (velocidadeAtual + a >= 0) {
            velocidadeAtual -= a;
        } else {
            velocidadeAtual = 0;
        }
        
        return velocidadeAtual;

    // public int freiar(int f) {
    //     velocidadeAtual += f;

    //     if (velocidadeAtual < 0 ) {
    //         velocidadeAtual = 0;
    //     }
    //     return velocidadeAtual;
    // }

}

}


    

    