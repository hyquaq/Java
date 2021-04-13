public class Rectangle implements Shape {

    private double length, width;

    public Rectangle() {
        this.length = 0.0;
        this.width = 0.0;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return (this.length + this.width) * 2;
    }

    // @Override
    public boolean equals(Rectangle other) {
        if (this.getArea() == other.getArea()) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Rectangle[" + this.length + "," + this.width + "]";
    }
}
