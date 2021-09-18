import java.util.NoSuchElementException;

public class LinkedFraction {
    private ListNode<Fraction> head = new ListNode<Fraction>(new Fraction());

    private int num_nodes = 0;

    // @Override
    public boolean isEmpty() {
        return num_nodes == 0;
    }

    // @Override
    public int size() {
        return num_nodes;
    }

    // @Override
    public Fraction getFirst() throws NoSuchElementException {
        if (head.getElement() == null) {
            throw new NoSuchElementException("no element");
        }
        return head.getElement();
    }

    // @Override
    public boolean contains(Fraction item) {
        if (this.isEmpty()) {
            return false;
        }
        ListNode<Fraction> current = head;
        for (int i = 0; i < num_nodes; i++) {
            if (current.getElement() == item) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    // @Override
    public void addFirst(Fraction item) {
        ListNode<Fraction> current = head;
        head = new ListNode<Fraction>(new Fraction(item));
        head.setNext(current);
        this.num_nodes += 1;
    }

    // @Override
    public void addAfter(ListNode<Fraction> current, Fraction item) {

        ListNode<Fraction> currentNext = current.getNext();
        ListNode<Fraction> newNode = new ListNode<Fraction>(new Fraction(item));
        current.setNext(newNode);
        newNode.setNext(currentNext);
        this.num_nodes += 1;
    }

    // @Override
    public Fraction remove(Fraction item) throws NoSuchElementException {

        if (head.getElement() == item) {
            return this.removeFirst();
        }
        ListNode<Fraction> current = head;
        for (int i = 0; i < num_nodes - 1; i++) {
            if (current.getNext().getElement() == item) {
                return this.removeAfter(current);
            }
            current = current.getNext();
        }

        throw new NoSuchElementException("no element");
    }

    // @Override.getElement()
    public Fraction removeFirst() throws NoSuchElementException {
        if (num_nodes == 0) {
            throw new NoSuchElementException("no element");
        }
        this.num_nodes -= 1;
        ListNode<Fraction> tempNode = head;
        head = head.getNext();
        return tempNode.getElement();
    }

    // @Override.getElement()
    public Fraction removeAfter(ListNode<Fraction> current) throws NoSuchElementException {
        if (current.getNext() == null) {
            throw new NoSuchElementException("no element");
        }
        this.num_nodes -= 1;
        ListNode<Fraction> nextNode = current.getNext();
        current.setNext(nextNode.getNext());
        return nextNode.getElement();
    }

    // @Override.getElement()
    public void print() {
        ListNode<Fraction> current = head;

        for (int i = 0; i < num_nodes; i++) {
            System.out.println(current.getElement());
            current = current.getNext();
        }
    }

    public ListNode<Fraction> indexOf(int index) {
        int i = 0;
        ListNode<Fraction> current = head;
        while (i != index) {
            current = current.getNext();
            i += 1;
        }
        return current;
    }

    public void simplify() {
        ListNode<Fraction> current = head;
        for (int i = 0; i < num_nodes; i++) {
            current.getElement().simplify();
            current = current.getNext();
        }
    }

    public Fraction sumAll() {
        Fraction result = new Fraction();
        ListNode<Fraction> current = head;
        for (int i = 0; i < num_nodes; i++) {
            result = result.add(current.getElement());
            current = current.getNext();
        }
        return result;
    }

    public void showAllGreaterThanOne() {
        ListNode<Fraction> current = head;
        for (int i = 0; i < num_nodes; i++) {
            if (current.getElement().isGreaterThanOne()) {
                System.out.println(current.getElement());
            }
            current = current.getNext();
        }
    }

    public void sort() {
        // ListNode<Fraction> current = head;
        // ListNode<Fraction> beside = current.getNext();

        // while (current.getNext() != null) {

        // while (beside.getNext() != null) {
        // if()
        // beside = beside.getNext();
        // }
        // current = current.getNext();
        // }

        ListNode<Fraction> current = head;
        for (int i = 0; i < num_nodes - 1; i++) {
            ListNode<Fraction> currentNext = current;
            for (int j = i + 1; j < num_nodes; j++) {
                currentNext = currentNext.getNext();
                if (current.getElement().isGreater(currentNext.getElement())) {
                    Fraction tempElement = currentNext.getElement();
                    currentNext.setElement(current.getElement());
                    current.setElement(tempElement);
                }
            }
            current = current.getNext();
        }

        // ListNode<Fraction> currentI = this.indexOf(0);
        // ListNode<Fraction> preI = this.indexOf(0);
        // ListNode<Fraction> currentJ = this.indexOf(1);
        // for (int i = 0; i < num_nodes - 1; i++) {
        // for (int j = 1; j < num_nodes; j++) {
        // if (currentI.getElement().isGreater(currentJ.getElement())) {
        // // swap
        // if (preI == currentI) {
        // ListNode<Fraction> nextJ = currentJ.getNext();
        // currentI.setNext(nextJ);
        // currentJ.setNext(currentI);
        // } else if (currentJ.getNext() == null) {
        // preI.setNext(currentJ);
        // currentJ.setNext(currentI);
        // currentI.setNext(null);
        // } else {
        // ListNode<Fraction> nextJ = currentJ.getNext();
        // preI.setNext(currentJ);
        // currentJ.setNext(currentI);
        // currentI.setNext(nextJ);
        // }
        // }
        // currentJ = this.indexOf(j);

        // }
        // preI = currentI;
        // currentI = currentI.this.indexOf(i);
        // }
    }
}
