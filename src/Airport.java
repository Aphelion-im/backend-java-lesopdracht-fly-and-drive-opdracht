import java.util.ArrayList;

public class Airport {

    private String nameOfAirport;
    private String location;
    private static int numberOfFlyingVehicles;
    ArrayList<Flyable> flyingVehiclesList = new ArrayList<>(); // Dus mogelijk om Interfaces toe te voegen aan ArrayList!

    public Airport(String nameOfAirport, String location) {
        this.nameOfAirport = nameOfAirport;
        this.location = location;
    }

    public void addFlyingVehicles(Flyable flyingVehicle) {
        System.out.println("Flying vehicle has been added to " + this.nameOfAirport + "!");
        this.flyingVehiclesList.add(flyingVehicle);
        numberOfFlyingVehicles++;
        System.out.println("This Airport now has " + numberOfFlyingVehicles + " flying vehicle");
    }


}
