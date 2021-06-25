package decorator.decorators;

import decorator.base.Goblin;
import decorator.base.IGoblin;

public class Helmet extends GoblinDecorator{
    public Helmet(IGoblin goblin) {
        super(goblin);
    }
    @Override
    public void newGoblin(Goblin g){
        goblin.newGoblin(g);
        agregarHelmet(g);
    }

    private void agregarHelmet(Goblin g) {
        int def=g.getDef();
        g.setDef(def+3);
        System.out.println("\n"+"ATK: "+g.getAtk()+"\nDEF: "+g.getDef()+"\nSPEED: "+g.getSpeed()+"\n");
    }
}
