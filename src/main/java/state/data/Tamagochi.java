package state.data;

import state.estados.Aburrido;

public class Tamagochi {
    private State estado;
    public Tamagochi(){
        setState(new Aburrido());
    }

    public void setState(State estado) {
        this.estado = estado;
        this.estado.setTamogochi(this);

    }
    public void alimentar(){
        this.estado.alimentar();
    }
    public void dormir(){
        this.estado.dormir();
    }
    public void jugar(){
        this.estado.jugar();
    }
    public  void comoEstas(){
        this.estado.comoEstas();
    }
}
