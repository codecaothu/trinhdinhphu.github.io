package BTVN_T2;

import java.util.Locale;
import java.util.Scanner;

public class Dec2Hex {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number : ");
        int num = input.nextInt();
        String str = Integer.toHexString(num);
        str = str.toUpperCase();
        System.out.println("The equivalent hexadecimal number is : " + str);
    }
}
