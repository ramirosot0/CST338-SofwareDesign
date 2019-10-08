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

    int getHp(){return hp;}
    void setHp(int hp){this.hp = hp;}
    int getXp(){return xp;}
    HashMap<String, Integer> getItems(){return items;}
    void setItems(HashMap<String, Integer> items){this.items = items;}
    int getMaxHp(){return maxHP;}
    //boolean equals(Object object){}
    //int hashCode(){}


    @Override
    public String toString() {
        return "hp=" + hp+"/"+maxHP;

    }
}
