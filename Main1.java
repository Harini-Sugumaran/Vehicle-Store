package oops.vehiclestore;

public class Main1 {

    public static void main(String[] args) {
        VehicleInventory inventory = new VehicleInventory();
        ManufacturerService.loadVehicles(inventory);

        MenuService menu = new MenuService(inventory);
        menu.startStore();
    }
}