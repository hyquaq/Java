public class Square extends Rectangle {

    public Square() {
        super();
    }

    public Square(double side) {
        super();
        super.setWidth(side);
        super.setHeight(side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return super.getWidth();
    }

    public void setSide(double side) {
        super.setHeight(side);
        super.setWidth(side);
    }

    public double getArea() {
        return Math.pow(this.getSide(), 2);
    }

    public double getPerimeter() {
        return this.getSide() * 4;
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(double height) {
        super.setWidth(height);
        super.setHeight(height);
    }

    @Override
    public String toString() {
        return "Square[Side = " + this.getSide() + ", Area = " + this.getArea() + ", Perimeter = " + this.getPerimeter()
                + "]";
    }
}