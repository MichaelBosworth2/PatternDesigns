package state.estados;

import state.data.State;
import state.data.Tamagochi;

public class Aburrido implements State {
private Tamagochi tamagochi;
    @Override
    public void jugar() {
System.out.println("Juguemos!!!");
tamagochi.setState(new Cansado());
    }

    @Override
    public void alimentar() {

        System.out.println("No quiero comer, estoy aburrido");
    }

    @Override
    public void dormir() {
System.out.println("No quiero dormir estoy aburrido");
    }

    @Override
    public void comoEstas() {
System.out.println("Estoy aburrido");
    }

    @Override
    public void setTamogochi(Tamagochi tamagochi) {
this.tamagochi= tamagochi;
    }
}
