package lab7.ex1_8;

public class MovableRectangle implements Movable{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int xSpeed, int ySpeed,int x1, int x2, int y1, int y2) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
        topLeft.x = x1;
        topLeft.y = y1;

        bottomRight.x = x2;
        bottomRight.y = y2;
    }

    @Override
    public String toString() {
        return "MovableRectangle{" + "topLeft=" + topLeft + ", bottomRight=" + bottomRight + '}';
    }

    @Override
    public void moveUp(){
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown(){
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft(){
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight(){
        topLeft.moveRight();
        bottomRight.moveRight();
    }
}
