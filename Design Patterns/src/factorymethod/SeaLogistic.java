package factorymethod;

public class SeaLogistic implements Logistics {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
