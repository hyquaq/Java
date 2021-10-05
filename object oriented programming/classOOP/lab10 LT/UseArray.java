import java.util.*;

public class UseArray {

    static Scanner sc = new Scanner(System.in);

    public static void inputArray(int[] myArr) {
        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = sc.nextInt();
        }
    }

    public static void outputArray(int[] myArr) {
        System.out.println(Arrays.toString(myArr));
    }

    public void showNegativeAndPositives(int[] myArr) {
        String negatives = "negative numbers: ";
        String positives = "positives numbers: ";
        for (int value : myArr) {
            if (value >= 0) {
                positives += Integer.toString(value) + " ";
            } else {
                negatives += Integer.toString(value) + " ";
            }
        }

        System.out.println(positives);
        System.out.println(negatives);
    }

    public int indexOfX(int[] myArr, int x) {
        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i] == x) {
                return i;
            }
        }

        return -1;
    }

    public int findFirstNegative(int[] myArr) {
        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i] < 0) {
                return myArr[i];
            }
        }
        return -1;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Integer.valueOf(number / 2); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public int findPrime(int[] myArr) {
        for (int i = 0; i < myArr.length; i++) {
            if (isPrime(myArr[i])) {
                return myArr[i];
            }
        }
        return -1;
    }

    public static int maxNegative(int[] myArr) {
        int result = 1;
        for (int value : myArr) {
            if (value < 0) {
                result = value;
                break;
            }
        }
        if (result != 1) {
            for (int value : myArr) {
                if (value > result && value < 0) {
                    result = value;
                }
            }
        } else {
            return -1;
        }

        return result;
    }

    public static int maxPositive(int[] myArr) {
        int result = -1;
        for (int value : myArr) {
            if (value > 0) {
                result = value;
                break;
            }
        }
        if (result != -1) {
            for (int value : myArr) {
                if (value > result && value > 0) {
                    result = value;
                }
            }
        } else {
            return -1;
        }

        return result;
    }

    public int maxEven(int[] myArr) {
        int result = -1;
        for (int value : myArr) {
            if (value % 2 == 0) {
                result = value;
                break;
            }
        }
        if (result != -1) {
            for (int value : myArr) {
                if (value >= result && value % 2 == 0) {
                    result = value;
                }
            }
        } else {
            return -1;
        }

        return result;
    }

    public int maxOdd(int[] myArr) {
        int result = -1;
        for (int value : myArr) {
            if (value % 2 != 0) {
                result = value;
                break;
            }
        }
        if (result != -1) {
            for (int value : myArr) {
                if (value > result && value % 2 != 0) {
                    result = value;
                }
            }
        } else {
            return -1;
        }

        return result;
    }

    public int sum(int[] myArr) {
        int sum = 0;
        for (int value : myArr) {
            sum += value;
        }
        return sum;
    }

    public int sumPositive(int[] myArr) {
        int sum = 0;
        for (int value : myArr) {
            if (value > 0) {
                sum += value;
            }
        }
        return sum;
    }

    public double average(int[] myArr) {
        int sum = 0;
        for (int value : myArr) {
            sum += value;
        }
        return sum / myArr.length;
    }

    public double averagePositive(int[] myArr) {
        int sum = 0;
        for (int value : myArr) {
            if (value > 0) {
                sum += value;
            }
        }
        return sum / myArr.length;
    }

    public static int[] add(int[] myArr, int index, int value) {
        int[] result = new int[myArr.length + 1];
        for (int i = 0; i < index; i++) {
            result[i] = myArr[i];
        }
        result[index] = value;
        for (int i = index; i < myArr.length; i++) {
            result[i + 1] = myArr[i];
        }
        return result;
    }

    public static int[] remove(int[] myArr, int key) {
        int countKeys = 1, j = 0;
        int[] result = new int[myArr.length - 1];
        for (int i = 0; i < myArr.length; i++) {
            if (countKeys > 0 && myArr[i] == key) {
                countKeys--;
            } else {
                result[j++] = myArr[i];
            }
        }
        return result;
    }

    public static int[] removeAll(int[] myArr, int key) {
        int countKeys = 0;
        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i] == key) {
                countKeys++;
            }
        }
        int j = 0;
        int[] result = new int[myArr.length - countKeys];
        for (int i = 0; i < myArr.length; i++) {
            if (countKeys > 0 && myArr[i] == key) {
                countKeys--;
            } else {
                result[j++] = myArr[i];
            }
        }
        return result;
    }

    public static void sort(int[] myArr) {
        for (int i = 0; i < myArr.length - 1; i++) {
            for (int j = i + 1; j < myArr.length; j++) {
                if (myArr[i] - myArr[j] > 0) {
                    int tmp = myArr[i];
                    myArr[i] = myArr[j];
                    myArr[j] = tmp;
                }
            }

        }
    }

    public static void main(String[] args) {
        int[] myArr = { 1, 2, 3, 2, 10, 1, 2, 5, -1, 2, -4, -6, -9 };
        sort(myArr);
        outputArray(myArr);
        System.out.println(maxNegative(myArr));
        System.out.println(maxPositive(myArr));

        outputArray(myArr);
        int[] afterRemove = removeAll(myArr, 2);
        outputArray(afterRemove);

        outputArray(myArr);
        int[] afterAdd = add(myArr, 0, 100);
        outputArray(afterAdd);
    }
}