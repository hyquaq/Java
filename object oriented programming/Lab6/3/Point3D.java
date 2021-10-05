public class Point3D extends Point2D {
    private float z;

    public Point3D() {
        super();
        this.z = 0.0f;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return this.z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[] { super.getX(), super.getY(), this.z };
    }

    public void setXYZ(float[] point) {
        super.setX(point[0]);
        super.setY(point[1]);
        this.z = point[2];
    }

    @Override
    public String toString() {
        return "Point3D(x = " + super.getX() + ", y = " + super.getY() + ", z = " + this.z + "]";
    }
}