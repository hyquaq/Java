public class Calculator {
    public double divide(int a, int b) throws ArithmeticException, NumberFormatException {
        if (b == 0) {
            throw new ArithmeticException("divide by zero");
        } else if ((a > 1000 || a < -1000) && (b > 1000 || b < -1000)) {
            throw new NumberFormatException("Number is outside the computation");
        }
        return a / b;
    }

    public int multiply(int a, int b) throws NumberFormatException {
        if ((a > 1000 || a < -1000) && (b > 1000 || b < -1000)) {
            throw new NumberFormatException("Number is outside the computation");
        }
        return a * b;
    }
}