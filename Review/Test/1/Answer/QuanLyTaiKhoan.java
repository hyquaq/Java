import java.util.*;
import java.io.*;

public class QuanLyTaiKhoan {
    private ArrayList<TaiKhoan> tkList;

    public QuanLyTaiKhoan(String path) {
        this.tkList = docDanhSachTaiKhoan(path);
    }

    public ArrayList<TaiKhoan> docDanhSachTaiKhoan(String path) {
        ArrayList<TaiKhoan> temp = new ArrayList<TaiKhoan>();
        // code here
        File fi = new File(path);
        Scanner sc;
        try {
            sc = new Scanner(fi);
            while (sc.hasNextLine()) {
                String[] info = sc.nextLine().split(",");
                if (info.length == 3) {
                    TaiKhoan taiKhoan = new TaiKhoan(info[0], info[1], info[2]);
                    temp.add(taiKhoan);
                } else {
                    TaiKhoanVIP taiKhoan = new TaiKhoanVIP(info[0], info[1], info[2], Integer.valueOf(info[3]));
                    temp.add(taiKhoan);
                }
            }
            sc.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return temp;
    }

    public TaiKhoan dangNhap(String tenDangNhap, String matKhau) {
        // code here
        for (TaiKhoan tk : this.tkList) {
            if (tk.getTenDangNhap().equals(tenDangNhap) && tk.kiemTraDangNhap(matKhau)) {
                return tk;
            }
        }
        return null;
    }

}