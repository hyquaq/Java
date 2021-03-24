public class Fraction{
    private int numerator, denominator;

    public Fraction(){

    }

    public Fraction(int num, int den){
        this.numerator = num;
        this.denominator = den;
    }

    public Fraction(Fraction f){
        this.numerator = f.numerator;
        this.denominator = f.denominator;
    }

    public Fraction add(Fraction f){
        this.numerator = this.numerator * f.denominator + f.numerator * this.denominator;
        this.denominator *= f.denominator;
        return this;
    }

    public Fraction sub(Fraction f){
        this.numerator = this.numerator * f.denominator - f.numerator * this.denominator;
        this.denominator *=f.denominator;
        return this; 
    }
    
    public Fraction mul(Fraction f){
        this.numerator *= f.numerator;
        this.denominator *= f.denominator;
        return this;
    }

    public Fraction div(Fraction f){
        this.numerator *= f.denominator;
        this.denominator *= f.numerator;
        return this;
    }

    public void reducer(){

    }

    @Override
    public String toString(){
        return "Fraction[num=" + this.numerator + ", den=" + this.denominator + "]";
    }
}