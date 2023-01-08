package BTVN_T2;

import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.print("Enter a possitive integer (or -1 to end): ");
            int number = in.nextInt();
            if (number == -1) {
                break;
            } else {
                if (hasEight(number)) {
                    sum += number;
                }
            }
        }
        System.out.println("The magic number is : " + sum);
    }

    public static boolean hasEight(int number) {
        while (number != 0) {
            int temp = number % 10;
            number /= 10;
            if (temp == 8) {
                return true;
            }
        }
        return false;
    }
}
