package lab6_exercise1.exercise1_3;

public class TestMain {
    public static void main(String[] args) {

        Point2D point2D = new Point2D();
        Point3D point3D = new Point3D();
        System.out.println(point2D);
        System.out.println(point3D);

        point2D.setX(6);
        point2D.setY(7);
        System.out.println(point2D);
        point2D.setXY(5,6);
        System.out.println(point2D);

        point3D.setXY(5,6);
        System.out.println(point3D);
    }
}
