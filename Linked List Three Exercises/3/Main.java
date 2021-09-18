public class Main {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(2, 10);
        Fraction f2 = new Fraction(4, 10);
        Fraction f3 = new Fraction(4, 8);
        Fraction f4 = new Fraction(20, 3);
        f1.simplify();
        // System.out.println(f1);


        LinkedFraction list = new LinkedFraction();

        list.addFirst(f1);
        list.addFirst(f2);
        list.addFirst(f3);
        list.addFirst(f1);
        list.addFirst(f4);

        // System.out.println(list.indexOf(2).getElement());
        // list.addAfter(list.indexOf(2), f1);

        // System.out.println(list.contains(f2));
        // System.out.println(list.remove(f2) + "-");
        // System.out.println(list.removeFirst() + "-");

        // -> error
        // System.out.println(list.removeAfter(list.indexOf(list.size())) + "-");

        list.simplify();
        list.sort();
        list.print();
        // System.out.println(list.size());

        // System.out.println(list.sumAll());

        // list.showAllGreaterThanOne();






    }

}
