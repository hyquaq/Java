import java.util.*;

public class Group6 {
    static Scanner sc = new Scanner(System.in);

    public static ArrayList<Integer> inputArrayList() {
        ArrayList<Integer> result = new ArrayList<Integer>();
        System.out.print("Enter length arrayList: ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("You wrong!");
            System.exit(1);
        }
        while (n-- > 0) {
            System.out.print("Number next: ");
            int numberCurrent = sc.nextInt();
            result.add(numberCurrent);
        }
        return result;
    }

    public static void outputArrayList(ArrayList<Integer> source) {
        System.out.println(source);
    }

    public static void showNegativeAndPositives(ArrayList<Integer> source) {
        String outNegative = "so am la: ";
        String outPositive = "so duong la: ";
        for (Integer value : source) {
            if (value < 0) {
                outNegative += " " + String.valueOf(value);
            } else {
                outPositive += " " + String.valueOf(value);
            }
        }
        System.out.println(outNegative);
        System.out.println(outPositive);
    }

    public static Integer findFirstElement(ArrayList<Integer> source, int element) {
        for (int i = 0; i < source.size(); i++) {
            if (source.get(i) == element) {
                return i;
            }
        }
        // not found
        return -1;
    }

    public static Integer findNegativeElement(ArrayList<Integer> source) {
        for (int i = 0; i < source.size(); i++) {
            if (source.get(i) < 0) {
                return source.get(i);
            }
        }
        // not found
        // return -1;
        return null;
    }

    public static Boolean checkPrime(Integer n) // BONUS
    {
        if (n < 2) {
            return false;
        }

        int CanBac2 = (int) Math.sqrt(n);

        for (int i = 2; i <= CanBac2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static Integer findPrimeElement(ArrayList<Integer> source) {
        for (int i = 0; i < source.size(); i++) {
            if (checkPrime(source.get(i)) == true) {
                return source.get(i);
            }
        }
        // not found
        return -1;
    }

    public static void showMaxNegativeAndPositive(ArrayList<Integer> source) {
        Integer negative = null, positive = null;
        for (Integer value : source) {
            if (value < 0 && (negative == null || value > negative)) {
                negative = value;
            }

            if (value > 0 && (positive == null || value > positive)) {
                positive = value;
            }
        }

        System.out.println(String.format("So am lon nhat la %d - So duong lon nhat la %d", negative, positive));
    }

    public static void showMaxEvenAndOdd(ArrayList<Integer> source) {
        Integer maxEven = null;
        Integer maxOdd = null;

        for (int i = 0; i < source.size(); i++) {
            if (source.get(i) % 2 == 0 && (maxEven == null || maxEven < source.get(i))) {
                maxEven = source.get(i);
            } else if (maxOdd == null || maxOdd < source.get(i)) {
                maxOdd = source.get(i);
            }

        }

        System.out.println(String.format("So chan lon nhat la %d - So le lon nhat la %d", maxEven, maxOdd));
    }

    public static Integer sum(ArrayList<Integer> source) {
        int sum = 0;
        for (Integer value : source) {
            sum += value;
        }
        return sum;
    }

    public static Integer sumPositive(ArrayList<Integer> source) {
        int sum = 0;
        for (Integer value : source) {
            if (value > 0) {
                sum += value;
            }
        }
        return sum;
    }

    public static Double average(ArrayList<Integer> source) {
        return Double.valueOf(sum(source)) / Double.valueOf(source.size());
    }

    public static Double averagePositive(ArrayList<Integer> source) {
        return Double.valueOf(sumPositive(source)) / Double.valueOf(source.size());
    }

    public static ArrayList<Integer> remove(ArrayList<Integer> source, int value) {
        ArrayList<Integer> result = new ArrayList<Integer>(source);
        for (int i = 0; i < source.size(); i++) {
            if (source.get(i) == value) {
                result.remove(i);
                return result;
            }
        }
        return result;
    }

    public static ArrayList<Integer> removeAll(ArrayList<Integer> source, int value) {
        ArrayList<Integer> result = new ArrayList<Integer>(source);
        Iterator<Integer> it = result.iterator();

        while (it.hasNext()) {
            if (((Integer) it.next()) == value) {
                it.remove();
            }
        }

        return result;
    }

    public static ArrayList<Integer> add(ArrayList<Integer> source, int index, int value) {
        ArrayList<Integer> result = new ArrayList<Integer>(source);
        result.add(index, value);
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> groups = inputArrayList();
        outputArrayList(groups);

        showNegativeAndPositives(groups);

        System.out.print("Nhap phan tu can tim: ");
        int x = sc.nextInt();
        System.out.println(String.format("vi tri dau tien cua %d la %d", x, findFirstElement(groups, x)));

        System.out.println(String.format("phan tu am dau tien la %d", findNegativeElement(groups)));
        System.out.println(String.format("phan tu nguyen to dau tien la %d", findPrimeElement(groups)));
        showMaxNegativeAndPositive(groups);
        showMaxEvenAndOdd(groups);

        System.out.println(String.format("tong ca phan tu la %d", sum(groups)));
        System.out.println(String.format("tong ca phan tu duong la %d", sumPositive(groups)));
        System.out.println(String.format("trung binh cong tat ca phan tu la %f", average(groups)));
        System.out.println(String.format("trung binh cong tat ca phan tu duong la %f", averagePositive(groups)));

        outputArrayList(groups);
        System.out.print("Nhap phan tu muon them: ");
        int value = sc.nextInt();
        System.out.println("them phan tu vao dau" + add(groups, 0, value));
        System.out.println("them phan tu vao cuoi" + add(groups, groups.size(), value));
        System.out.println("Nhap vi tri muon them phan tu: ");
        int index = sc.nextInt();
        System.out.println("them phan tu vao vi tri bat ki" + add(groups, index, value));

        outputArrayList(groups);
        ArrayList<Integer> tmp = new ArrayList<Integer>(groups);
        tmp.remove(0);
        System.out.println("xoa phan tu o dau mang" + tmp);
        tmp = new ArrayList<Integer>(groups);
        tmp.remove(tmp.size() - 1);
        System.out.println("xoa phan tu o cuoi mang" + tmp);
        System.out.print("Nhap phan tu muon xoa ");
        x = sc.nextInt();
        System.out.println("sau khi xoa 1 lan" + remove(groups, x));
        System.out.println("sau khi xoa het" + removeAll(groups, x));

        Collections.sort(groups);
        System.out.println("sau khi sap xep" + groups);
    }
}