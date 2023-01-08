package exercise1.exercise1_7;

public class Test {
    public static void main(String[] args) {
        MyComplex num1 = new MyComplex(1.1, 2.2);
        MyComplex num2 = new MyComplex(2.2, 3.3);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println("after");
        System.out.println(num1.addNew(num2));
        System.out.println(num1);
        System.out.println(num2);
    }
}
