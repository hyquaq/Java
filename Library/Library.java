public class Library {
    private String maTaiLieu, nhaSanXuat;
    private int soBan;

    public Library() {

    }

    public Library(String maTaiLieu, String nhaSanXuat, int soBan) {
        this.maTaiLieu = maTaiLieu;
        this.nhaSanXuat = nhaSanXuat;
        this.soBan = soBan;
    }

    public String getMaTaiLieu() {
        return maTaiLieu;
    }

    public void setMaTaiLieu(String maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }
}