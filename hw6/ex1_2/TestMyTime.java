package hw6.ex1_2;

public class TestMyTime {
    public static void main(String[] args){
        MyTime c1 = new MyTime(17, 17 ,17);
        System.out.println(c1);
        System.out.println(c1.nextHour());
        System.out.println(c1.nextMinute());
        System.out.println(c1.nextSecond());
        System.out.println(c1.previousHour());
        System.out.println(c1.previousMinute());
        System.out.println(c1.previousSecond());
    }
}
