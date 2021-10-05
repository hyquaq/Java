import java.text.DecimalFormat;
import java.util.*;
// package Arithmetic Mean;

public class index {
    public static int sumArray(int[] a) {
        int sum = 0;
        for (int value : a) {
            sum += value;
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9 };

        // default
        double sum = sumArray(a);
        System.out.println(sum / a.length);

        // printf from c
        System.out.printf("%.5f\n", sum / a.length);

        // use String.format()
        String result = String.format("%.5f", sum / a.length);
        System.out.println(result);

        // use DecimalFormat
        DecimalFormat df = new DecimalFormat("#.####");
        double ans = sum / a.length;
        System.out.println(df.format(ans));
    }
}
