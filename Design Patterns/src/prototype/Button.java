package prototype;

public class Button implements Prototype {
    private double x;
    private double y;
    public Button(Button prototype) {
        x = prototype.x;
        y = prototype.y;
    }

    @Override
    public Button clone() {
        return new Button(this);
    }
}
