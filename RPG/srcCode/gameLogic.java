package RPG.srcCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


import RPG.srcCode.biome.myBiome;

public class gameLogic {
    // player variables

    public String plName;
    public int biomeSel, biomeNum;   
    String metName; 

    // enemy variables
    String enemName, eintro, edesc;
    public int ehp, emaxHp, edmg, elvl, exp;
    public boolean eisAlive;
    public int enemyNums;

    // enemy lists
    //public String[] mountEnemies = {1, 2, 3}; 
    //public String[] forEnemies = {1, 2, 3};
    //public String[] artEnemies = {1, 2, 3};  

    public player pl = new player(plName, 20, 20, 4, 1, true);

    enemy metEnemy1 = new enemy("King Rat", "The king wants blood!", "You hear loud sqeaking and pitter patters...", 19, 19, 7, 1, 5, true);
    enemy metEnemy2 = new enemy("Runaway Train", "It's screeching!", "You hear a thump followed by a screech on the tracks...", 23, 23, 8, 1, 5, true);
    enemy metEnemy3 = new enemy("Edged Bat", "The bat flies in!", "You hear flapping in the shadows...", 16, 16, 5, 1, 5, true);

    public void intro() {
        Scanner scan = new Scanner(System.in);


        System.out.println("Hello welcome to the program...\nPlease insert your name:");
        plName = scan.next(); 

        System.out.println("Welcome " + plName + "!");
    }

    

    public void chooseBiome() {
        Scanner scan = new Scanner(System.in); 
        random rand = new random();

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
        random rand = new random();

        switch(enemyNums) {
            case 1: 
                System.out.println("hello");
                break; 
            case 2: 
                System.out.println("how");
                break; 
            case 3: 
                System.out.println("the");
                break;
        } 
        
       

        /*if (enemyNums == 1) {
            System.out.println("Hello");
        } else if (enemyNums == 2) {
            System.out.println("how");
        } else if (enemyNums == 3) {
            System.out.println("Whn");
        }*/

       /*switch (rand.randNum) {
            case 0:
                System.out.println("Hello");
                break; 
            case 1: 
                System.out.println("How");
                break; 
            case 2: 
                System.out.println("are");
                break; 
            default: 
                System.out.println("Something went wrong, please try again.");
                break;
        }*/
        /*switch (enemyNums) { // here
            case 1: 
                enemName = metEnemy1.getEnemName();
                eintro = metEnemy1.intro; 
                edesc = metEnemy1.desc; 
                ehp = metEnemy1.hp; 
                emaxHp = metEnemy1.maxHp; 
                edmg = metEnemy1.dmg; 
                elvl = metEnemy1.lvl; 
                exp = metEnemy1.xp; 
                eisAlive = metEnemy1.isAlive; 
                break; 

            case 2: 
                enemName = metEnemy2.getEnemName();
                eintro = metEnemy2.intro; 
                edesc = metEnemy2.desc; 
                ehp = metEnemy2.hp;
                emaxHp = metEnemy2.maxHp;
                edmg = metEnemy2.dmg;
                elvl = metEnemy2.lvl; 
                exp = metEnemy2.xp; 
                eisAlive = metEnemy2.isAlive; 
                break; 
            case 3: 
                enemName = metEnemy3.getEnemName(); 
                eintro = metEnemy3.getEnemIntro();
                edesc = metEnemy3.getEnemDesc(); 
                ehp = metEnemy3.hp; 
                emaxHp = metEnemy3.maxHp; 
                edmg = metEnemy3.dmg; 
                elvl = metEnemy3.lvl;
                exp = metEnemy3.xp; 
                eisAlive = metEnemy3.isAlive;
                break;
            default: 
                System.out.println("Something has went wrong...");
                break;
        }*/
        /*if (rand.randNum == 0) {
            enemyNums = 1;
        } else if (rand.randNum == 1) {
            enemyNums = 2;
        } else if (rand.randNum == 2) {
            enemyNums = 3; 
        } else {
            System.out.println("Something went wrong");
        }*/

        /*if (enemyNums == 1) {
            System.out.println("Hello");
        } else if (enemyNums == 2) {
            System.out.println("There");
        } else if (enemyNums == 3) {
            System.out.println("How");
        }*/


        /*switch(rand.randNum) {
            case 0:
                System.out.println("When");
                /*enemName = metEnemy1.getEnemName();
                eintro = metEnemy1.intro; 
                edesc = metEnemy1.desc; 
                ehp = metEnemy1.hp; 
                emaxHp = metEnemy1.maxHp; 
                edmg = metEnemy1.dmg; 
                elvl = metEnemy1.lvl; 
                exp = metEnemy1.xp; 
                eisAlive = metEnemy1.isAlive; */
                /*break; 
            case 1: 
                System.out.println("The");
                /*enemName = metEnemy2.getEnemName();
                eintro = metEnemy2.intro; 
                edesc = metEnemy2.desc; 
                ehp = metEnemy2.hp;
                emaxHp = metEnemy2.maxHp;
                edmg = metEnemy2.dmg;
                elvl = metEnemy2.lvl; 
                exp = metEnemy2.xp; 
                eisAlive = metEnemy2.isAlive; */
                //break;
            /*case 2: 
                System.out.println("Who");
                /*enemName = metEnemy3.getEnemName(); 
                eintro = metEnemy3.getEnemIntro();
                edesc = metEnemy3.getEnemDesc(); 
                ehp = metEnemy3.hp; 
                emaxHp = metEnemy3.maxHp; 
                edmg = metEnemy3.dmg; 
                elvl = metEnemy3.lvl;
                exp = metEnemy3.xp; 
                eisAlive = metEnemy3.isAlive; */
                //break;
        //}
    }

    public void battleScene() {
        random rand = new random(); 

        printEnemStats();
    }

    public void printEnemStats() {
        System.out.println("========" + enemName + "========");
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
