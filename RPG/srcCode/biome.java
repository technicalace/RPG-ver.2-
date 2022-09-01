package RPG.srcCode;
import java.util.InputMismatchException;
import java.util.Scanner;

public class biome {
    public int listNume;
    gameLogic gl = new gameLogic();
	public myBiome mybiome;

    public biome(myBiome mybiome) {
        this.mybiome = mybiome;
    }

    public enum myBiome {
        METRO,
        MOUNTAINS,
        FOREST,
        ARTIC
    }

    public void biomeSelect() {
        Scanner scan = new Scanner(System.in);
        random rand = new random();

        switch(mybiome) {
            case METRO:                 
                //rand.randNum = scan.nextInt(gl.metroEnemies.length);
                System.out.println("You have chosen the metro...");
                /*try {
                    Thread.sleep(2000);
                } catch (InterruptedException inte) {
                    inte.printStackTrace();
                }*/
                break; 
            case MOUNTAINS: 
                System.out.println("Mountains");
                break; 
            case FOREST: 
                System.out.println("Forest");
                break; 
            case ARTIC: 
                System.out.println("Artic");
                break;
            default: 
                System.out.println("Something went wrong...");
                break; 
        }
    }

    /*public void biomeSelect() {
        Scanner scan = new Scanner(System.in);
        random rand = new random();

        switch(biomeType) {
            case METRO: 
                rand.randNum = scan.nextInt(gl.metroEnemies.length);
                System.out.println("Hello");
                gl.enemySetter();
                break;  
            case MOUNTAINS: 

            case FOREST: 

            case ARTIC:
            
            default: 
        }
    }*/

    public void biomeInput() {

        /*switch (gl.biomeNum) {
            case 1: 
                biomePath = myBiome.METRO;
                //listNume = 1;
                break; 
            case 2: 
                biomePath = myBiome.MOUNTAINS;
                //listNume = 2;
                break; 
            case 3: 
                biomePath = myBiome.FOREST;
                //listNume = 3;
                break;
            case 4: 
                biomePath = myBiome.ARTIC;
                //listNume = 4;
                break;
        }*/
    }

    /*public void enemyBiome() {
        random r = new random(); 

        switch (biomePath) {
            case METRO: 

                r.randomEncounter();

        }
    }*/
}
