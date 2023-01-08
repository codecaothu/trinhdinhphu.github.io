package lab6_exercise1.exercise1_4;

public class TestShape {
    public static void main(String[] args) {
        Circle c = new Circle();
        Circle c1 = new Circle(11);
        Circle c2 = new Circle("red", true, 11);
        c1.setColor("purple");
        System.out.println(c2);
        System.out.println(c1);

        Rectangle rec = new Rectangle();
        Rectangle rec1 = new Rectangle(8, 9);
        Rectangle rec2 = new Rectangle("blue", false, 10, 20);
        rec1.setWidth(10);
        System.out.println(rec2);
        System.out.println(rec1);

        Square sq1 = new Square();
        Square sq2 = new Square(10);
        System.out.println(sq2);
    }
}
