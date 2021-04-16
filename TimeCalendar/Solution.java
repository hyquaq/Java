import java.util.*;
import java.util.Locale;

public class Solution {

    public static String findDay(int month, int day, int year) {
        String[] weeks = { "", "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY" };
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day);
        int dayOfWeeks = cal.get(Calendar.DAY_OF_WEEK);
        // debug
        System.out.println(dayOfWeeks);
        return weeks[dayOfWeeks];
    }

    public static void main(String[] args) {
        int year = 2020, month = 2, day = 2;
        System.out.println(findDay(month, day, year));

    }
}
