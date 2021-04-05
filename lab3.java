import java.util.Arrays;
import java.util.Scanner;
import java.lang.*;

public class lab3 {
    static Scanner sc = new Scanner(System.in);

    public static int[] extendArr(int[] a, int element) {
        int[] ans = new int[a.length + 1];
        int t = 0;
        for (int x : a) {
            ans[t++] = x;
        }
        ans[a.length] = element;
        return ans;
    }

    public static void inputArr(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
    }

    public static boolean rmSpecific(int[] arr, int key) {
        int i = 0;
        for (; i < arr.length; i++) {
            if (arr[i] == key) {
                break;
            }
        }

        if (i == arr.length) {
            System.out.println("khong ton tai phan tu " + key);
            return false;
        }

        int[] tmp = new int[arr.length - 1];

        for (int j = 0; j < i; j++) {
            tmp[j] = arr[j];
        }
        for (int j = i; j < arr.length - 1; j++) {
            tmp[j] = arr[j + 1];
        }
        System.out.println(Arrays.toString(tmp));
        return true;

    }

    public static void cau11() {
        System.out.println("cau1: ");
        System.out.print("enter n: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        inputArr(a);
        System.out.println(Arrays.toString(a));
        System.out.print("nhap so can xoa: ");
        int key = sc.nextInt();
        boolean isCheck = rmSpecific(a, key);
        System.out.println(isCheck);
    }

    public static void instertKey(int[] arr, int pos, int val) {
        for (int i = arr.length - 2; i >= pos; i--) {
            arr[i + 1] = arr[i];
        }

        arr[pos] = val;
    }

    public static void cau12() {
        System.out.println("cau2: ");
        System.out.print("enter n: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        inputArr(a);
        System.out.println(Arrays.toString(a));

        System.out.print("enter position: ");
        int pos = sc.nextInt();
        while (pos > n - 1) {
            System.out.print("enter again position: ");
            pos = sc.nextInt();
        }
        System.out.print("enter value: ");
        int val = sc.nextInt();
        instertKey(a, pos, val);

        System.out.println(Arrays.toString(a));
    }

    public static int[] dup(int[] arr) {
        int[] result = new int[arr.length];
        int[] count = new int[arr.length];

        int cnt = 0;
        for (int e : arr) {
            int j = 0;
            for (; j < cnt; j++) {
                if (result[j] == e) {
                    break;
                }
            }

            if (j < cnt) {
                count[j] += 1;
            } else {
                result[cnt] = e;
                count[cnt++] = 1;
            }
        }

//        System.out.println(Arrays.toString(result));
//        System.out.println(Arrays.toString(count));
        int[] ans = new int[0];
        int t = 0;
        for (int i = 0; i < result.length; i++) {
            if (count[i] >= 2) {
                ans = extendArr(ans, result[i]);
//                ans[t++] = result[i];
            }
        }
        return ans;
    }

    public static int[] elementDup(int[] arr) {
        int[] result = new int[arr.length];
        int[] count = new int[arr.length];

        int cnt = 0;
        for (int e : arr) {
            int j = 0;
            for (; j < cnt; j++) {
                if (result[j] == e) {
                    break;
                }
            }

            if (j < cnt) {
                count[j] += 1;
            } else {
                result[cnt] = e;
                count[cnt++] = 1;
            }
        }

        int[] ans = new int[0];
        int t = 0;
        for (int i = 0; i < result.length; i++) {
            if (count[i] != 0) {
                ans = extendArr(ans, result[i]);
            }
        }
        return ans;
    }

    public static void cau13() {
        System.out.println("cau3: ");
        System.out.print("enter n: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        inputArr(a);
        System.out.println(Arrays.toString(a));

        int[] ans = dup(a);

        System.out.println(Arrays.toString(ans));
    }

    public static void cau14() {
        System.out.println("cau4: ");
        System.out.print("enter n: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        inputArr(a);
        System.out.println(Arrays.toString(a));

        int[] ans = elementDup(a);

        System.out.println(Arrays.toString(ans));
    }

    public static void outMatrix(int[][] a) {
        for (int[] i : a) {
            System.out.println(Arrays.toString(i));
        }
    }

    public static void inputMatrix(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
    }

    public static int[][] addMatrix(int[][] a, int[][] b) {
        int[][] ans = a;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                ans[i][j] = a[i][j] + b[i][j];
            }
        }
        return ans;
    }

    public static void cau21() {
        System.out.println("cau21:");
        System.out.println("Enter n = ");
        int n = sc.nextInt();
        System.out.println("Enter m = ");
        int m = sc.nextInt();

        int[][] a = new int[n][m];
        System.out.println("Enter matrix a");
        inputMatrix(a);

        int[][] b = new int[n][m];
        System.out.println("Enter matrix b");
        inputMatrix(b);

        outMatrix(a);
        outMatrix(b);
        System.out.println("After add");
        outMatrix(addMatrix(a, b));
    }

    public static int[][] mulMatrix(int[][] a, int x) {
        int[][] ans = a;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                ans[i][j] *= x;
            }
        }
        return ans;
    }

    public static void cau22() {
        System.out.println("cau22:");
        System.out.println("Enter n = ");
        int n = sc.nextInt();
        System.out.println("Enter m = ");
        int m = sc.nextInt();

        int[][] a = new int[n][m];
        inputMatrix(a);

        System.out.println("Enter number = ");
        int element = sc.nextInt();

        for (int[] e : mulMatrix(a, element)) {
            System.out.println(Arrays.toString(e));
        }
    }

    public static void cau23() {
        System.out.println("cau23:");
        System.out.println("Enter n = ");
        int n = sc.nextInt();
        System.out.println("Enter m = ");
        int m = sc.nextInt();

        int[][] a = new int[n][m];
        inputMatrix(a);

        outMatrix(a);
    }

    public static String firstAddLastName(String name) {
        int index = 0;
        while (name.charAt(index) != ' ') {
            index++;
        }
        String lastName = name.substring(0, index);
        index = name.length() - 1;
        while (name.charAt(index) != ' ') {
            index--;
        }

        String firstName = name.substring(index + 1, name.length());

        return firstName + " " + lastName;
    }

    public static void cau31() {
        System.out.println("cau31:");
        System.out.println("Enter name: ");
        String name = sc.nextLine();

        System.out.println(firstAddLastName(name));
    }


    public static String middleName(String name) {
        int indexFirst = 0;
        while (name.charAt(indexFirst) != ' ') {
            indexFirst++;
        }

        int indexLast = name.length() - 1;
        while (name.charAt(indexLast) != ' ') {
            indexLast--;
        }

        return name.substring(indexFirst + 1, indexLast);
    }

    public static void cau32() {
        System.out.println("cau32:");
        System.out.println("Enter name: ");
        String name = sc.nextLine();

        System.out.println(middleName(name));
    }

    public static String capitalize(String name) {
        String ans = "";
        for (int i = 0; i < name.length(); i++) {
            if (i == 0 || name.charAt(i - 1) == ' ') {
                ans += Character.toUpperCase(name.charAt(i));
            } else {
                ans += Character.toLowerCase(name.charAt(i));
            }
        }
        return ans;
    }

    public static void cau33() {
        System.out.println("cau33:");
        System.out.println("Enter name: ");
        String name = sc.nextLine();

        System.out.println(capitalize(name));
    }

    public static String upperAllVowel(String name) {
        String ans = "";
        for (int i = 0; i < name.length(); i++) {
            char c = Character.toUpperCase(name.charAt(i));
            if (c == 'A' || c == 'O' || c == 'I' || c == 'U' || c == 'E') {
                ans += c;
            } else {
                ans += Character.toLowerCase(name.charAt(i));
            }
        }

        return ans;
    }

    public static void cau34() {
        System.out.println("cau34:");
        System.out.println("Enter name: ");
        String name = sc.nextLine();

        System.out.println(upperAllVowel(name));
    }

    public static void cau41() {
        System.out.print("cau4.1: ");
        System.out.print("enter String:");

        String s = sc.nextLine();
        System.out.println(s.length());
    }

    public static void cau42() {
        System.out.print("cau4.2: ");
        System.out.print("enter String:");

        String s = sc.nextLine();
        int countWord = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ') {
                countWord++;
            }
        }
        System.out.println(countWord);
    }

    public static void cau43() {
        System.out.print("cau4.3: ");
        System.out.print("enter String:");
        String s = sc.nextLine();
        System.out.print("enter string contact: ");
        String sNew = sc.nextLine();

        System.out.println(s.concat(sNew));
    }
    
    // function return true if paramater string s is palindrome
    public static boolean isPalindrome(String s) {
        for (int i = 0; i < (int) s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - (i + 1))) {
                return false;
            }
        }

        return true;
    }

    public static void cau44() {
        System.out.print("cau4.4: ");
        System.out.print("enter String:");
        String s = sc.nextLine();

        if (isPalindrome(s)) {

            System.out.println("la day palindrome");
        } else {

            System.out.println("khong la day palindrome");
        }
    }

    public static void main(String[] arg) {
//        cau11();
//        cau12();
//        cau13();
//        cau14();

//        cau21();
//        cau22();
//        cau23();

//        cau31();
//        cau32();
//        cau33();
//        cau34();

//        cau41();
//        cau42();
//        cau43();
//        cau44();
    }
}
