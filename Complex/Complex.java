public class Complex {
    private double real, imag;

    public Complex() {
        this(0, 0);
    }

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    // pre-cond: c is Complex
    // post-cond: return this + c
    public Complex add(Complex c) {
        this.setReal(this.getReal() + c.getReal());
        this.setImag(this.getImag() + c.getImag());
        return this;
    }

    // pre-cond: c is Complex
    // post-cond: return this - c
    public Complex minus(Complex c) {
        this.setReal(this.getReal() - c.getReal());
        this.setImag(this.getImag() - c.getImag());
        return this;
    }

    // pre-cond: c is Complex
    // post-cond: return this * c :: (a + bi)(c + di) => (ac-bd) + (ad+bc)i
    public Complex times(Complex c) {
        double real = this.getReal() * c.getReal() - this.getImag() * c.getImag();
        double imag = this.getReal() * c.getImag() + this.getImag() * c.getReal();
        this.setReal(real);
        this.setImag(imag);
        return this;
    }

    @Override
    public String toString() {
        if (this.getImag() >= 0) {
            return String.format("%.2f+%.2fi", this.getReal(), this.getImag());
        }
        return String.format("%.2f%.2fi", this.getReal(), this.getImag());
    }

    public static void main(String[] args) {
        Complex ans = new Complex(1, -2);
        Complex c = new Complex(2, -5);

        System.out.println(ans);
        System.out.println(ans.minus(c));
        System.out.println(ans.times(c));
    }
}
