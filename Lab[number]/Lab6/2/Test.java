public class Test {
    public static void main(String[] args) {
        Person person1 = new Person("Huy", "KTX");
        System.out.println(person1);

        Student person2 = new Student("Huy", "KTX", "IT", 2020, 20.2);
        System.out.println(person2);

        Staff person3 = new Staff("Huy", "KTX", "TDT", 123.3);
        System.out.println(person3);
    }
}