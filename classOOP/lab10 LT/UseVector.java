import java.util.*;

public class UseVector {

    static Scanner sc = new Scanner(System.in);

    public static void inputVector(Vector<Integer> myVector) {
        System.out.print("Enter length: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            myVector.add(value);
        }
    }

    public static void outputVector(Vector<Integer> myVector) {
        System.out.println(myVector.toString());
    }

    public static void showNegativeAndPositives(Vector<Integer> myVector) {
        String negatives = "negative numbers: ";
        String positives = "positives numbers: ";
        for (int value : myVector) {
            if (value >= 0) {
                positives += Integer.toString(value) + " ";
            } else {
                negatives += Integer.toString(value) + " ";
            }
        }

        System.out.println(positives);
        System.out.println(negatives);
    }

    public static int indexOfX(Vector<Integer> myVector, int x) {
        for (int i = 0; i < myVector.size(); i++) {
            if (myVector.get(i) == x) {
                return i;
            }
        }

        return -1;
    }

    public int findFirstNegative(Vector<Integer> myVector) {
        for (int i = 0; i < myVector.size(); i++) {
            if (myVector.get(i) < 0) {
                return myVector.get(i);
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

    public int findPrime(Vector<Integer> myVector) {
        for (int i = 0; i < myVector.size(); i++) {
            if (isPrime(myVector.get(i))) {
                return myVector.get(i);
            }
        }
        return -1;
    }

    public static int maxNegative(Vector<Integer> myVector) {
        int result = 1;
        for (int value : myVector) {
            if (value < 0) {
                result = value;
                break;
            }
        }
        if (result != 1) {
            for (int value : myVector) {
                if (value > result && value < 0) {
                    result = value;
                }
            }
        } else {
            return -1;
        }

        return result;
    }

    public static int maxPositive(Vector<Integer> myVector) {
        int result = -1;
        for (int value : myVector) {
            if (value > 0) {
                result = value;
                break;
            }
        }
        if (result != -1) {
            for (int value : myVector) {
                if (value > result && value > 0) {
                    result = value;
                }
            }
        } else {
            return -1;
        }

        return result;
    }

    public int maxEven(Vector<Integer> myVector) {
        int result = -1;
        for (int value : myVector) {
            if (value % 2 == 0) {
                result = value;
                break;
            }
        }
        if (result != -1) {
            for (int value : myVector) {
                if (value > result && value % 2 == 0) {
                    result = value;
                }
            }
        } else {
            return -1;
        }

        return result;
    }

    public int maxOdd(Vector<Integer> myVector) {
        int result = -1;
        for (int value : myVector) {
            if (value % 2 != 0) {
                result = value;
                break;
            }
        }
        if (result != -1) {
            for (int value : myVector) {
                if (value > result && value % 2 != 0) {
                    result = value;
                }
            }
        } else {
            return -1;
        }

        return result;
    }

    public int sum(Vector<Integer> myVector) {
        int sum = 0;
        for (int value : myVector) {
            sum += value;
        }
        return sum;
    }

    public int sumPositive(Vector<Integer> myVector) {
        int sum = 0;
        for (int value : myVector) {
            if (value > 0) {
                sum += value;
            }
        }
        return sum;
    }

    public double average(Vector<Integer> myVector) {
        int sum = 0;
        for (int value : myVector) {
            sum += value;
        }
        return sum / myVector.size();
    }

    public double averagePositive(Vector<Integer> myVector) {
        int sum = 0;
        for (int value : myVector) {
            if (value > 0) {
                sum += value;
            }
        }
        return sum / myVector.size();
    }

    public static void add(Vector<Integer> myVector, int index, int value) {
        myVector.add(index, value);
    }

    public static void remove(Vector<Integer> myVector, int key) {
        int index = myVector.indexOf(key);
        if (index != -1) {
            myVector.remove(index);
        }
    }

    public static void removeAll(Vector<Integer> myVector, int key) {
        while (myVector.indexOf(key) != -1) {
            myVector.remove(key);
        }
    }

    public static void sort(Vector<Integer> myVector) {
        Collections.sort(myVector);
    }

    public static void main(String[] args) {
        Vector<Integer> myVector = new Vector<Integer>(3);
        inputVector(myVector);
        outputVector(myVector);
        showNegativeAndPositives(myVector);
        System.out.println(indexOfX(myVector, 2));
        sort(myVector);
        outputVector(myVector);
        // sort(myVector);
        // outputArray(myVector);
        // System.out.println(maxNegative(myVector));
        // System.out.println(maxPositive(myVector));

        // outputArray(myVector);
        // Vector<Integer>afterRemove = removeAll(myVector, 2);
        // outputArray(afterRemove);

        // outputArray(myVector);
        // Vector<Integer>afterAdd = add(myVector, 0, 100);
        // outputArray(afterAdd);
    }
}
