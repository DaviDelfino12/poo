package ads.poo;

import java.util.ArrayList;

public class Carro {

    private String modelo;
    private String cor;
    private Motor motor;
    
    
    public Carro(String modelo, String cor, Motor motor) {
        this.modelo = modelo;
        this.cor = cor;
        this.motor = motor;
    }


    public void setMotor(Motor motor) {
        this.motor = motor;
    }


    public Motor getMotor() {
        return motor;
    }

    
    
    
    
}
