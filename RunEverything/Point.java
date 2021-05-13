public abstract class Point {
    float x, y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        return new float[] { this.x, this.y };
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void show() {
        System.out.println("lop cha");
    }
}
