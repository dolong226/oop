package factorymethod;

public class RoadLogistic implements Logistics {
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
