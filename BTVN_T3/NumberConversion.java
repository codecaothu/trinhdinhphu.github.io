import java.util.*;

public class NumberConversion {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a number / string: ");
        String input = sc.nextLine().toUpperCase();
        System.out.print("Enter the input radix: ");
        int radixNumInput = Integer.parseInt(sc.nextLine());
        System.out.print("Enter the output radix: ");
        int radixNumOutput = Integer.parseInt(sc.nextLine());
        int decimalOutput = Radix2Decimal(input, radixNumInput);
        String radixOutput = Dec2Radix(decimalOutput, radixNumOutput);
        System.out.printf("%s " + "in %d base convert to %" + "d base is: ", input, radixNumInput, radixNumOutput);
        System.out.println(radixOutput);

    }

    public static String baseCharGenerator(int radixNum) {
        String charList = "";
        for (int i = 0; i < radixNum; i++) {
            charList += String.valueOf(i);
        }
        if (radixNum > 10) {
            for (int i = 65; i < 65 + radixNum - 10; i++) {
                charList += (char) i;
            }
        }

        return charList;
    }

    public static int toDigit(char character, int radixNum) {
        String charList = baseCharGenerator(radixNum);
        return charList.indexOf(character);
    }

    public static char toRadixString(int number, int radixNum) {
        String charList = baseCharGenerator(radixNum);
        return charList.charAt(number);
    }

    public static int Radix2Decimal(String radixString, int radixNum) {
        int decimal = 0;
        for (int i = 0; i < radixString.length(); i++) {
            decimal += toDigit(radixString.charAt(radixString.length() - i - 1), radixNum) * Math.pow(radixNum, i);
        }
        return decimal;
    }

    public static boolean isValidRadix(String radixString, int radixNumber) { //check if the input radix string is valid in a base.
        for (int i = 0; i < radixString.length(); i++) {
            if (toDigit(radixString.charAt(i), radixNumber) == -1) {
                return false;
            }
        }

        return true;
    }

    public static String convertString(String oldStr) {
        String newStr = "";
        for (int i = 0; i < oldStr.length(); i++) {
            newStr += oldStr.charAt(oldStr.length() - i - 1);
        }
        return newStr;
    }

    public static String Dec2Radix(int decimal, int radix) {
        String newStr = "";
        while (decimal != 0) {
            int r = decimal % radix;
            newStr += toRadixString(r, radix);
            decimal /= radix;
        }
        return convertString(newStr);
    }
}
