public class exampleOverloading {
    public static int abs(int a) {
        return a > 0 ? a : -a;
    }

    public static double abs(double a) {
        return a > 0 ? a : -a;
    }

    public static void main(String[] args) {
        System.out.println(abs(10));
        System.out.println(abs(12.10));

    }
}