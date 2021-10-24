class Test {

    public static double computeA(int n) {
        if (n == 0) {
            return 2;
        }

        return 2 - (1 / 2) * computeA(n - 1);
    }

    public static double computeB(int n) {
        if (n < 10) {
            return 1;
        }

        return 1 + computeB(n / 10);
    }

    public static double computeC(int n, int k) {

        if (k == 1)
            return n;

        return n + computeC(n, k - 1);
    }

    public static double computeD(int n) {
        if (n <= 1) {
            return n;
        }

        return computeD(n - 1) + computeD(n - 2);
    }

    public static void main(String[] args) {

        System.out.println("hi");
    }
}