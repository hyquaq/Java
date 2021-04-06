// package Convert;

public class Convert {
    public static void main(String[] args) {
        int number = 1010;

        // convert int -> String
        String afterConvert = String.valueOf(number);
        System.out.println(afterConvert + 1);

        // other way
        // use String.format
        System.out.println(String.format("%d", number) + 1);

        // convert String -> int
        int afterConvert2 = Integer.valueOf(afterConvert);
        System.out.println(afterConvert2 + 1);
    }
}
