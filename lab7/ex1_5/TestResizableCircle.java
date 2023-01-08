package lab7.ex1_5;

public class TestResizableCircle {
    public static void main(String[] args) {
        ResizableCircle circle = new ResizableCircle(5.7);
        System.out.println(circle);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        System.out.println("after resize");

        circle.resize(19);
        System.out.println(circle);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

    }
}
