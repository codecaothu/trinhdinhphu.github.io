package exercise2.exercise2_7;

public class Test {
    public static void main(String[] args) {
        MyLine ml1 = new MyLine(new MyPoint(3,6),new MyPoint(4,5));
        System.out.println(ml1.getBeginX());
        System.out.println(ml1.getEndX());
        MyLine ml2 = new MyLine(3,3,7,4);
        System.out.println(ml2);
        ml2.setBeginX(6);
        System.out.println(ml2);
        System.out.println(ml1.getGradient());
        System.out.println(ml2.getLength());
    }
}
