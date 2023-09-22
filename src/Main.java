public class Main {
    public static void main(String[] args) {

        // Car instance
        Car car1 = new Car();
        car1.startEngine();
        car1.accelerate();
        car1.brake();
        car1.turnOffEngine();

        // FlyingCar instance
        FlyingCar flyingCar1 = new FlyingCar();
        FlyingCar flyingCar2 = new FlyingCar();
        flyingCar1.startEngine();
        flyingCar1.accelerate();
        flyingCar1.takeOff();
        flyingCar1.changeHeight();
        flyingCar1.land();
        flyingCar1.brake();
        flyingCar1.turnOffEngine();

        Airport airport1 = new Airport("Schiphol", "Amsterdam");

        airport1.addFlyingVehicles(flyingCar1);
        airport1.addFlyingVehicles(flyingCar2);
        System.out.println(airport1.getLocation());
        // airport1.addFlyingVehicles(car1); - Error.
    }
}
