package RPG.srcCode;

public class enemy extends entity{

    public enemy(String name, String desc, String intro, int hp, int maxHp, int dmg, int lvl, int xp, boolean isAlive) {
        super(name,desc, intro, hp, maxHp, dmg, lvl, xp, isAlive);
        //TODO Auto-generated constructor stub
        this.name = name;
        
    }

    // getters
	public String getEnemName() {
        return this.name;
    }

    public String getEnemDesc() {
        return this.desc;
    }

    public String getEnemIntro() {
        return this.intro;
    }

    public int getEnemHp() {
        return this.hp; 
    }

    public int getEnemXp() {
        return this.xp;
    }
    
    // setters
    public void setEnemName(String name) {
        this.name = name; 
    }

    public void setEDesc(String desc) {
        this.desc = desc;
    }

    public void setEIntro(String intro) {
        this.intro = intro;
    }

    public void setEhp() {
        this.hp = hp;
    }
 
    
}
