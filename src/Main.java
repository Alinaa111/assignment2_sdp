import logistics.Logistics;
import logistics.RoadLogistics;
import logistics.SeaLogistics;

public class Main {
    public static void main(String[] args) {
        Logistics logistics = new RoadLogistics();
        logistics.planDelivery();

        Logistics logistics2 = new SeaLogistics();
        logistics2.planDelivery();
    }
}