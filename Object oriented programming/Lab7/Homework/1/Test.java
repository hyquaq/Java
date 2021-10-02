public class Test {
    public static void main(String[] args) {
        MovableCircle circle = new MovableCircle(1, 1, 2, 2, 3);
        MovablePoint point = new MovablePoint(1, 2, 3, 4);

        System.out.println(circle);
        System.out.println(point);

        circle.moveDown();

        System.out.println(circle);
    }
}