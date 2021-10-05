public class Rectangle extends Shape {
	protected double width, length;

	public Rectangle() {
		super();
		this.width = 0;
		this.length = 0;
	}

	public Rectangle(double width, double length, String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}

	public double getWidth() {
		return this.width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getLength() {
		return this.length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public double getArea() {
		return width * length;
	}

	@Override
	public double getPerimeter() {
		return 2 * (width + length);
	}

	@Override
	public boolean equals(Object other) {
		if (other instanceof Rectangle) {
			Rectangle o = (Rectangle) other;
			if (this.getArea() == o.getArea()) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return String.format("Rectangle width = %f length = %f color = %s filled = %b area = %f", this.width, this.length, super.color, super.filled, this.getArea());
	}
}


