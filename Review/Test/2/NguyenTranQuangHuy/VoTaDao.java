public class VoTaDao extends VoHoc {

    public VoTaDao() {
        super();
    }

    public VoTaDao(String tenLoaiVo, String nguoiSangLap, int namRaDoi, String dacDiemLoaiVo) {
        super(tenLoaiVo, nguoiSangLap, namRaDoi, dacDiemLoaiVo);
    }

    @Override
    public int getTuoi() {
        return 2021 - this.getNamRaDoi() - 3;
    }

    @Override
    public String toString() {
        return "Vo Ta Dao" + super.toString().substring(2) + " ]";
    }
}