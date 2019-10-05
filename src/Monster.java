import java.util.HashMap;

public abstract class Monster {
    private Integer maxHP;
    private Integer hp;
    private Integer xp;
    private HashMap<String, Integer> items;

    public Monster(Integer maxHP, Integer xp, HashMap<String, Integer> items){
        this.maxHP = maxHP;
        hp = this.maxHP;
        this.xp = xp;
        this.items = items;
    }

    @Override
    public String toString() {
        return "hp=" + hp+"/"+maxHP;

    }
}
