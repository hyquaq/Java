import java.math.BigDecimal;

public class Solution {

    public static void main(String[] args) {
        String n = "0.1";
        BigDecimal bigS = new BigDecimal(n);
        System.out.println(bigS.compareTo(new BigDecimal(".1")));
    }
}