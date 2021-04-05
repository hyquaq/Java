public class testFraction {
    public static void main(String[] args) {
        Fraction ft1 = new Fraction(2, 3);
        Fraction ft2 = new Fraction(5, 7);
        Fraction result = ft1.add(ft2);
        System.out.println(result.toString());
        result = ft1.sub(ft2);
        System.out.println(result.toString());
        result = ft1.mul(ft2);
        System.out.println(result.toString());
        result = ft1.div(ft2);
        System.out.println(result.toString());
    }
}