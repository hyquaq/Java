public class Equals {
    private int id;

    public Equals(int id) {
        this.id = id;
    }

    public Equals() {

    }

    public boolean equals(Equals it) {
        // return this.id == ((Equal) it).id;
        return this.id == it.id;
    }
}