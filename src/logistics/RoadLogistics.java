package logistics;

public class RoadLogistics extends Logistics {
    // extended method of concrete class and its usage
    public Transport createTransport() {
        return new Truck();
    }
}
