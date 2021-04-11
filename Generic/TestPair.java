public class TestPair {
    public static void main(String[] args) {
        Pair<Double> point = new Pair(1, 2);
        System.out.println(point);

        NewPair<String, Integer> person = new NewPair("Nguyen Huy", 19);
        System.out.println("name: " + person.getFirst());
        System.out.println("age: " + person.getSecond());
        System.out.println(person);
    }
}
