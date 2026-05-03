package oops.vehiclestore;

public class Vehicle {
    private String brand;
    private String model;
    private String color;
    private String fuelType;
    private String engine;
    private String mileage;
    private int seats;
    private int wheels;
    private double price;

    public void setBrand(String brand) { 
        this.brand = brand; 
    }
    public String getBrand() { 
        return brand;
    }
    
    public void setModel(String model) { 
        this.model = model; 
    }
    public String getModel() { 
        return model; 
    }

    public void setColor(String color) { 
        this.color = color; 
    }
    public String getColor() { 
        return color; 
    }

    public void setFuelType(String fuelType) { 
        this.fuelType = fuelType; 
    }
    public String getFuelType() { 
        return fuelType; 
    }

    public void setEngine(String engine) { 
        this.engine = engine; 
    }
    public String getEngine() { 
        return engine; 
    }

    public void setMileage(String mileage) { 
        this.mileage = mileage; 
    }
    public String getMileage() { 
        return mileage; 
    }

    public void setSeats(int seats) { 
        this.seats = seats; 
    }
    public int getSeats() { 
        return seats; 
    }

    public void setWheels(int wheels) { 
        this.wheels = wheels; 
    }
    public int getWheels() { 
        return wheels; 
    }
    
    public void setPrice(double price) { 
        this.price = price; 
    }
    public double getPrice() { 
        return price; 
    }
}