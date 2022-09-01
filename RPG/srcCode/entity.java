package RPG.srcCode;

public class entity {
    public String name, desc, intro;
    public int hp, maxHp, dmg, lvl, xp; 
    public boolean isAlive;
    public entity(String name, String desc, String intro, int hp, int maxHp, int dmg, int lvl, int xp, boolean isAlive) {
        this.name = name; 
        this.desc = desc;
        this.intro = intro; 
        this.hp = hp; 
        this.maxHp = maxHp; 
        this.dmg = dmg;
        this.lvl = lvl;
        this.xp = xp;
        this.isAlive = isAlive; 
    }
}
