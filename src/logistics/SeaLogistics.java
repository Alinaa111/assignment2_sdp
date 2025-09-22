package logistics;

public class SeaLogistics extends Logistics {
    // extended method of concrete class and its usage
    public Transport createTransport() {
        return new Ship();
    }
}
