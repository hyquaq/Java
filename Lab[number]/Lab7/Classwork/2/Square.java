public class Square extends Rectangle {

	public Square() {
		super();
	}

	public Square(double side, String color, boolean filled) {
		super(side, side, color, filled);
	}

	public double getSide() {
		return this.width;
	}
	
	public void setSide(double side) {
		super.setWidth(side);
		super.setLength(side);
	}

	public void setWidth(double width) {
		super.setWidth(width);
		super.setLength(width);
	}

	public void setLength(double length) {
		super.setWidth(length);
		super.setLength(length);
	}

	@Override
	public boolean equals(Object other) {
		if (other instanceof Square) {
			Square o = (Square) other;
			if (this.getArea() == o.getArea()) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return String.format("Square side = %f color = %s filled = %b area = %f", this.getSide(), super.color, super.filled, super.getArea());
	}
}


