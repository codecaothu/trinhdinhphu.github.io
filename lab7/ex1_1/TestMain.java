package lab7.ex1_1;

public class TestMain {
    public static void main(String[] args){
        Shape shape1 = new Circle("red", false, 5.5);
        System.out.println(shape1);
        System.out.println(shape1.getArea());
        System.out.println(shape1.getPerimeter());
        System.out.println(shape1.getColor());
        System.out.println(shape1.isFilled());
        //System.out.println(shape1.getRadius()); ko có getRadius()

        Circle circle1 = (Circle)shape1;
        System.out.println(circle1);
        System.out.println(circle1.getArea());
        System.out.println(circle1.getPerimeter());
        System.out.println(circle1.getColor());
        System.out.println(circle1.isFilled());
        System.out.println(circle1.getRadius());

        //Shape shape2 = new Shape(); vì nó là lớp trừu tượng

        Shape shape3 = new Rectangle("red", false, 1.0, 2.0);
        System.out.println(shape3);
        System.out.println(shape3.getArea());
        System.out.println(shape3.getPerimeter());
        System.out.println(shape3.getColor());
        //System.out.println(shape3.getLength()); ko có getLength()

        Rectangle rectangle1 = (Rectangle)shape3;
        System.out.println(rectangle1);
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.getColor());
        System.out.println(rectangle1.getLength());

        Shape shape4 = new Square(6.6);
        System.out.println(shape4);
        System.out.println(shape4.getArea());
        System.out.println(shape4.getColor());
        //System.out.println(shape4.getSide()); ko có getSide()

        Rectangle rectangle2 = (Rectangle)shape4;
        System.out.println(rectangle2);
        System.out.println(rectangle2.getArea());
        System.out.println(rectangle2.getColor());
        //System.out.println(rectangle2.getSide()); ko có getSide()
        System.out.println(rectangle2.getLength());

        Square square1 = (Square)rectangle2;
        System.out.println(square1);
        System.out.println(square1.getArea());
        System.out.println(square1.getColor());
        System.out.println(square1.getSide());
        System.out.println(square1.getLength());
    }
}
