public class XeMay {
    private String ma;
    private String ten;
    private String nsx;
    private int sl;
    private double tien;

    public XeMay() {

    }
    public XeMay(String ma, String ten, String nsx, int sl, double tien) {
        this.ma = ma;
        this.ten = ten;
        this.nsx = nsx;
        this.sl = sl;
        this.tien = tien;
    }

    public XeMay saochep() {
        return this;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getMa() {
        return this.ma;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
    public String getTen() {
        return this.ten;
    }
    public void setNsx(String nsx) {
        this.nsx = nsx;
    }
    public String getNsx() {
        return this.nsx;
    }
    public void setSl(int sl) {
        this.sl = sl;
    }
    public int getSl() {
        return this.sl;
    }
    public void setTien(double tien) {
        this.tien = tien;
    }

    public double getTien() {
        return this.tien;
    }

    public double thanhTien() {
        return sl * tien;
    }

    public double giamGiamTien() {
        if (this.sl >= 5) {
            return 0.05;
        }
        if (this.sl >= 3) {
            return 0.03;
        }
        return 0;
    }

    public double tongTien() {
        return this.thanhTien() - this.thanhTien() * this.giamGiamTien();
    }

    public String toString() {
        int index = ma.length() - 1;
        while (ma.charAt(index) >= '0' && ma.charAt(index) <= '9'){
            index--;
        }
        String id = ma.substring(index + 1,ma.length());

        String name = ten.substring(0, ten.length() - (ma.length() - index));
        return "XeMay[" + id + ", " + name + ", " + this.nsx + ", " + this.sl + ", " + this.tien + ", " + this.thanhTien() + ", " + this.giamGiamTien() * this.thanhTien() + ", " + this.tongTien() + "]";
    }
}