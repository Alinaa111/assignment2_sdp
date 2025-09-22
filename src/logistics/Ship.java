package logistics;

public class Ship implements Transport{
    // usage of implemented method
    @Override
    public void deliver() {
        System.out.println("Delivering by sea");
    }
}
