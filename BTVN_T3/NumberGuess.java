package BTVN_T3;

import java.util.Random;
import java.util.Scanner;
public class NumberGuess{
    public int secretNumber;

    public static void main(String[] args){
        NumberGuess aNumberGuess = new NumberGuess();
        aNumberGuess.generateSecretNumber(99);
        aNumberGuess.runGame();
    }
    public void generateSecretNumber(int maxValue){
        Random rand = new Random();
        secretNumber = rand.nextInt(maxValue);
    }

    public void setSecretNumber(int secretNumber){
        this.secretNumber = secretNumber;
    }

    public int getSecretNumber(){
        return secretNumber;
    }
    public void runGame(){
        Scanner in = new Scanner(System.in);

        System.out.println("Key in your guess:");
        int trials = 0;
        while (true) {
            int trialNumber = (in.hasNextInt()) ? in.nextInt() : -1;

            trials++;
            if (secretNumber == trialNumber){
                System.out.printf("You got it in %d trials!\n", trials);
                break;
            }
            else if (secretNumber > trialNumber){
                System.out.printf("Try higher\n");
            }
            else if (secretNumber < trialNumber){
                System.out.printf("Try lower\n");
            }
        }
    }
}
