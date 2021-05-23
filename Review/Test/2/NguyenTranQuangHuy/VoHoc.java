public abstract class VoHoc {
    private String tenLoaiVo = "", nguoiSangLap = "", dacDiemLoaiVo = "";
    private int namRaDoi = 2021;

    public VoHoc() {

    }

    public VoHoc(String tenLoaiVo, String nguoiSangLap, int namRaDoi, String dacDiemLoaiVo) {
        this.tenLoaiVo = tenLoaiVo;
        this.nguoiSangLap = nguoiSangLap;
        this.namRaDoi = namRaDoi;
        this.dacDiemLoaiVo = dacDiemLoaiVo;
    }

    public String getTenLoaiVo() {
        return this.tenLoaiVo;
    }

    public void setTenLoaiVo(String tenLoaiVo) {
        this.tenLoaiVo = tenLoaiVo;
    }

    public String getNguoiSangLap() {
        return this.nguoiSangLap;
    }

    public void setNguoiSangLap(String nguoiSangLap) {
        this.nguoiSangLap = nguoiSangLap;
    }

    public int getNamRaDoi() {
        return this.namRaDoi;
    }

    public void setNamRaDoi(int namRaDoi) {
        this.namRaDoi = namRaDoi;
    }

    public String getDacDiemLoaiVo() {
        return this.dacDiemLoaiVo;
    }

    public void setDacDiemLoaiVo(String dacDiemLoaiVo) {
        this.dacDiemLoaiVo = dacDiemLoaiVo;
    }

    public abstract int getTuoi();

    @Override
    public String toString() {
        return String.format("Vo[ ten: %s, nguoi sang lap: %s, nam ra doi: %d, dac diem loai vo: %s", this.tenLoaiVo,
                this.nguoiSangLap, this.namRaDoi, this.dacDiemLoaiVo);
    }
}
