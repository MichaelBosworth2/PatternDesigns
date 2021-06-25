package prototype;

public class Orc extends Character{

    public Orc(){

    }

    public Orc(Orc target){
        super(target);
    }

    @Override
    public Character clone(){
        return new Orc(this);
    }

    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("::::::::::::::").append("STATISTICS").append("::::::::::::::\n");
        str.append("\n\tName: ").append(name);
        str.append("\n\tType: Orc");
        str.append("\n\tHealth: ").append(health);
        str.append("\n\tAttack: ").append(attack);
        str.append("\n\tSkill: ").append(skill);
        return str.toString();
    }
}
