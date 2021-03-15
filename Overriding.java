public class Overriding {

    /**
     * Animal
     */
    static class Animal {

        public void sounds() {
            System.out.println("soud");
        }
    }

    class Dog extends Animal {

        Dog() {

        }

        public void main(String[] args) {
            sounds();
        }

        public void sounds() {
            System.out.println("go go");
        }
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.sounds();
    }
}
