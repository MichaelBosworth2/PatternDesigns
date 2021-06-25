package state.estados;

import state.data.State;
import state.data.Tamagochi;

public class Hambriento implements State {
    private Tamagochi tamagochi;
    @Override
    public void jugar() {
        System.out.println("No quiero estoy hambriento");
    }

    @Override
    public void alimentar() {

        System.out.println("ñom ñom");
    }

    @Override
    public void dormir() {
        System.out.println("no quiero dormir, tengo hambre");
        tamagochi.setState(new Durmiendo());
    }

    @Override
    public void comoEstas() {
        System.out.println("Dame de comer");
    }

    @Override
    public void setTamogochi(Tamagochi tamagochi) {
        this.tamagochi= tamagochi;
    }
}
