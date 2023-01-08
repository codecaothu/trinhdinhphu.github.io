package BTVN_T4;

import java.util.Scanner;

public class Factorial {
    public static int factorial(int n){
        if (n == 0){
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so n: ");
        int n = sc.nextInt();

        System.out.print("giai thua cua so " +n+ " la: "+ factorial(n));
    }
}
