
// import java.util.Arrays;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {

    public static void sort(int[] a) {
        for (int i = 1; i < a.length; i++) {

            int j = i;
            while (j > 0 && a[i] < a[j - 1]) {
                j--;
            }

            // swap
            insert(a, i, j);
            System.out.println(Arrays.toString(a));

        }
    }

    public static void insert(int a[], int indexValue, int indexPosion) {
        int temp = a[indexValue];
        for (int j = indexValue; j > indexPosion; j--) {
            a[j] = a[j - 1];
        }

        a[indexPosion] = temp;
    }

    public static void main(String[] args) {

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
