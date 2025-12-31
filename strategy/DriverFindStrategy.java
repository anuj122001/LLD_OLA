package strategy;

import java.util.List;

import src.VehicleDriver;

import src.Location;

public interface DriverFindStrategy {
    VehicleDriver findDriver(Location location, List<VehicleDriver>drivers);
}
