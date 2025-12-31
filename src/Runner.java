package src;

public class Runner {
    public static void main(String[] args) {
        RideManager rideManager = RideManager.getInstance();

        Rider rider = (Rider) UserFactory.createUser("RIDER","r1","Avinash",new Location(10, 20));
        VehicleDriver driver = (VehicleDriver) UserFactory.createUser("DRIVER","d1","driver1",new Location(2, 3));
        VehicleDriver driver1 = (VehicleDriver) UserFactory.createUser("DRIVER","d2","driver2",new Location(5, 6));

        rideManager.addDriver(driver);
        rideManager.addDriver(driver1);

        Ride ride = new Ride.Builder().withRider(rider).withPickup(new Location(10,10)).withDrop(new Location(20,20)).build();

        rideManager.bookRide(ride);

        driver1.acceptRide(ride);

        rideManager.completeRide(ride.getRideId());

        rider.rateDriver(driver1,3);
    }
}
