
public class Fraction {
    private double numerator, denominator;

    Fraction() {
        this.numerator = 0;
        this.denominator = 1;
    }

    Fraction(double numerator, double denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    Fraction(Fraction item) {
        this.numerator = item.numerator;
        this.denominator = item.denominator;
    }

    public double getDenominator() {
        return denominator;
    }

    public double getNumerator() {
        return numerator;
    }

    public void setDenominator(double denominator) {
        this.denominator = denominator;
    }

    public void setNumerator(double numerator) {
        this.numerator = numerator;
    }

    private double gcd() {
        // double max = Math.max(this.numerator, this.denominator)
        double firstNum = this.numerator;
        double secondNum = this.denominator;

        while (firstNum != secondNum) {
            if (firstNum - secondNum > 0) {
                firstNum -= secondNum;
            } else {
                secondNum -= firstNum;
            }

        }
        return firstNum;
    }

    @Override
    public String toString() {
        // return String.format("[%.1f] ", this.numerator / this.denominator);
        return String.format("[%.1f/ %.1f] ", this.numerator, this.denominator);
    }

    public void simplify() {
        double gcd = this.gcd();
        this.numerator /= gcd;
        this.denominator /= gcd;
    }

    public Fraction add(Fraction amount) {
        Fraction result = new Fraction();
        result.setDenominator(this.getDenominator() * amount.getDenominator());
        result.setNumerator(
                this.getDenominator() * amount.getNumerator() + amount.getDenominator() * this.getNumerator());

        result.simplify();
        return result;
    }

    public Fraction subtract(Fraction amount) {
        Fraction result = new Fraction();
        result.setDenominator(this.getDenominator() * amount.getDenominator());
        result.setNumerator(
                this.getDenominator() * amount.getNumerator() - amount.getDenominator() * this.getNumerator());

        result.simplify();
        return result;
    }

    public boolean isGreaterThanOne() {
        if (numerator / denominator > 1) {
            return true;
        }
        return false;
    }

    public boolean isGreater(Fraction amount) {
        if (numerator / denominator > amount.getNumerator() / amount.getDenominator()) {
            return true;
        }
        return false;
    }

    public void copyFrom(Fraction item) {
        this.setNumerator(item.numerator);
        this.setDenominator(item.denominator);
    }
}
