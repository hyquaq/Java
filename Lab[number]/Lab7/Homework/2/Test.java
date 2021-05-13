import java.util.*;

public class Test {
    public static void main(String[] args) {
        ResizableCircle circle1 = new ResizableCircle(3.2);
        System.out.println(circle1);
        circle1.resize(2);
        System.out.println(circle1);
    }
}