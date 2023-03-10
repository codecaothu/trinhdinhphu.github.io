package exercise1.exercise1_1;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }

    public double getCircumference(){
        return radius * 2 * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle[" + "radius=" + radius + ", color='" + color + '\'' + ']';
    }
}
