public class Fraction{
    private int numerator, denominator;

    public Fraction(){
        this.numerator = 0;
        this.denominator = 1;
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
        this.reducer();
        return this;
    }

    public Fraction sub(Fraction f){
        this.numerator = this.numerator * f.denominator - f.numerator * this.denominator;
        this.denominator *=f.denominator;
        this.reducer();
        return this; 
    }
    
    public Fraction mul(Fraction f){
        this.numerator *= f.numerator;
        this.denominator *= f.denominator;
        this.reducer();
        return this;
    }

    public Fraction div(Fraction f){
        this.numerator *= f.denominator;
        this.denominator *= f.numerator;
        this.reducer();
        return this;
    }

    public int gcd(int x, int y){
        if (x < 0){
            x *= -1;
        } 
        if (y < 0){
            y *= -1;
        }
        while(x != y){
            if (x > y){
                x -= y;
            }else{
                y -= x;
            }
        }
        
        return x;
    }

    public void reducer(){
        int gcd = gcd(this.numerator, this.denominator);
        this.numerator /= gcd;
        this.denominator /= gcd;
    }

    @Override
    public String toString(){
        return "Fraction[num=" + this.numerator + ", den=" + this.denominator + "]";
    }
}