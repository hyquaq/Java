public class Main {

    public static int add(int... args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += args[i];
        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println(add(1));
        System.out.println(add(1, 2, 3));
        System.out.println(add(1, 2, 3, 1, 2, 10, 1, 1, 2));
    }
}