package RPG.srcCode;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class random {
    Random rand = new Random(); 
    gameLogic gl = new gameLogic();
    
    public int[] metroEnemies = {1, 2, 3};

    public int randNum;
 
    public void randomEncounter() {

        /*switch() {
            case METRO:
                //randNum = rand.nextInt(gl.metroEnemies.length);
                gl.enemySetter();
                break; 
            case MOUNTAINS: 
                //randNum = rand.nextInt(gl.mountEnemies.length);
                break; 
            case FOREST: 
                //randNum = rand.nextInt(gl.forEnemies.length); 
                break; 
            case ARTIC: 
                //randNum = rand.nextInt(gl.artEnemies.length); 
                break; 
        }*/
        randNum = rand.nextInt(metroEnemies.length);

        if (randNum == 0) {
            gl.enemyNums = 1;
        } else if (randNum == 1) {
            gl.enemyNums = 2; 
        } else if (randNum == 2) {
            gl.enemyNums = 3;
        } else {
            System.out.println("Something has went wrong");
        }

        /*if (randNum == 0) {
            System.out.println("Hello");
        } else if (randNum == 1) {
            System.out.println("there");
        } else if (randNum == 2) {
            System.out.println("hiw");
        }*/
     
        /*if (randNum == 0) {
            gl.enemyNums = 1;
        } else if (randNum == 1) {
            gl.enemyNums = 2; 
        } else if (randNum == 2) {
            gl.enemyNums = 3;
        }*/
        gl.enemySetter();
    }


}
