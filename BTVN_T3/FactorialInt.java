package BTVN_T3;

import java.util.Scanner;

public class FactorialInt {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap gia tri x: ");
        int x = sc.nextInt();
        int fac = 1;


        if(x > 0 && x <= 12){
            for(int i=1; i <= x; i++){
                fac *= i ;
                System.out.println("The factorial of " +i+ " is " +fac);
            }
        } else{
            System.out.println("Vui long nhap lai gia tri");
        }
    }
}
