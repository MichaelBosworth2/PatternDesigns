package decorator.decorators;

import decorator.base.Goblin;
import decorator.base.IGoblin;

public abstract class GoblinDecorator implements IGoblin {
    protected IGoblin goblin;

    public GoblinDecorator(IGoblin goblin){
        this.goblin=goblin;
    }
    @Override
    public void newGoblin(Goblin g){
        this.goblin.newGoblin(g);
    }
}
