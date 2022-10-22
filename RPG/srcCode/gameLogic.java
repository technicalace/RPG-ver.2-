package RPG.srcCode;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

import RPG.srcCode.biome.myBiome;

public class gameLogic {
    // player variables
    //java.util.Random random = new java.util.Random();


    public String plName;
    public int biomeSel, biomeNum;   

    // enemy variables
    public String enemName;
    String eintro, edesc;
    public int ehp, emaxHp, edmg, elvl, exp;
    public boolean eisAlive;
    public int enemyNums;

    public ArrayList<enemy> enemies = new ArrayList<enemy>();

    
    public player pl = new player(plName, 20, 20, 4, 1, true);

    /*enemy metEnemy1 = new enemy("King Rat", "The king wants blood!", "You hear loud sqeaking and pitter patters...", 19, 19, 7, 1, 5, true);
    enemy metEnemy2 = new enemy("Runaway Train", "It's screeching!", "You hear a thump followed by a screech on the tracks...", 23, 23, 8, 1, 5, true);
    enemy metEnemy3 = new enemy("Edged Bat", "The bat flies in!", "You hear flapping in the shadows...", 16, 16, 5, 1, 5, true);
    */

    public enemy metEnemy1 = new enemy("King Rat", "The king wants blood!", "You hear loud sqeaking and pitter patters...", 19, 19, 7, 1, 5, true);
    public enemy metEnemy2 = new enemy("Runaway Train", "It's screeching!", "You hear a thump followed by a screech on the tracks...", 23, 23, 8, 1, 5, true);
    public enemy metEnemy3 = new enemy("Edged Bat", "The bat flies in!", "You hear flapping in the shadows...", 16, 16, 5, 1, 5, true);

    public enemy mounEnemy1 = new enemy("Raging Goat", "Horns are hornin!", "You hear a scream in the distance...", 17, 17, 6, 1, 5, true);
    public enemy mounEnemy2 = new enemy("Vicious Cougar", "Growling fiercly!", "You hear growling in the distance...", 18, 18, 8, 1, 5, true);
    public enemy mounEnemy3 = new enemy("Speeding Vulture", "Flapping it's wings!", "KAAAWK KAAAAWK", 16, 16, 6, 1, 5, true); 

    public enemy forEnemy1 = new enemy("Tangling Vine", "It's wrapping and twirling!", "You see beneath you vines slithering...", 15, 15, 7, 1, 5, true);
    public enemy forEnemy2 = new enemy("Bangling Monkey", "Scrathing feroucisly", "A bannana hurls towards you!", 15, 15, 6, 1, 5, true);
    public enemy forEnemy3 = new enemy("Green Slime", "It's goopy!", "You hear sludge up ahead...", 18, 18, 5, 1,5, true);

    public enemy artEnemy1 = new enemy("Raging Penguin", "He's holding a knife!", "You hear some squabbles...", 15, 15, 9, 1, 5, true); 
    public enemy artEnemy2 = new enemy("Giant Snowman", "He's growling!", "You hear some growling and roaring in the distance...", 20, 20, 8, 1, 5, true); 
    public enemy artEnemy3 = new enemy("Frantic Seal", "ARR ARR", "You hear shuffling in the distance", 16, 16, 7, 1, 5, true);

    public void intro() {
        Scanner scan = new Scanner(System.in);


        System.out.println("Hello welcome to the program...\nPlease insert your name:");
        plName = scan.next(); 

        System.out.println("Welcome " + plName + "!");
    }

    

    public void chooseBiome() {
        Scanner scan = new Scanner(System.in); 

        System.out.println("You have gained consciousness...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("You now must choose which biome to spawn into. (select number): ");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("1.) Metro\n2.) Mountins\n3.) Forest\n4.) Artic");
        // goes back to main
    }


    public void enemySetter() {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int enemyNum;

        switch(biomeNum) {
            case 1: 
                enemies.add(metEnemy1);
                enemies.add(metEnemy2);
                enemies.add(metEnemy3);

                enemyNum = (int) (Math.random() * enemies.size());
                if (enemyNum == 0) { // metro enemies 1-3 vvv
                    enemName = metEnemy1.name; 
                    ehp = metEnemy1.hp; 
                    eintro = metEnemy1.intro;
                    edesc = metEnemy1.desc; 
                    edmg = metEnemy1.dmg;
                    elvl = metEnemy1.lvl; 
                    exp = metEnemy1.xp; 
                    emaxHp = metEnemy1.maxHp; 
                    eisAlive = true;
                } else if (enemyNum == 1) {
                    enemName = metEnemy2.name;
                    ehp = metEnemy2.hp;
                    eintro = metEnemy2.intro;
                    edesc = metEnemy2.desc; 
                    edmg = metEnemy2.dmg;
                    elvl = metEnemy2.lvl; 
                    exp = metEnemy2.xp; 
                    emaxHp = metEnemy2.maxHp; 
                    eisAlive = true;
                } else if (enemyNum == 2) {
                    enemName = metEnemy3.name;
                    ehp = metEnemy3.hp;
                    eintro = metEnemy3.intro;
                    edesc = metEnemy3.desc; 
                    edmg = metEnemy3.dmg;
                    elvl = metEnemy3.lvl; 
                    exp = metEnemy3.xp; 
                    emaxHp = metEnemy3.maxHp; 
                    eisAlive = true;
                } else {
                    System.out.println("Something went wrong...");
                }
                break;
            case 2: // mountain enemies 1-3 vvv
                enemies.add(mounEnemy1);
                enemies.add(mounEnemy2);
                enemies.add(mounEnemy3);

                enemyNum = (int) (Math.random() * enemies.size());
                if (enemyNum == 0) {
                    enemName = mounEnemy1.name;
                    ehp = mounEnemy1.hp;
                    eintro = mounEnemy1.intro;
                    edesc = mounEnemy1.desc; 
                    edmg = mounEnemy1.dmg;
                    elvl = mounEnemy1.lvl; 
                    exp = mounEnemy1.xp; 
                    emaxHp = mounEnemy1.maxHp; 
                    eisAlive = true;
                } else if (enemyNum == 1) {
                    enemName = mounEnemy2.name;
                    ehp = mounEnemy2.hp;
                    eintro = mounEnemy2.intro;
                    edesc = mounEnemy2.desc; 
                    edmg = mounEnemy2.dmg;
                    elvl = mounEnemy2.lvl; 
                    exp = mounEnemy2.xp; 
                    emaxHp = mounEnemy2.maxHp; 
                    eisAlive = true;
                } else if (enemyNum == 2) {
                    enemName = mounEnemy3.name; 
                    ehp = mounEnemy3.hp;
                    eintro = mounEnemy3.intro;
                    edesc = mounEnemy3.desc; 
                    edmg = mounEnemy3.dmg;
                    elvl = mounEnemy3.lvl; 
                    exp = mounEnemy3.xp; 
                    emaxHp = mounEnemy3.maxHp; 
                    eisAlive = true;
                } else {
                    System.out.println("Something went wrong...");
                }
                break; 
            case 3: // forest enemies 1-3 vvv
                enemies.add(forEnemy1); 
                enemies.add(forEnemy2);
                enemies.add(forEnemy3); 

                enemyNum = (int) (Math.random() * enemies.size());
                if (enemyNum == 0) {
                    enemName = forEnemy1.name;
                    ehp = forEnemy1.hp;
                    eintro = forEnemy1.intro;
                    edesc = forEnemy1.desc; 
                    edmg = forEnemy1.dmg;
                    elvl = forEnemy1.lvl; 
                    exp = forEnemy1.xp; 
                    emaxHp = forEnemy1.maxHp; 
                    eisAlive = true;
                } else if (enemyNum == 1) {
                    enemName = forEnemy2.name;
                    ehp = forEnemy2.hp;
                    eintro = forEnemy2.intro;
                    edesc = forEnemy2.desc; 
                    edmg = forEnemy2.dmg;
                    elvl = forEnemy2.lvl; 
                    exp = forEnemy2.xp; 
                    emaxHp = forEnemy2.maxHp; 
                    eisAlive = true;
                } else if (enemyNum == 2) {
                    enemName = forEnemy3.name; 
                    ehp = forEnemy3.hp;
                    eintro = forEnemy3.intro;
                    edesc = forEnemy3.desc; 
                    edmg = forEnemy3.dmg;
                    elvl = forEnemy3.lvl; 
                    exp = forEnemy3.xp; 
                    emaxHp = forEnemy3.maxHp; 
                    eisAlive = true;
                } else {
                    System.out.println("Something went wrong...");
                }
                break;
            case 4: // artic enemies 1-3 vvv
                enemies.add(artEnemy1); 
                enemies.add(artEnemy2); 
                enemies.add(artEnemy3);

                enemyNum = (int) (Math.random() * enemies.size());
                if (enemyNum == 0) {
                    enemName = artEnemy1.name;
                    ehp = artEnemy1.hp;
                    eintro = artEnemy1.intro;
                    edesc = artEnemy1.desc; 
                    edmg = artEnemy1.dmg;
                    elvl = artEnemy1.lvl; 
                    exp = artEnemy1.xp; 
                    emaxHp = artEnemy1.maxHp; 
                    eisAlive = true;
                } else if (enemyNum == 1) {
                    enemName = artEnemy2.name;
                    ehp = artEnemy2.hp;
                    eintro = artEnemy2.intro;
                    edesc = artEnemy2.desc; 
                    edmg = artEnemy2.dmg;
                    elvl = artEnemy2.lvl; 
                    exp = artEnemy2.xp; 
                    emaxHp = artEnemy2.maxHp; 
                    eisAlive = true;
                } else if (enemyNum == 2) {
                    enemName = artEnemy3.name; 
                    ehp = artEnemy3.hp;
                    eintro = artEnemy3.intro;
                    edesc = artEnemy3.desc; 
                    edmg = artEnemy3.dmg;
                    elvl = artEnemy3.lvl; 
                    exp = artEnemy3.xp; 
                    emaxHp = artEnemy3.maxHp; 
                    eisAlive = true;
                } else {
                    System.out.println("Something went wrong...");
                }
                break; 
        }
        //String[] metroEnemies = {"Rat", "Train", "Bat"};



        //int randEnem = rand.nextInt(enemies.length);


        /*if (randEnem == 0) {
            enemyNums = 1;
        } else if (randEnem == 1) {
            enemyNums = 2;
        } else if (randEnem == 2) {
            enemyNums = 3;
        }*/

        switch(enemyNums) {
            case 1: 
                enemName = metEnemy1.name;
                edesc = metEnemy1.getEnemDesc();
                eintro = metEnemy1.getEnemIntro();
                ehp = metEnemy1.hp;
                break;
            case 2: 
                enemName = metEnemy2.name;
                edesc = metEnemy2.getEnemDesc();
                eintro = metEnemy2.getEnemIntro(); 
                ehp = metEnemy2.hp;
                break;
            case 3: 
                enemName = metEnemy3.name;
                edesc = metEnemy3.getEnemDesc();
                eintro = metEnemy3.getEnemIntro(); 
                ehp = metEnemy3.hp;
                break;
            case 4: 
                enemName = mounEnemy1.name;
                edesc = mounEnemy1.getEnemDesc(); 
                eintro = mounEnemy1.getEnemIntro(); 
                ehp = mounEnemy1.getEnemHp(); 
                break; 
            case 5: 
                enemName = mounEnemy2.name; 
                edesc = mounEnemy2.getEnemDesc();
                eintro = mounEnemy2.getEnemIntro(); 
                ehp = mounEnemy2.getEnemHp(); 
                break; 
            case 6: 
                enemName = mounEnemy3.name; 
                edesc = mounEnemy3.getEnemDesc(); 
                eintro = mounEnemy3.getEnemIntro();
                ehp = mounEnemy3.getEnemHp(); 
                break; 
            case 7: 
                enemName = forEnemy1.name; 
                edesc = forEnemy1.getEnemDesc(); 
                eintro = forEnemy1.getEnemIntro(); 
                ehp = forEnemy1.getEnemHp(); 
                break; 
            case 8: 
                enemName = forEnemy2.name; 
                edesc = forEnemy2.getEnemDesc(); 
                eintro = forEnemy2.getEnemIntro(); 
                ehp = forEnemy2.getEnemHp();
                break;
            case 9:
                enemName = forEnemy3.name; 
                edesc = forEnemy3.getEnemDesc(); 
                eintro= forEnemy3.getEnemIntro();
                ehp = forEnemy3.getEnemHp();
                break; 
            case 10: 
                enemName = artEnemy1.name; 
                edesc = artEnemy1.getEnemDesc(); 
                eintro = artEnemy1.getEnemIntro(); 
                ehp = artEnemy1.getEnemHp(); 
                break; 
            case 11: 
                enemName = artEnemy2.name; 
                edesc = artEnemy2.getEnemDesc(); 
                eintro = artEnemy2.getEnemIntro(); 
                ehp = artEnemy2.getEnemHp(); 
                break; 
            case 12: 
                enemName = artEnemy3.name; 
                edesc = artEnemy3.getEnemDesc(); 
                eintro = artEnemy3.getEnemIntro(); 
                ehp = artEnemy3.getEnemHp();
                break; 
        }
        enemyIntro();
    }

    public void battleScene() {
        printEnemStats();
    }

    public void enemyIntro() {
        System.out.println(eintro);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException inte) {
            clearConsole();
            inte.printStackTrace();
        }
    }

    public void printEnemStats() {
        System.out.println("========" + enemName + "========");
        System.out.println(edesc);
        System.out.println("====================");
        System.out.println("HP: " + ehp);
    }

    public void printPlayStats() {
        System.out.println("========" +plName+ "========");
        System.out.println("HP: " + pl.hp);
    }

    public void clearConsole() {
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
    }

    public void printSeperator(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("=");
            System.out.println();
        }
    }

    
}
