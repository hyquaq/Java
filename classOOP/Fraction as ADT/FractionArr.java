public class FractionArr implements FractionI {
    private int[] members;

    // Constructors
    public FractionArr() {
        this(0, 1);
    }

    public FractionArr(int numerator, int denominator) {
        members = new int[2];
        setNumerator(numerator);
        setDenominator(denominator);
    }

    public int getNumerator() {
        return this.members[0];
    }

    public void setNumerator(int numerator) {
        this.members[0] = numerator;
    }

    public int getDenominator() {
        return this.members[1];
    }

    public void setDenominator(int denominator) {
        this.members[1] = denominator;
    }

    // Returns greatest common divisor of a and b
    // private method as this is not accessible to clients
    private static int gcd(int a, int b) {
        int rem = 0;
        a = Math.abs(a);
        b = Math.abs(b);
        while (b > 0) {
            rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }

    public FractionI simplify() {
        int gcd = gcd(this.getNumerator(), this.getDenominator());

        this.setNumerator(this.getNumerator() / gcd);
        this.setDenominator(this.getDenominator() / gcd);
        return this;
    }

    public FractionI add(FractionI f) {
        FractionI result = new Fraction(
                this.getNumerator() * f.getDenominator() + this.getDenominator() * f.getNumerator(),
                this.getDenominator() * f.getDenominator());

        return result.simplify();
    }

    public FractionI minus(FractionI f) {
        FractionI result = new Fraction(
                this.getNumerator() * f.getDenominator() - this.getDenominator() * f.getNumerator(),
                this.getDenominator() * f.getDenominator());

        return result.simplify();
    }

    public FractionI times(FractionI f) {
        FractionI result = new Fraction(this.getNumerator() * f.getNumerator(),
                this.getDenominator() * f.getDenominator());

        return result.simplify();
    }

    @Override
    public String toString() {
        return "[" + this.getNumerator() + "/" + this.getDenominator() + "]";
    }

    // @Override
    public boolean equals(FractionI f) {
        if (this.getNumerator() == f.getNumerator() && this.getDenominator() == f.getDenominator()) {
            return true;
        }

        return false;
    }
}
