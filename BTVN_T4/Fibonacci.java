package BTVN_T4;

import java.util.Scanner;

public class Fibonacci {
    public static int fibonacci(int n){
        if (n == 0){
            return 0;
        } else if (n == 1){
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so n ");
        int n = sc.nextInt();

        System.out.println("So fibonacci la: "+ fibonacci(n));
    }
}
