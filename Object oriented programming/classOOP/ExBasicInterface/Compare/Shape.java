public class Shape implements Comparable<Shape> {
    private final double PI = 3.14;
    private double radius;

    public Shape(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return this.radius * this.radius * this.PI;
    }

    @Override
    public int compareTo(Shape other) {
        if (this.getArea() > other.getArea()) {
            return 1;
        }
        if (this.getArea() < other.getArea()) {
            return -1;
        }

        return 0;
    }

    public static void main(String[] args) {
        Shape shape = new Shape(2);
        Shape other = new Shape(3);

        System.out.print(shape.compareTo(other));
    }
}
