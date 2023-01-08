package lab7.ex1_1;

public class Square extends Rectangle{
    public Square() {
    }

    public Square(double side){
        super(side, side);
    }

    public Square(double side, String color, boolean filled){
        super(color, filled, side, side);
    }

    public double getSide() {
        return getLength();
    }

    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }
    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }

}
