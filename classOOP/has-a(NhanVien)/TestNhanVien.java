public class TestNhanVien {
    public static void main(String[] args) {
        Address diaChi = new Address("hcm", "7", "7", "le huu tho", "L0514");
        NhanVien nhanVien1 = new NhanVien("nguyen huy", "52000668", diaChi);

        System.out.println(nhanVien1.toString());
    }
}