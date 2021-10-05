public interface FractionI {
    public int getNumerator();

    public void setNumerator(int numerator);

    public int getDenominator();

    public void setDenominator(int denominator);

    public FractionI simplify();

    public FractionI add(FractionI f);

    public FractionI minus(FractionI f);

    public FractionI times(FractionI f);

}