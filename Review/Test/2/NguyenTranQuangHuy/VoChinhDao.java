public class VoChinhDao extends VoHoc {

    public VoChinhDao() {
        super();
    }

    public VoChinhDao(String tenLoaiVo, String nguoiSangLap, int namRaDoi, String dacDiemLoaiVo) {
        super(tenLoaiVo, nguoiSangLap, namRaDoi, dacDiemLoaiVo);
    }

    @Override
    public int getTuoi() {
        return 2021 - this.getNamRaDoi();
    }

    @Override
    public String toString() {
        return "Vo Chinh Dao" + super.toString().substring(2) + " ]";
    }
}