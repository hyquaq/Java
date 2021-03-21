public class NhanVien {
    private String ten;
    private String id;
    private Address diaChi;

    public NhanVien(String ten, String id, Address diaChi) {
        this.ten = ten;
        this.id = id;
        this.diaChi = diaChi;
    }

    public NhanVien() {

    }

    public String getTen() {
        return this.ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDiaChi(Address diaChi) {
        this.diaChi = diaChi;
    }

    public Address getDiaChi() {
        return this.diaChi;
    }

    public String toString() {
        String result = "ten: " + this.ten + "\n";
        result += "id: " + this.id + "\n";
        result += this.diaChi.toString();
        return result;
    }
}