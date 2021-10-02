// package Copy

import java.util.Arrays;

// - array;

public class index {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int[] arr1 = {};

        System.out.println(arr1.length);

        System.out.println(Arrays.toString(Arrays.copyOf(arr, 10)));
    }

}
