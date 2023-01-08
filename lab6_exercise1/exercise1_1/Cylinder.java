package lab6_exercise1.exercise1_1;

public class Cylinder extends Circle{
    private double height = 1.0;

    public Cylinder() {
    }

    public Cylinder(double height){
        super();
        this.height=getHeight();
    }
    public Cylinder(double radius, double height) {
        super.setRadius(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        super.setRadius(radius);
        super.setColor(color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return getArea() * height;
    }

    @Override
    public double getArea() {
        return Math.PI * getRadius() * height + super.getArea() * 2;
    }

    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString() + " height=" +height;
    }
}
