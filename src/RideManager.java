package src;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import rider.RideManagerActions;
import strategy.DriverFindStrategy;
import strategyImpl.NearestDriverStrategy;

public class RideManager implements RideManagerActions {
    private static RideManager rideManager;

    List<VehicleDriver> drivers = new ArrayList<>();

    private RideManager(){

    }

    public static RideManager getInstance()
    {
         if(Objects.isNull(rideManager))
         {
              synchronized (RideManager.class)
              {
                   if(Objects.isNull(rideManager)){
                        rideManager = new RideManager();
                   }
              }
         }
         return rideManager;
    }

    @Override
    public void addDriver(VehicleDriver driver) {
        drivers.add(driver);
    }

    @Override
    public void bookRide(Ride ride) {
       VehicleDriver driver = findDriver(new NearestDriverStrategy(),ride.getPickUpLocation(),drivers);
       ride.setDriver(driver);
        System.out.println(" " +
                "Ride is Booked With " + driver.getUserName());

        driver.notify("New Ride Requested");
    }
    
    @Override
    public void completeRide(String rideId) {
        System.out.println(rideId + " is completed ");
    }
    
    public VehicleDriver findDriver(DriverFindStrategy strategy, Location pickupLocation , List<VehicleDriver> drivers)
    {
         return strategy.findDriver(pickupLocation,drivers);
    }
}