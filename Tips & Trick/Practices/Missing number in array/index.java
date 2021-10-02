public class index {

    public static int missingNumberInArray(int[] a, int n) {
        int i = 0;
        int total = (n * (n + 1)) / 2;
        for (int value : a) {
            total -= value;
        }

        return total;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] a = new int[n - 1];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 5;

        System.out.println(missingNumberInArray(a, n));
    }
}
