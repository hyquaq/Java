public class Point2D {
    private float x, y;

    public Point2D() {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return this.x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return this.y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY() {
        return new float[] { this.x, this.y };
    }

    public void setXY(float[] point) {
        this.setX(point[0]);
        this.setY(point[1]);
    }

    @Override
    public String toString() {
        return "Point2D(x = " + this.x + ", y = " + this.y + ")";
    }
}