public class ResizableCircle extends Circle implements Resizable {
    public ResizableCircle() {
        super();
    }

    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public void resize(int percent) {
        this.setRadius(super.getRadius() * percent);
    }
}
