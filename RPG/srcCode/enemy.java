package RPG.srcCode;

public class enemy extends entity{


    private String ename, edesc, eintro;
    private int ehp, emaxHp, edmg, elvl, exp;
    private boolean isAlive;

    public enemy(String name, String desc, String intro, int hp, int maxHp, int dmg, int lvl, int xp, boolean isAlive) {
        super(name, desc, intro, hp, maxHp, dmg, lvl, xp, isAlive);
        //TODO Auto-generated constructor stub
    }

    
    /*public enemy(String name, String desc, String intro, int hp, int maxHp, int dmg, int lvl, int xp, boolean isAlive) {
        super(name,desc, intro, hp, maxHp, dmg, lvl, xp, isAlive);
        //TODO Auto-generated constructor stub
         this.name = ename;
        
    }*/

	public String getEnemName() {
        return this.ename;
    }

    public String getEnemDesc() {
        return edesc;
    }

    public String getEnemIntro() {
        return eintro;
    }

    public int getEnemHp() {
        return ehp; 
    }

    public int getEnemXp() {
        return this.exp;
    }
    
    // setters
    public void setEnemName(String ename) {
        this.ename = ename; 
    }

    public void setEDesc(String edesc) {
        this.edesc = edesc;
    }

    public void setEIntro(String eintro) {
        this.eintro = eintro;
    }

    public void setEhp() {
        this.ehp = ehp;
    }

    public void setEmaxHp() {
        this.emaxHp = emaxHp;
    }
 
    
}
