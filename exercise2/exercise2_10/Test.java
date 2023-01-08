package exercise2.exercise2_10;

public class Test {
    public static void main(String[] args) {
        MyPoint mp1 = new MyPoint(2, 5);
        MyPoint mp2 = new MyPoint(4, 4);
        MyRectangle rectangle = new MyRectangle(mp1, mp2);
        System.out.println(rectangle);
        System.out.println(rectangle.getPerimeter());
    }
}
