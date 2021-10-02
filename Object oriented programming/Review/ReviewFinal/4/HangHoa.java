public class HangHoa {

    private String id = "", name = "";

    HangHoa(String id, String name) {
        this.id = "HH001";
        this.name = name;
        if (id.length() == 5 && id.substring(0, 2).equals("HH")) {
            try {
                String number = id.substring(2, id.length());
                Integer tmp = Integer.valueOf(number);
                this.id = id;
            } catch (Exception e) {
            }
        }
    }

    @Override
    public String toString() {
        return String.format("%s - %s", id, name);
    }

    // public static void main(String[] args) {
    // HangHoa x = new HangHoa("HH0a3", "huy");
    // System.out.println(x);
    // }
}