package BTVN_T4;

import java.util.Scanner;

public class RunningNumber {
    public static String runningNumber(int n) {
        if (n == 1) {
            return "1";
        }
        return runningNumber(n - 1) + n;
    }

    public static int len(int n) {
        if (n == 1) {
            return 1;
        }
        return len(n - 1) + (n + "").length();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so n: ");
        int n = sc.nextInt();

        System.out.println(runningNumber(n));
        System.out.println(len(n));
    }
}
