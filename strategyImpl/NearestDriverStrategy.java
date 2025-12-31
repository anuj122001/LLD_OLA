package strategyImpl;

import java.util.List;

import src.Location;
import src.VehicleDriver;
import strategy.DriverFindStrategy;

public class NearestDriverStrategy implements DriverFindStrategy {

    @Override
    public VehicleDriver findDriver(Location pickup, List<VehicleDriver>drivers)
   {
        VehicleDriver driver = null;
        double minDist = Double.MAX_VALUE;
        for(VehicleDriver d : drivers)
        {
             double dis = d.getLocation().getDistance(pickup);
             if(dis < minDist){
                  minDist = dis;
                  driver = d;
             }
        }

        return driver;
   }

}
