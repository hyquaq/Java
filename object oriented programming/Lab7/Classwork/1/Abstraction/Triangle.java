public class Triangle extends Shape {

    private double base, height;

    public Triangle() {
        super();
        this.base = 0.0;
        this.height = 0.0;

    }

    public Triangle(double base, double height) {
        super();
        this.base = base;
        this.height = height;

    }

    public Triangle(double base, double height, String color) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * this.base * this.height;
    }
	
    @Override
    public String toString() {
        return "Triangle{base= " + this.base + ", height= " + this.height + ", color= " + this.color + "}";
    }
}