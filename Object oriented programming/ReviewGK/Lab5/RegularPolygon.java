public class RegularPolygon {
	private String name;
	private int edgeAmount;
	private double edgeLength;
	
	public RegularPolygon() {
		this.name = "";
		this.edgeAmount = 3;
		this.edgeLength = 1;		
	}
	
	public RegularPolygon(String name, int edgeAmount, double edgeLength) {
		this.name = name;
		this.edgeAmount = edgeAmount;
		this.edgeLength = edgeLength;
	}
	
	public RegularPolygon(String name, int edgeAmount) {
		this.name = name;
		this.edgeAmount = edgeAmount;
		this.edgeLength = 1;
	}
	
	public RegularPolygon(RegularPolygon regularPolygon) {
		this.name = regularPolygon.name;
		this.edgeAmount = regularPolygon.edgeAmount;
		this.edgeLength = regularPolygon.edgeLength;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getEdgeAmount() {
		return this.edgeAmount;
	}
	
	public double getEdgeLength() {
		return this.edgeLength;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setEdgeAmount(int edgeAmount) {
		this.edgeAmount = edgeAmount;
	}
	
	public void setEdgeLength(double edgeLength) {
		this.edgeLength = edgeLength;
	}
	
	public String getPolygon() {
		if (this.edgeAmount == 3) {
			return "Triangle";
		} else if (this.edgeAmount == 4) {
			return "Quadrangle";
		} else if (this.edgeAmount == 5) {
			return "Pentagon";
		} else if (this.edgeAmount == 6) {
			return "Hexagon";
		}
		
		return "Polygon has the number of deges greater than 6";
	}
	
	public double getPerimeter() {
		return this.edgeAmount * this.edgeLength;
	}
	
	public double getArea() {
		if (this.edgeAmount == 3) {
			return this.edgeLength * this.edgeLength * 0.433;
		}
		if (this.edgeAmount == 4) {
			return this.edgeLength * this.edgeLength * 1;
		}
		if (this.edgeAmount == 5) {
			return this.edgeLength * this.edgeLength * 1.71;
		}
		if (this.edgeAmount == 6) {
			return this.edgeLength * this.edgeLength * 2.595;
		}
		
		return -1;
	}
	
	@Override
	public String toString() {
		return this.name + " - " + this.getPolygon() + " - " + this.getArea();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}