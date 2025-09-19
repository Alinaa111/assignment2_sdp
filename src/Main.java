import gui.Checkbox;
import gui.GUIFactory;
import gui.MacFactory;
import logistics.Logistics;
import logistics.RoadLogistics;
import logistics.SeaLogistics;

public class Main {
    public static void main(String[] args) {
        Logistics logistics = new RoadLogistics();
        logistics.planDelivery();

        Logistics logistics2 = new SeaLogistics();
        logistics2.planDelivery();

        GUIFactory factory = new MacFactory();
        Checkbox checkbox = factory.createCheckbox();
        checkbox.paint();
    }
}