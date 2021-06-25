package decorator.data;

import decorator.base.Goblin;
import decorator.base.IGoblin;

public class ParticularGoblin implements IGoblin {

    @Override
    public void newGoblin(Goblin g) {
      System.out.println("Se ha creado un nuevo goblin");
    }
}
