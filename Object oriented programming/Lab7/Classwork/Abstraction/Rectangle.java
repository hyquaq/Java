public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle() {
        super();
        this.length = 0;
        this.width = 0;
    }

    public Rectangle(double length, double width) {
        super();
        this.length = length;
        this.width = width;
    }

    public Rectangle(double length, double width, String color) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public Rectangle(int length, int width, String color) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return (this.length + this.width) * 2.0;
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Rectangle) {
            Rectangle otherRect = (Rectangle) other;
            if (otherRect.getArea() == this.getArea()) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "Rectangle{" + "length=" + length + ", width=" + width + ", color=" + color + '}';
    }
}