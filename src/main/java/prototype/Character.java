package prototype;

public abstract class Character {
    public int health;
    public int attack;
    public String skill;
    public String name;

    public Character(){

    }

    public Character(Character target){
        if (target != null){
            this.name = target.name;
            this.health = target.health;
            this.attack = target.attack;
            this.skill = target.skill;
        }
    }

    public abstract Character clone();
}
