public class TapChi extends Library {
    private int soPhatHanh, thangPhatHanh;

    public TapChi() {
    }

    public TapChi(String maTaiLieu, String nhaSanXuat, String soBan, int soPhatHanh, int thangPhatHanh) {
        super(maTaiLieu, nhaSanXuat, soBan);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public String toString() {
        return Integet.toString(soPhatHanh) + Integer.toString(thangPhatHanh);
    }
}
