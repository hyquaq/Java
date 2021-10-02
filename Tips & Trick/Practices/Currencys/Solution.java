import java.util.*;
import java.text.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        /*
         * Create custom Locale for India. I used the "IANA Language Subtag Registry" to
         * find India's country code
         */
        Locale indiaLocale = new Locale("en", "IN");
        Locale vietnamLocale = new Locale("vi", "VN");

        /* Create NumberFormats using Locales */
        NumberFormat vietnam = NumberFormat.getCurrencyInstance(vietnamLocale);
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat india = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);

        System.out.println("Vietnam: " + vietnam.format(payment));
        System.out.println("US: " + us.format(payment));
        System.out.println("France: " + france.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
    }
}
