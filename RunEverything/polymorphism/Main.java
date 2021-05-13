// package polymorphism;

public class Main {

    public static void main(String[] args) {
        Shape shape = new Shape();

        shape.show();
        shape.mau();

        shape = new Circle();
        shape.show();
	Shape o = (Shape) shape;
	o.show();
    }
}
