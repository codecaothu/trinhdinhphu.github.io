package BTVN_T3;

import java.util.Scanner;

public class TrigonometricSeries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap gia tri cua x: ");
        double  x = sc.nextDouble();
        int numTerms = 10;

        TrigonometricSeries aTrigonometricSeries = new TrigonometricSeries();

        System.out.println("Calculated values:");
        System.out.printf("sin(%1$d) = %2$f \n", (int)Math.round(x*180/Math.PI)
                , aTrigonometricSeries.sin(x, numTerms));
        System.out.printf("cos(%1$d) = %2$f \n", (int)Math.round(x*180/Math.PI)
                , aTrigonometricSeries.cos(x, numTerms));
        System.out.println("java.lang.Math values:");
        System.out.printf("sin(%1$d) = %2$f \n", (int)Math.round(x*180/Math.PI)
                , Math.sin(x));
        System.out.printf("cos(%1$d) = %2$f \n", (int)Math.round(x*180/Math.PI)
                , Math.cos(x));
    }
    public double calculateTerm(double x, int numTerms){
        double term = 1D;
        for (int i = numTerms; i > 0; i--) {
            term *= x/i;
        }
        return term;
    }
    public double sin(double x, int numTerms){
        double result = 0D;
        for (int i = 0; i < numTerms; i++) {
            result += (i%2 == 0 ? 1 : -1) / calculateTerm(x, (2*i+1));
        }
        return result;
    }
    public double cos(double x, int numTerms){
        double result = 0D;
        for (int i = 0; i < numTerms; i++) {
            result += (i%2 == 0 ? 1 : -1) / calculateTerm(x, 2*i);
        }
        return result;
    }

}
