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

    public static void showMaxNegativeAndPositive(ArrayList<Integer> source) {
        int maxPositive = source.get(0);
        for (int i = 1; i < source.size(); i++) {
            if (maxPositive < source.get(i)) {
                maxPositive = source.get(i);
            }
        }

        int maxNegative = -99;
        int vitri;
        for (int i = 0; i < source.size(); i++) {
            if (source.get(i) < 0) {
                maxNegative = source.get(i);
                vitri = i;
                break;
            }
        }

        if (maxNegative == -99) {
            return;
        } else {
            for (int i = vitri; i < source.size(); i++) {
                if (source.get(i) < maxNegative && source.get(i) < 0) {
                    maxNegative = source.get(i);
                }
            }
        }

        System.out.println(String.format("So am lon nhat la %d - So duong lon nhat la %d", maxNegative, maxPositive));
    }

    public static void showMaxEvenAndOdd(ArrayList<Integer> source) {
        int maxEven = 99;
        int vtE = 0;

        for (int i = 0; i < source.size(); i++) {
            if (source.get(i) % 2 == 0) {
                maxEven = source.get(i);
                vtE = i;
                break;
            }
        }
        if (maxEven == 99) {
            return -1;
        } else {
            for (int i = vtE; i < source.size(); i++) {
                if (source.get(i) > maxEven && source.get(i) % 2 == 0) {
                    maxEven = source.get(i);
                }
                return maxEven;
            }
        }

        int maxOdd = 99;
        int vtO = 0;

        for (int i = 0; i < source.size(); i++) {
            if (source.get(i) % 2 != 0) {
                maxOdd = source.get(i);
                vtO = i;
                break;
            }
        }
        if (maxOdd == 99) {
            return -1;
        } else {
            for (int i = vtO; i < source.size(); i++) {
                if (source.get(i) > maxOdd && source.get(i) % 2 != 0) {
                    maxOdd = source.get(i);
                }
                return maxOdd;
            }
        }

        System.out.println(String.format("So chan lon nhat la %d - So le lon nhat la %d", maxEven, maxOdd));
    }

    public static void main(String[] args) {
        ArrayList<Integer> groups = inputArrayList();
        System.out.println(showMaxNegativeAndPositive(groups));
        System.out.println(showMaxEvenAndOdd(groups));
    }
}