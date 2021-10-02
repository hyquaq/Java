import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<VoHoc> danhSach = new ArrayList<VoHoc>();
        VoChinhDao chinhDao = new VoChinhDao("Muay Thai", "Thai Lan", 1500, "manh");
        danhSach.add(chinhDao);
        chinhDao = new VoChinhDao("KickBoxing", "Ha Lan", 1950, "dam, da, moc");
        danhSach.add(chinhDao);
        chinhDao = new VoChinhDao("Vovinam", "Nguyen Loc", 1938, "phan doan");
        danhSach.add(chinhDao);

        VoTaDao taDao = new VoTaDao("That Thuong Quyen", "Kim Mao Su Vuong", 1555, "manh");
        danhSach.add(taDao);
        taDao = new VoTaDao("Song thu ho bac", "Lao Ngoan Dong", 1550, "hai huoc");
        danhSach.add(taDao);

        // QuanLyVoHoc qlVoHoc = new QuanLyVoHoc(danhSach, danhSach.size());
        QuanLyVoHoc qlVoHoc = new QuanLyVoHoc(2);
        qlVoHoc.input();

        qlVoHoc.output();

        int tuoi = 71;
        System.out.println("mon vo co so tuoi la " + tuoi);
        for (VoHoc vo : qlVoHoc.getVoHocByTuoi(tuoi)) {
            System.out.println(vo);
        }
    }
}