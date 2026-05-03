package oops.vehiclestore;

public class Bike extends TwoWheeler {
    public Bike(String brand, String model, String color, String fuelType,
                String engine, String mileage, double price) {
        setBrand(brand);
        setModel(model);
        setColor(color);
        setFuelType(fuelType);
        setEngine(engine);
        setMileage(mileage);
        setPrice(price);
    }
}