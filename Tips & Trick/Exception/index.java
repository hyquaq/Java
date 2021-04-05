// package Exception;

public class index {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3 };

        try {
            System.out.println(a[10]);
        } catch (Exception e) {
            // System.out.println(e.)
            System.out.println(e.getMessage());
            // System.out.println("error");
        }
    }
}
