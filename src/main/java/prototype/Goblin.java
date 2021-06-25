package prototype;

public class Goblin extends Character{
    public int multiplyBuilding;

    public Goblin(){

    }

    public Goblin(Goblin target){
        super(target);
        if (target != null){
            this.multiplyBuilding = target.multiplyBuilding;
        }
    }

    @Override
    public Character clone(){
        return new Goblin(this);
    }

    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("::::::::::::::").append("STATISTICS").append("::::::::::::::\n");
        str.append("\n\tName: ").append(name);
        str.append("\n\tType: Goblin");
        str.append("\n\tHealth: ").append(health);
        str.append("\n\tAttack: ").append(attack);
        str.append("\n\tSkill: ").append(skill);
        str.append("\n\tDamage to building: x").append(multiplyBuilding);
        return str.toString();
    }
}
