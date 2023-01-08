package exercise1.exercise1_8;

public class Test {
    public static void main(String[] args){
        // Test program
        // Can invoke with a variable number of arguments
        MyPolynomial polynomial1 = new MyPolynomial(1.1, 2.2, 3.3);
        MyPolynomial polynomial2 = new MyPolynomial(1.1, 2.2, 3.3, 4.4, 5.5);
        // Can also invoke with an array
        double [] coeffs = {1.2, 3.4, 5.6, 7.8};
        MyPolynomial p2 = new MyPolynomial(coeffs);
    }
}
