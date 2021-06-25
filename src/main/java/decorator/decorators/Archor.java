package decorator.decorators;

import decorator.base.Goblin;
import decorator.base.IGoblin;

public class Archor extends GoblinDecorator {
    public Archor(IGoblin goblin) {
        super(goblin);
    }
    @Override
    public void newGoblin(Goblin g){
        goblin.newGoblin(g);
        agregarArco(g);
    }

    private void agregarArco(Goblin g) {
        int atk=g.getAtk();
        g.setAtk(atk+3);
        System.out.println("\n"+"ATK: "+g.getAtk()+"\nDEF: "+g.getDef()+"\nSPEED: "+g.getSpeed()+"\n");
    }
}
