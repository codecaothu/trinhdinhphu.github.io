package lab7.ex1_4;

public class TestMain {
    public static void main(String[] args){
        MovablePoint movablePoint1 = new MovablePoint(6,19,4,20);
        System.out.println(movablePoint1);
        movablePoint1.moveDown();
        System.out.println(movablePoint1);
        movablePoint1.moveUp();
        System.out.println(movablePoint1);
        movablePoint1.moveLeft();
        System.out.println(movablePoint1);
        movablePoint1.moveRight();
        System.out.println(movablePoint1);

        MovableCircle movableCircle1 = new MovableCircle(4,6,12,17,4);
        System.out.println(movableCircle1);
        movableCircle1.moveDown();
        System.out.println(movableCircle1);
        movableCircle1.moveUp();
        System.out.println(movableCircle1);
        movableCircle1.moveLeft();
        System.out.println(movableCircle1);
        movableCircle1.moveRight();
        System.out.println(movableCircle1);
    }
}
