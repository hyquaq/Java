// package polymorphism;

public class Circle extends Shape {
    public double y = 1;

    @Override
    public void show() {
        System.out.println("Circle");
    }

    public void bankinh() {
        System.out.println("radius = 10");
    }
}