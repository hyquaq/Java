public class Book extends Library {
    private String tenTacGia;
    private int soTrang;

    public Book() {
    }

    public Book(String maTaiLieu, String nhaSanXuat, int soBan, String tenTacGia, int soTrang) {
        super(maTaiLieu, nhaSanXuat, soBan);
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }

    public String toString() {
        return tenTacGia + Integer.toString(soTrang);
    }
}
