package lab7.ex1_8;

public class TestMain {
    public static void main(String[] args) {
        Movable movable1 = new MovablePoint(8,9,18,9);
        System.out.println(movable1);
        movable1.moveLeft();
        System.out.println(movable1);
        Movable movable2 = new MovableCircle(9,12,8,7,17);
        System.out.println(movable2);
        movable2.moveRight();
        System.out.println(movable2);
        MovableRectangle movableRectangle1 = new MovableRectangle(7,7,11,10,8,8);
        movableRectangle1.moveDown();
        System.out.println(movableRectangle1);
    }
}
