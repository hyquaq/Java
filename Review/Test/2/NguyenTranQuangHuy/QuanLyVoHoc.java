import java.util.*;

public class QuanLyVoHoc {
    private ArrayList<VoHoc> danhSachVoHoc = new ArrayList<VoHoc>();
    private int soLuong;

    public QuanLyVoHoc() {
        this.soLuong = 0;
    }

    public QuanLyVoHoc(int soLuong) {
        this.soLuong = soLuong;
    }

    public QuanLyVoHoc(ArrayList<VoHoc> list, int soLuong) {
        this.danhSachVoHoc.addAll(list);
        this.soLuong = soLuong;
    }

    public ArrayList<VoHoc> getDanhSachVoHoc() {
        return this.danhSachVoHoc;
    }

    public void setDanhSachVoHoc(ArrayList<VoHoc> danhSachVoHoc) {
        this.danhSachVoHoc = danhSachVoHoc;
    }

    public int getSoLuong() {
        return this.soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public ArrayList<VoHoc> getVoHocByTuoi(int tuoi) {
        ArrayList<VoHoc> result = new ArrayList<VoHoc>();
        for (VoHoc vo : danhSachVoHoc) {
            if (vo.getTuoi() == tuoi) {
                result.add(vo);
            }
        }

        return result;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < soLuong; i++) {
            System.out.println("Chinh Dao(c) Ta Dao(t)");
            String choose = sc.nextLine();
            VoHoc tmp;
            if (choose.equalsIgnoreCase("c")) {
                System.out.println("nhap thong tin 'Chinh dao'");
                System.out.print("ten loai vo: ");
                String tenLoaiVo = sc.nextLine();
                System.out.print("nguoi sang lap: ");
                String nguoiSangLap = sc.nextLine();
                System.out.print("nam ra duoi: ");
                int namRaDoi = sc.nextInt();
                sc.nextLine();
                System.out.print("dac diem loai vo: ");
                String dacDiemLoaiVo = sc.nextLine();
                tmp = new VoChinhDao(tenLoaiVo, nguoiSangLap, namRaDoi, dacDiemLoaiVo);
                danhSachVoHoc.add(tmp);
            } else if (choose.equalsIgnoreCase("t")) {
                System.out.println("nhap thong tin 'Ta dao'");
                System.out.print("ten loai vo: ");
                String tenLoaiVo = sc.nextLine();
                System.out.print("nguoi sang lap: ");
                String nguoiSangLap = sc.nextLine();
                System.out.print("nam ra duoi: ");
                int namRaDoi = sc.nextInt();
                sc.nextLine();
                System.out.print("dac diem loai vo: ");
                String dacDiemLoaiVo = sc.nextLine();
                tmp = new VoTaDao(tenLoaiVo, nguoiSangLap, namRaDoi, dacDiemLoaiVo);
                danhSachVoHoc.add(tmp);
            } else {
                System.out.println("nhap sai roi!");
                i--;
            }
        }
    }

    public void output() {
        for (VoHoc vo : danhSachVoHoc) {
            System.out.println(vo);
        }
    }
}