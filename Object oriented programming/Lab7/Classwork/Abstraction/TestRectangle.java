public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(6, 8);
        Rectangle rec1 = new Rectangle(6, 8);
        Rectangle rec2 = new Rectangle(7, 9);
        System.out.println(rec.equals(rec1));
        System.out.println(rec.equals(rec2));
    }
}