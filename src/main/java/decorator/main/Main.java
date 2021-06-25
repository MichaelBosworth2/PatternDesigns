package decorator.main;

import decorator.base.Goblin;
import decorator.base.IGoblin;
import decorator.data.ParticularGoblin;
import decorator.decorators.Archor;
import decorator.decorators.Boots;
import decorator.decorators.Helmet;

public class Main {
public static void main(String args[]){
   Goblin g = new Goblin();
   IGoblin goblin = new ParticularGoblin();
   IGoblin goblinArco = new Archor(goblin);
   IGoblin goblinHelmet = new Helmet(goblinArco);
   IGoblin goblinBoots = new Boots(goblinHelmet);
   goblinBoots.newGoblin(g);

}
}
