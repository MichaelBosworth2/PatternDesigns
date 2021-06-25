package state.estados;

import state.data.State;
import state.data.Tamagochi;

public class Cansado implements State {
    private Tamagochi tamagochi;
    @Override
    public void jugar() {
        System.out.println("No quiero estoy cansado");
    }

    @Override
    public void alimentar() {

        System.out.println("No quiero comer, estoy con suenio");
    }

    @Override
    public void dormir() {
        System.out.println("A mimir");
        tamagochi.setState(new Durmiendo());
    }

    @Override
    public void comoEstas() {
        System.out.println("Tengo sueñi");
    }

    @Override
    public void setTamogochi(Tamagochi tamagochi) {
        this.tamagochi= tamagochi;
    }
}
