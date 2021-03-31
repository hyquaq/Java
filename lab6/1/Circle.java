public class Circle {
    private double radius;
    private String color;

    public Circle() {
        this.radius = 1.0f;
        this.color = "red";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }

    public Circle(Circle circle) {
        this.radius = circle.radius;
        this.color = circle.color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public double getArea() {
        return this.radius * this.radius * 3.14;
    }

    @Override
    public String toString() {
        return "Circle(" + this.color + ", " + this.radius + ", " + this.getArea() + ")";
    }
}