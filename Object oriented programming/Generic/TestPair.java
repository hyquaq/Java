public class TestPair {
    public static <T> void printArray(T[] a) {
        for (T value : a) {
            System.out.println(value);
        }
    }

    public static void main(String[] args) {
        Pair<Double> point = new Pair(1, 2);
        System.out.println(point);

        NewPair<String, Integer> person = new NewPair("Nguyen Huy", 19);
        System.out.println("name: " + person.getFirst());
        System.out.println("age: " + person.getSecond());
        System.out.println(person);

        // test method Generic
        Integer[] a = { 1, 2, 3, 4, 5 };
        Double[] b = { 1.1, 1.2, 1.3 };
        String[] name = { "a", "b", "c", "d", "e" };
        printArray(a);
        printArray(b);
        printArray(name);
    }
}
