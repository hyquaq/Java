import java.util.*;

public class Test {
    public static void main(String[] args) {
        Point2D a = new Point2D(1, 2);
        System.out.println(a);
        System.out.println(Arrays.toString(a.getXY()));
        a.setXY(new float[] { 0.1f, 1.0f });
        System.out.println(Arrays.toString(a.getXY()));

        Point3D b = new Point3D(3, 4, 5.6f);
        System.out.println(b);
        System.out.println(Arrays.toString(b.getXYZ()));
        b.setXY(new float[] { 0.1f, 1.0f });
        System.out.println(Arrays.toString(b.getXYZ()));
        b.setXYZ(new float[] { 0.1f, 1.0f, 10.0f });
        System.out.println((b));
    }
}