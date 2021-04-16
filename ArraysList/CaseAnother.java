import java.util.*;

public class CaseAnother {
    public static void main(String[] args) {
        int n = 3;
        ArrayList[] list = new ArrayList[n];
        list[0] = new ArrayList();
        list[0].add(10);
        list[0].add("huy");
        list[0].add(1.1);

        System.out.println(list[0].toString());
    }
}