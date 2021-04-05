public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        super();
        this.height = 1.0f;
    }

    public Cylinder(double radius) {
        super(radius);
        this.height = 1.0f;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public double getVolume() {

    }

    @Override
    public String toString() {

    }
}
