package oops.vehiclestore;

import java.util.List;
import java.util.ArrayList;

public class VehicleInventory {
    private List<Vehicle> vehicles;

    public VehicleInventory() {
        vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle v) {
        vehicles.add(v);
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }
}