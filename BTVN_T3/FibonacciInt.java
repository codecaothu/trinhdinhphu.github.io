package BTVN_T3;

import java.util.Scanner;

public class FibonacciInt {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap gia tri x: ");
        int x = sc.nextInt();

        if (x <= 0){
            System.out.println("Vui long nhap lai x");
        } else if (x >= 1 && x <= 45) {
            for (int i = 0; i < x; i++) {
                System.out.println("F(" + i + ") = " + fibonacci(i) + " ");
            }
        } else {
            System.out.println("F(" +x+ ") is out of the range of hint");
        }
    }

    public static int fibonacci(int n){
        int f0 = 1;
        int f1 = 1;
        int fn = 2;

        if (n < 0){
            return -1;
        } else if (n==0 | n== 1){
            return 1;
        } else {
            for (int i = 2; i < n; i++){
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
        }
        return fn;
    }
}
