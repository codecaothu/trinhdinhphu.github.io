package exercise2.exercise2_10;

public class MyRectangle {
    private MyPoint v1;
    private MyPoint v2;

    public MyRectangle(MyPoint v1, MyPoint v2) {
        this.v1 = v1;
        this.v2 = v2;
    }

    public MyRectangle(int x1, int y1, int x2, int y2) {
        this.v1.setX(x1);
        this.v1.setY(y1);
        this.v2.setX(x2);
        this.v2.setY(y2);
    }

    public double getPerimeter() {
        MyPoint v3 = new MyPoint(this.v1.getX(), this.v2.getY());
        MyPoint v4 = new MyPoint(this.v1.getY(), this.v2.getX());
        double distance1 = this.v1.getDistance(v3);
        double distance2 = this.v1.getDistance(v4);
        return 2 * (distance2 + distance1);
    }

    @Override
    public String toString() {
        return "Rectangle: v1=(" + this.v1.getX() + "," + this.v1.getY() + "), v2=(" + this.v2.getX() + "," + this.v2.getY() + ")";
    }
}
