import java.util.ArrayList;
import java.util.Iterator;

public class MyArrayList {
    public static void main(String[] args) {
        ArrayList fruits = new ArrayList();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("cherry");

        // case 1
        Iterator it = fruits.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println();
        // case 2
        for (Object fruit : fruits) {
            System.out.print(fruit + " ");
        }
    }
}