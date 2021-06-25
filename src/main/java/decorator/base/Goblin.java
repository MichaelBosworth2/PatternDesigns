package decorator.base;

public class Goblin {
    int atk=1;
    int speed=1;
    int def=1;
    public int getAtk() {
        return atk;
    }
    public Goblin() {
    }
    public void setAtk(int atk) {
        this.atk = atk;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getDef() {
        return def;
    }
    public void setDef(int def) {
        this.def = def;
    }
    public Goblin(int atk, int speed, int def) {
        this.atk = atk;
        this.speed = speed;
        this.def = def;
    }
}
