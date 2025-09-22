package logistics;

public abstract class Logistics {
    // Abstract methods
    public abstract Transport createTransport();
    public void planDelivery() {
        Transport t = createTransport();
        t.deliver();
    }
}
