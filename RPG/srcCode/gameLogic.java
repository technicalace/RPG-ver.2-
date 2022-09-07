package RPG.srcCode;

import java.util.Scanner;
import java.util.Random;

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

    
    public player pl = new player(plName, 20, 20, 4, 1, true);

    /*enemy metEnemy1 = new enemy("King Rat", "The king wants blood!", "You hear loud sqeaking and pitter patters...", 19, 19, 7, 1, 5, true);
    enemy metEnemy2 = new enemy("Runaway Train", "It's screeching!", "You hear a thump followed by a screech on the tracks...", 23, 23, 8, 1, 5, true);
    enemy metEnemy3 = new enemy("Edged Bat", "The bat flies in!", "You hear flapping in the shadows...", 16, 16, 5, 1, 5, true);
    */

    public enemy me1 = new enemy("King Rat", "The king wants blood!", "You hear loud sqeaking and pitter patters...", 19, 19, 7, 1, 5, true);
    public enemy me2 = new enemy("Runaway Train", "It's screeching!", "You hear a thump followed by a screech on the tracks...", 23, 23, 8, 1, 5, true);
    public enemy me3 = new enemy("Edged Bat", "The bat flies in!", "You hear flapping in the shadows...", 16, 16, 5, 1, 5, true);

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

        String[] metroEnemies = {"Rat", "Train", "Bat"};


        int randEnem = rand.nextInt(metroEnemies.length);

        if (randEnem == 0) {
            enemyNums = 1;
        } else if (randEnem == 1) {
            enemyNums = 2;
        } else if (randEnem == 2) {
            enemyNums = 3;
        }

        switch(enemyNums) {
            case 1: 
                enemName = me1.name;
                edesc = me1.getEnemDesc();
                eintro = me1.getEnemIntro();
                ehp = me1.hp;
                break;
            case 2: 
                enemName = me2.name;
                edesc = me2.getEnemDesc();
                eintro = me2.getEnemIntro(); 
                ehp = me2.hp;
                break;
            case 3: 
                enemName = me3.name;
                edesc = me3.getEnemDesc();
                eintro = me3.getEnemIntro(); 
                ehp = me3.hp;
                break;
        }
    }

    public void battleScene() {

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
