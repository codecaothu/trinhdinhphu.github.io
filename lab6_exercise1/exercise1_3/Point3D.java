package lab6_exercise1.exercise1_3;

public class Point3D extends Point2D{
    private float z = 0.0f;

    public Point3D() {

    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z){
        super.setX(x);
        super.setY(y);
        this.z = z;
    }

    public float[] getXYZ(){
        float[] n = {super.getX(), super.getY(), this.z};
        return  n;
    }

    @Override
    public String toString() {
        return "Point3D[" +super.toString()+ ", z=" + z + ']';
    }
}
