package oops.vehiclestore;

public class Car extends FourWheeler {
    public Car(String brand, String model, String color, String fuelType,
               String engine, String mileage, int seats, double price) {
        setBrand(brand);
        setModel(model);
        setColor(color);
        setFuelType(fuelType);
        setEngine(engine);
        setMileage(mileage);
        setSeats(seats);
        setPrice(price);
    }
}