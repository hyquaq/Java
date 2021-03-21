public class Address {
    String thanhPho, phuong, quan, duong, soNha;

    public Address() {

    }

    public Address(String thanhPho, String phuong, String quan, String duong, String soNha) {
        this.thanhPho = thanhPho;
        this.phuong = phuong;
        this.quan = quan;
        this.duong = duong;
        this.soNha = soNha;
    }

    public String getThanhPho() {
        return thanhPho;
    }

    public String getQuan() {
        return quan;
    }

    public String getPhuong() {
        return phuong;
    }

    public String getDuong() {
        return duong;
    }

    public String getSoNha() {
        return soNha;
    }

    public void setThanhPho(String thanhPho) {
        this.thanhPho = thanhPho;
    }

    public void setPhuong(String phuong) {
        this.phuong = phuong;
    }

    public void setQuan(String quan) {
        this.quan = quan;
    }

    public void setDuong(String duong) {
        this.duong = duong;
    }

    public void setSoNha(String soNha) {
        this.soNha = soNha;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        String result = "thanh pho: " + this.thanhPho + "\nphuong: " + this.phuong + "\nquan: " + this.quan
                + "\nduong: " + this.duong + "\nso nha: " + this.soNha;
        return result;
    }
}
