package exercise2.exercise2_9;

public class TestMyTriangle {
    public static void main(String[] args) {
        MyPoint v1 = new MyPoint(4, 5);
        MyPoint v2 = new MyPoint(1, 5);
        MyPoint v3 = new MyPoint(6, 2);
        MyTriangle triangle = new MyTriangle(v1, v2, v3);
        System.out.println(triangle);
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getType());
    }
}
