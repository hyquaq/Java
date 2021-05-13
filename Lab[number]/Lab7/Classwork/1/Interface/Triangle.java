public class Triangle implements Shape {

    private double base, height;

    public Triangle() {
        this.base = 0.0;
        this.height = 0.0;
    }

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public double getHeight() {
        return this.height;
    }

    public double getBase() {
        return this.base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double getArea() {
        return this.height * this.base * 0.5;
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Triangle) {
			Triangle o = (Triangle) other;
			if (this.getArea() == o.getArea()) {
				return true;
			}
		}
        return false;
    }

    @Override
    public String toString() {
        return "Triangle{base=" + this.base + ", height=" + this.height + "}";
    }
}
