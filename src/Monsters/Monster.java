package Monsters;

import Abilities.Attack;

import java.util.HashMap;
import java.util.Objects;
import java.util.Random;

public abstract class Monster {
    private Integer maxHP;
    private Integer hp;
    private Integer xp;
    private HashMap<String, Integer> items;

    Integer agi;
    Integer def;
    Integer str;
    Attack attack;


    public Monster(Integer maxHP, Integer xp, HashMap<String, Integer> items){
        this.maxHP = maxHP;
        hp = this.maxHP;
        this.xp = xp;
        this.items = items;
    }

    public Monster attackTarget(Monster monster){return monster;}

    int getHp(){return hp;}
    void setHp(Integer hp){this.hp = hp;}

    Integer getXp(){return xp;}
    HashMap<String, Integer> getItems(){return items;}
    void setItems(HashMap<String, Integer> items){this.items = items;}
    Integer getMaxHp(){return maxHP;}

    public Integer getAgi() { return agi; }

    public Integer getDef() { return def; }

    public Integer getStr() { return str; }

    Integer getAttribute(Integer min, Integer max){
        Random rand = new Random();
        if (min > max){
            Integer temp = min;
            min = max;
            max = temp;
        }
        return rand.nextInt(max-min) + min;
    }

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
