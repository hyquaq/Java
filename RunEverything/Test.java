import java.util.*;

public class Test {
    public static void removeFirstWord(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] words = sc.nextLine().split(" ");
        ArrayList<String> programs = new ArrayList<String>();

        for (int i = 1; i < words.length; i++) {
            programs.add(words[i]);
        }
    }

    public static void testChaCon() {
        SuperParent sp = new SuperParent();
        // sp.methods();
        Point p = (Point) sp;
        p.show();
    }

    public static void main(String[] args) {
        testChaCon();
    }
}