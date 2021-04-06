// package Convert;

public class Casting {
    public static void main(String[] args) {
        // widening casting: mean converting a smaller type to a larger type size
        int smallSize = 10;
        float bigSize = smallSize;
        System.out.println(bigSize);
        // converting a larger type to a smaller size type

        float bigS = 10.1f;
        int smallS = (int) bigS;
        System.out.println(smallS);
    }
}
