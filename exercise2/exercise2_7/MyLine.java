package exercise2.exercise2_7;

public class MyLine {
    private MyPoint begin = new MyPoint();
    private MyPoint end = new MyPoint();

    public MyLine(int x1, int x2, int y1, int y2) {
        this.begin.setXY(x1, y1);
        this.begin.setXY(x2, y2);
    }

    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    public MyPoint getBegin() {
        return begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }

    public int getBeginX() {
        return this.begin.getX();
    }

    public int getBeginY() {
        return this.begin.getY();
    }

    public int getEndX() {
        return this.end.getX();
    }

    public int getEndY() {
        return this.end.getY();
    }

    public void setBeginX(int x) {
        this.begin.setX(x);
    }

    public void setBeginY(int y) {
        this.begin.setY(y);
    }

    public void setEndX(int x) {
        this.end.setX(x);
    }

    public void setEndY(int y) {
        this.end.setY(y);
    }

    public int[] getBeginXY() {
        return this.begin.getXY();
    }

    public int[] getEndXY() {
        return this.end.getXY();
    }

    public void setBeginXY(int x, int y) {
        this.setBeginX(x);
        this.setBeginY(y);
    }

    public void setEndXY(int x, int y) {
        this.setEndX(x);
        this.setEndY(y);
    }

    public double getLength() {
        return Math.sqrt(Math.pow(this.getBeginX() - this.getEndX(), 2) + Math.pow(this.getBeginY() - this.getEndY(), 2));
    }

    public double getGradient() {
        return Math.atan2(this.getEndY() - this.getBeginY(), this.getEndX() - this.getBeginX());
    }

    public String toString() {
        return "MyLine[begin=" + this.begin.toString() + ", end=" + this.end.toString() + "]";
    }
}
