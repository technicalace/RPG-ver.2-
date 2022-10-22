package RPG;

import RPG.srcCode.biome;
import RPG.srcCode.enemy;
import RPG.srcCode.gameLogic;
import RPG.srcCode.biome.myBiome;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class main {
    public static enemy enemy;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        gameLogic gl = new gameLogic(); 
        int randElements = 3;

        // enemy lists 

        // biome enums 
        biome bi1 = new biome(myBiome.METRO);
        biome bi2 = new biome(myBiome.MOUNTAINS); 
        biome bi3 = new biome(myBiome.FOREST);
        biome bi4 = new biome(myBiome.ARTIC);

        gl.intro();
        gl.chooseBiome();

        // BIOME SELECT
        try { // here
        gl.biomeSel = scan.nextInt();
        switch(gl.biomeSel) {
            case 1:
                gl.biomeNum = 1;
                gl.clearConsole();
                bi1.biomeSelect();
                break;
            case 2: 
                gl.biomeNum = 2; 
                gl.clearConsole();
                bi2.biomeSelect();
                break;
            case 3: 
                gl.biomeNum = 3;
                gl.clearConsole();
                bi3.biomeSelect();
                break; 
            case 4: 
                gl.biomeNum = 4;
                gl.clearConsole();
                bi4.biomeSelect();
                break; 
            default: 
                gl.clearConsole();
                System.out.println("Something went wrong...");
                gl.chooseBiome();
                break;
        }
    } catch (InputMismatchException ie) {
        gl.clearConsole();
        System.out.println("Invalid input...");
        gl.chooseBiome();
    }

    try{
        Thread.sleep(2000);
    } catch (InterruptedException inte) {
        gl.clearConsole();
        inte.printStackTrace();
    }
    gl.enemySetter();
    gl.battleScene();
    }
    
}