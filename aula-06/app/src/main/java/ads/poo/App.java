package ads.poo;

public class App {


    public static void main(String[] args) {

        carro c = new carro();
        carro d = new carro();

        System.out.println("Velocidade" + c.obterVelocidade());

        c.acelerar(10);

        System.out.println("Velocidade" + d.obterVelocidade());

        Contador t = new Contador();

        System.out.println(t.obter());

        t.incrementar(0);
        t.incrementar(0);

        System.out.println(t.obter());
    }


}
