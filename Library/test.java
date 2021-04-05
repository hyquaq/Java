public class test {
    public static void main(String[] args) {
        QuanLySach menu = new QuanLySach();

        Book newBook = new Book("01", "tuoi tre", 1, "nguyen huy", 100);
        menu.themMoi(newBook);
        menu.show();
        Book oldBook = new Book("01", "tuoi gia", 1, "nguyen huy", 100);
        menu.xoaDuLieu(oldBook);
        menu.show();
    }
}
