package Monsters;

import java.util.HashMap;
import java.util.Objects;

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

    int getHp(){return hp;}
    void setHp(int hp){this.hp = hp;}
    int getXp(){return xp;}
    HashMap<String, Integer> getItems(){return items;}
    void setItems(HashMap<String, Integer> items){this.items = items;}
    int getMaxHp(){return maxHP;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Monster)) return false;
        Monster monster = (Monster) o;
        return Objects.equals(maxHP, monster.maxHP) &&
                Objects.equals(getHp(), monster.getHp()) &&
                Objects.equals(getXp(), monster.getXp()) &&
                Objects.equals(getItems(), monster.getItems());
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxHP, getHp(), getXp(), getItems());
    }

    @Override
    public String toString() {
        return "hp=" + hp+"/"+maxHP;

    }
}
