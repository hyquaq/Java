import java.util.Arrays;
import java.util.Scanner;

public class Array1 {
    static Scanner sc = new Scanner(System.in);

    public static int maxEven(int[] a) {
        int max = 0;
        int index;
        for (index = 0; index < a.length; ++index) {
            if (a[index] % 2 == 0) {
                max = a[index];
                break;
            }
        }
        if (max == 0) {
            return -1;
        } else {
            for (int i = index; i < a.length; i++) {
                if (a[i] % 2 == 0 && a[i] < max) {
                    max = a[i];
                }
            }
        }

        return max;
    }

    public static int minOdd(int[] a) {
        int min = 0;
        int index;
        for (index = 0; index < a.length; ++index) {
            if (a[index] % 2 != 0) {
                min = a[index];
                break;
            }
        }
        if (min == 0) {
            return -1;
        } else {
            for (int i = index; i < a.length; i++) {
                if (a[i] % 2 != 0 && a[i] < min) {
                    min = a[i];
                }
            }
        }

        return min;
    }

    public static int sumMEMO(int[] a) {
        return maxEven(a) + minOdd(a);
    }

    public static int sumEven(int[] a) {
        int sumEven = 0;
        for (int value : a) {
            if (value % 2 == 0) {
                sumEven += value;
            }
        }

        return sumEven;
    }

    public static int proOdd(int[] a) {
        int proOdd = 1;
        for (int value : a) {
            if (value % 2 != 0) {
                proOdd *= value;
            }
        }

        return proOdd;
    }

    public static int idxFirstEven(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                return i;
            }
        }
        return -1;
    }

    public static int idxLastOdd(int[] a) {
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] % 2 != 0) {
                return i;
            }
        }
        return -1;
    }

    public static int[] input(int n) {
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = sc.nextInt();
        }

        return result;
    }

    public static void main(String[] args) {
        int n;
        n = sc.nextInt();
        int[] a = input(n);
        System.out.println(Arrays.toString(a));
        System.out.println(minOdd(a));
        System.out.println(maxEven(a));
        System.out.println(proOdd(a));
        System.out.println(idxFirstEven(a));
        System.out.println(idxLastOdd(a));
    }
}
