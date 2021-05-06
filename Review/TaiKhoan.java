public class TaiKhoan {
    private String tenDangNhap;
    private String matKhau;
    private String ngayTao;

    public TaiKhoan(String tenDangNhap, String matKhau, String ngayTao) {
        // code here
        this.tenDangNhap = tenDangNhap;
        this.matKhau = matKhau;
        this.ngayTao = ngayTao;
    }

    public boolean doiMatKhau(String matKhauCu, String matKhauMoi) {
        // code here
        if (this.matKhau.equals(matKhauCu)) {
            this.matKhau = matKhauMoi;
            return true;
        }
        return false;
    }

    public boolean kiemTraDangNhap(String matKhau) {
        // code here
        if (this.matKhau.equals(matKhau)) {
            return true;
        }
        return false;
    }

    public String getTenDangNhap() {
        return this.tenDangNhap;
    }

    public String toString() {
        return this.tenDangNhap + " - " + this.matKhau;
    }
}