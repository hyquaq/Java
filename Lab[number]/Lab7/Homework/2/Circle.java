public class Circle implements GeometricObject {
    protected double radius;
    private final double PI = 3.14;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        return this.radius * 2 * this.PI;
    }

    public double getArea() {
        return this.radius * this.radius * this.PI;
    }

    @Override
    public String toString() {
        return "Circle(" + radius + ")";
    }
}