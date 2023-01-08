package lab6_exercise2.exercide2_1;

public class TestLine {
    public static void main(String[] args) {
        Point point1 = new Point(6, 9);
        Point point2 = new Point(14, 19);
        Line line1 = new Line(point1, point2);
        System.out.println(line1.getBeginX());
        System.out.printf("Length of line is %.2f%n", line1.getLength());
        System.out.printf("Gradient of line is %.2f%n", line1.getGradient());
        System.out.println(line1);
    }
}
