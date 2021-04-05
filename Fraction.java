public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction() {
        this.numerator = 0;
        this.denominator = 1;
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction(Fraction f) {
        this.numerator = f.numerator;
        this.denominator = f.denominator;
    }

    public Fraction add(Fraction f) {
        Fraction kq = new Fraction();
        if (this.denominator == f.denominator) {
            kq.numerator = this.numerator + f.numerator;
            kq.denominator = this.denominator;
        } else {
            kq.numerator = this.numerator * f.denominator + f.numerator * this.denominator;
            kq.denominator = this.denominator * f.denominator;
        }
        kq.reducer();
        return kq;
    }

    public Fraction sub(Fraction f) {
        Fraction kq = new Fraction();
        if (this.denominator == f.denominator) {
            kq.numerator = this.numerator - f.numerator;
            kq.denominator = this.denominator;
        } else {
            kq.numerator = this.numerator * f.denominator - f.numerator * this.denominator;
            kq.denominator = this.denominator * f.denominator;
        }
        kq.reducer();
        return kq;
    }

    public Fraction mul(Fraction f) {
        Fraction kq = new Fraction();
        kq.numerator = this.numerator * f.numerator;
        kq.denominator = this.denominator * f.denominator;
        kq.reducer();
        return kq;
    }

    public Fraction div(Fraction f) {
        Fraction kq = new Fraction();
        kq.numerator = this.numerator * f.denominator;
        kq.denominator = this.denominator * f.numerator;
        kq.reducer();
        return kq;
    }

    public int Gcd(int a, int b) {
        if (a < 0) {
            a = a * -1;
        }
        if (b < 0) {
            b = b * -1;
        }
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    public void reducer() {
        int uc = Gcd(this.numerator, this.denominator);
        this.numerator = this.numerator / uc;
        this.denominator = this.denominator / uc;

    }

    public String toString() {
        return "Fraction [num =" + this.numerator + "," + "den =" + this.denominator + "]";
    }
}