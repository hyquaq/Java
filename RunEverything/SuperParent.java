public class SuperParent extends Point {

    public void show() {
        System.out.println("day la lop con");
    }

    public void methods() {
        this.show();
        super.show();
    }
}