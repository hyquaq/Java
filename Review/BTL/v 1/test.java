public class test {

    public static void main(String[] args) {
        Point p = (Point) new Point2();
        p.sua();
        // p.an();
        Point2 p2 = (Point2) p;
        p2.an();
    }
}
