public class Cabbage extends Vegetable {

    private String type;
    private double weight;

    @Override
    public String getInfo() {
        return type + " " + weight;
    }
}