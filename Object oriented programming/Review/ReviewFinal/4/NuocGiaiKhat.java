public class NuocGiaiKhat extends HangHoa {
    private String donViTinh;
    private int soLuong;
    private double donGia;

    public NuocGiaiKhat(String id, String name, String donViTinh, int soLuong, double donGia) {
        super(id, name);
        this.donViTinh = "ket";
        this.soLuong = soLuong;
        this.donGia = donGia;
        if (donViTinh.equals("thung") || donViTinh.equals("chai") || donViTinh.equals("lon")) {
            this.donViTinh = donViTinh;
        }
    }

    @Override
    public String toString() {
        return String.format("%s - %s - %f", super.toString(), donViTinh, thanhTien());
    }

    public double thanhTien() {
        if (donViTinh.equals("ket") || donViTinh.equals("thung")) {
            return soLuong * donGia;
        }

        if (donViTinh.equals("chai")) {
            return soLuong * (donGia / 20);
        }

        return soLuong * (donGia / 24);
    }

    public double tongTien(double base) {
        return thanhTien() * base;
    }
}