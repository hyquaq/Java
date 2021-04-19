class addPositive {
    int add(int n, int p) throws Exception {
        if (p < 0) {
            throw new Exception("element add should be positive");
        }

        if (p == 0) {

            throw new Exception("element add should not be zero");
        }

        return n + p;
    }
}

public class Solution {
    public static void main(String[] args) {
        addPositive add = new addPositive();

        try {
            System.out.println(add.add(1, 2));
            System.out.println(add.add(1, 0));
            System.out.println(add.add(1, 2));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // System.out.println(add.add(1, 2));
    }
}