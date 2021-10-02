import java.util.*;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(2.5);
        System.out.println(circle);

        Rectangle rect = new Rectangle(3.5, 4.5);
        System.out.println(rect);

        Square square = new Square(2.5);
        System.out.println(square);
        square.setSide(1);
        System.out.println(square);
        System.out.println(square.getColor());
    }
}