public class Circle extends Shape {
	private double radius;

	public Circle() {
		super();
		this.radius = 0;
	}

	public Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}

	public double getRadius() {
		return this.radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return Math.PI * Math.pow(this.radius, 2);
	}

	@Override
	public double getPerimeter() {
		return 2 * Math.PI * this.radius;
	}

	@Override
	public boolean equals(Object other) {
		if (other instanceof Circle) {
			Circle o = (Circle) other;
			if (this.getArea() == o.getArea()) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return String.format("Circle radius = %f color = %s filled = %b area = %f", radius, super.color, super.filled, this.getArea());
	}
}

