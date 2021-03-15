public class TestXeMay {
    public static void main(String[] args) {
        //  khoi tao xe may
        XeMay motor = new XeMay("Ex01", "Exciter 01", "yamaha", 10, 10000);
        // in thong tin xe may
        System.out.println(motor.toString());
        // khoi tao lai 1 so thuoc tinh cua xe may
        motor.setSl(5);
        motor.setTien(99999);
        motor.setMa("Rd2020");
        motor.setTen("Raider 2020");
        motor.setNsx("suzuki");
        // in lai cac thuoc tinh vua khoi tao 
        System.out.println("new name: " + motor.getTen());
        System.out.println("price: " + motor.getTien());
        System.out.println("total: " + motor.tongTien());
        // in lai thong tin cua xe may
        System.out.println(motor.toString());
    }
}