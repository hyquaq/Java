
// import java.util.Arrays;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {

    public static void sort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;

            // find minium
            for (int j = i + 1; j < a.length; j++) {
                if (a[min] > a[j]) {
                    min = j;
                }
            }

            if (i == min) {
                continue;
            }
            // swap
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
            System.out.println(Arrays.toString(a));

        }
    }

    public static void main(String[] args) {

        // int[] a = { 2, 1, 3, 0, 5 };
        int[] a = { 2, 1, 3, 0, 5, 10, -10, 30, -29, -27, 5, 3, -3, -2 };

        sort(a);
        System.out.println(Arrays.toString(a));

        // for (int i = 0; i < a.length - 1; i++) {

        // int min_index = i;
        // for (int j = i + 1; j < a.length; j++) {
        // if (a[min_index] > a[j]) {
        // min_index = j;
        // }
        // }

        // // swap
        // int temp = a[i];
        // a[i] = a[min_index];
        // a[min_index] = temp;
        // }

        // System.out.println(Arrays.toString(a));

    }
}
