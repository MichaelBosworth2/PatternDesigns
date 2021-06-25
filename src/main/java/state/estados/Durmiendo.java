package state.estados;

import state.data.State;
import state.data.Tamagochi;;

import java.util.Timer;
import java.util.TimerTask;

public class Durmiendo implements State {
    private Tamagochi tamagochi;
    @Override
    public void jugar() {
        System.out.println("No quiero estoy cansado");
    }

    @Override
    public void alimentar() {

        System.out.println(" ... ");
    }

    @Override
    public void dormir() {
        System.out.println(" ... ");
        tamagochi.setState(new Durmiendo());
    }

    @Override
    public void comoEstas() {
        System.out.println("zzzz");
    }

    @Override
    public void setTamogochi(Tamagochi tamagochi) {
        this.tamagochi= tamagochi;
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Durmiendo.this.tamagochi.setState(new Hambriento());
            }
        },7000);
    }
}
