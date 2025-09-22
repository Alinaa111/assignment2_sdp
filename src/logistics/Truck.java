package logistics;

public class Truck implements Transport{
    // usage of implemented method
    @Override
    public void deliver() {
        System.out.println("Delivering by land");
    }
}
