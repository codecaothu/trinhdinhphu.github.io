package exercise2.exercise2_9;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.v1 = new MyPoint(x1, y1);
        this.v2 = new MyPoint(x2, y2);
        this.v3 = new MyPoint(x3, y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return "MyTriangle[v1=(" + this.v1.getX() + "," + this.v1.getY() + "),v2=("
                + this.v2.getX() + "," + this.v2.getY() + "),v3=(" +
                this.v3.getX() + "," + this.v3.getY() + ")]";
    }

    public double getPerimeter() {
        double edge1 = this.v1.getDistance(this.v2);
        double edge2 = this.v1.getDistance(this.v3);
        double edge3 = this.v3.getDistance(this.v2);
        double perimeter = (edge1 + edge3 + edge2) / 2;
        return perimeter;
    }

    public String getType() {
        String result = "";
        double edge1 = this.v1.getDistance(this.v2);
        double edge2 = this.v1.getDistance(this.v3);
        double edge3 = this.v3.getDistance(this.v2);
        if (edge1 == edge2 && edge3 == edge1) {
            result = "Equilateral";
        } else if (edge1 == edge2 || edge1 == edge3 || edge2 == edge3) {
            result = "Isosceles";
        } else {
            result = "Scalene";
        }
        return result;
    }

}
