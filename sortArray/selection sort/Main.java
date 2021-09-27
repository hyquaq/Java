import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {

    public static int is(int[] a, int index) throws NoSuchElementException {
        if (index >= a.length) {
            throw new NoSuchElementException("index lon hon a.length");
        }
        return a[index];
    }

    public static void main(String[] args) {

        int[] a = { 2, 1, 3, 0, 5 };

        System.out.println(is(a, 5));

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
