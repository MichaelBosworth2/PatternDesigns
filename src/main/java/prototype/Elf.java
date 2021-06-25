package prototype;

public class Elf extends Character{
    public String element;

    public Elf(){

    }

    public Elf(Elf target){
        super(target);
        if (target != null){
            this.element = target.element;
        }
    }

    @Override
    public Character clone(){
        return new Elf(this);
    }

    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("::::::::::::::").append("STATISTICS").append("::::::::::::::\n");
        str.append("\n\tName: ").append(name);
        str.append("\n\tType: Elf");
        str.append("\n\tHealth: ").append(health);
        str.append("\n\tAttack: ").append(attack);
        str.append("\n\tSkill: ").append(skill);
        str.append("\n\tElement: ").append(element);
        return str.toString();
    }
}
