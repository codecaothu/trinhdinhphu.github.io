import java.util.*;
import java.lang.*;
public class WordGuess {
    final private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str = sc.nextLine();
        wordGuess(str);
    }

    public static void wordGuess(String word) {
        String[] strList = new String[word.length()];
        for(int i = 0; i < word.length(); i++) {
            strList[i] = "_";
        }
        int count = 1;
        while(count > 0) {
            System.out.print("Key in one character or your guess word: ");
            String input = sc.nextLine();
            if (input.length() == 1) {
                if (word.contains(input)) {
                    for (int i = 0; i < word.length(); i++) {
                        if (input.charAt(0) == word.charAt(i)) {
                            strList[i] = input;
                        }
                    }
                }
                System.out.print("Trial " + count + ": ");
                for(int i = 0; i < word.length(); i++) {
                    System.out.print(strList[i]);
                }
                System.out.println();
            }   else if(input.equals(word)) {
                System.out.println("Congratulation!");
                if (count == 1) {
                    System.out.println("You got in 1 trial!");
                } else {
                    System.out.println("You got in " + count + " trials!");
                }
                break;
            }
            count++;
        }
    }
}