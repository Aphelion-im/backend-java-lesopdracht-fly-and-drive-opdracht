import java.util.ArrayList;
import java.util.List;

public class Airport {

    private final String nameOfAirport;
    private final String location;
    private int numberOfFlyingVehicles;
    private final List<Flyable> flyingVehiclesList = new ArrayList<>(); // Dus mogelijk om Interfaces toe te voegen aan ArrayList!

    public Airport(String nameOfAirport, String location) {
        this.nameOfAirport = nameOfAirport;
        this.location = location;
    }

    public void addFlyingVehicles(Flyable flyingVehicle) {
        System.out.println("Flying vehicle has been added to " + this.nameOfAirport + "!");
        this.flyingVehiclesList.add(flyingVehicle);
        numberOfFlyingVehicles++;
        System.out.println(this.nameOfAirport + " now has " + numberOfFlyingVehicles + " flying vehicles");
    }

    public String getNameOfAirport() {
        return nameOfAirport;
    }

    public String getLocation() {
        return location;
    }

    public int getNumberOfFlyingVehicles() {
        return numberOfFlyingVehicles;
    }
}
