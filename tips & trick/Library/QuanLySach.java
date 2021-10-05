import java.util.*;

public class QuanLySach {
    private List<Library> ls = new ArrayList<Library>();

    public void themMoi(Book newBook) {
        ls.add(newBook);
        System.out.println(ls.size());
    }

    public void xoaDuLieu(Book oldBook) {
        for (int i = 0; i < ls.size(); i++) {
            if (ls.get(i).getMaTaiLieu() == oldBook.getMaTaiLieu()) {
                ls.remove(i);
                System.out.println("xoa thanh cong");
                return;
            }
        }
        System.out.println("xoa that bai");
    }

    public void show() {
        if (ls.isEmpty()) {
            System.out.println("is empty");
            return;
        }
        for (Library i : ls) {
            System.out.println(i.toString());
        }
    }

    public void thoat() {
        System.out.println("bye");
    }
}
