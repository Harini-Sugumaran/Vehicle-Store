package oops.vehiclestore;

import java.util.List;

public class CustomerService {

    public static void showAllVehicles(List<Vehicle> vehicles) {
        for (Vehicle v : vehicles) {
            System.out.println("Brand: " + v.getBrand());
            System.out.println("Model: " + v.getModel());
            System.out.println("Color: " + v.getColor());
            System.out.println("Fuel Type: " + v.getFuelType());
            System.out.println("Engine: " + v.getEngine());
            System.out.println("Mileage: " + v.getMileage());
            System.out.println("Seats: " + v.getSeats());
            System.out.println("Wheels: " + v.getWheels());
            System.out.println("Price: ₹" + v.getPrice());
            System.out.println("-------------------------");
        }
    }
}