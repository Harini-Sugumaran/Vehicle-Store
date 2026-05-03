package oops.vehiclestore;

public class ManufacturerService {

    public static void loadVehicles(VehicleInventory inventory) {
       
        inventory.addVehicle(new Bike("Yamaha", "R15", "Black", "Petrol", "155cc", "40 kmpl", 250000));
        inventory.addVehicle(new Bike("Yamaha", "R15", "Silver", "Petrol", "155cc", "40 kmpl", 250000));
        inventory.addVehicle(new Bike("Yamaha", "R15", "Blue", "Petrol", "155cc", "40 kmpl", 250000));   
        inventory.addVehicle(new Bike("Yamaha", "MT15", "Black", "Petrol", "155cc", "38 kmpl", 260000));
        inventory.addVehicle(new Bike("Yamaha", "MT15", "Blue", "Petrol", "155cc", "38 kmpl", 260000));
        inventory.addVehicle(new Bike("Yamaha", "MT15", "Silver", "Petrol", "155cc", "38 kmpl", 260000));
        inventory.addVehicle(new Bike("Yamaha", "R3", "Glossy Black", "Petrol", "299cc", "38 kmpl", 400000));
        inventory.addVehicle(new Bike("Yamaha", "R3", "Racing Blue", "Petrol", "299cc", "38 kmpl", 400000));
        inventory.addVehicle(new Bike("Yamaha", "R6", "Glossy Black", "Petrol", "600cc", "38 kmpl", 4500000));
        inventory.addVehicle(new Bike("Yamaha", "R6", "Racing Blue", "Petrol", "600cc", "38 kmpl", 4500000));
        inventory.addVehicle(new Bike("Royal Enfield", "Classic 350", "Black", "Petrol", "350cc", "35 kmpl", 300000));
        inventory.addVehicle(new Bike("Royal Enfield", "Classic 550", "Blue", "Petrol", "550cc", "35 kmpl", 350000));
        inventory.addVehicle(new Bike("Royal Enfield", "Classic 550", "Red", "Petrol", "550cc", "35 kmpl", 350000));
        inventory.addVehicle(new Bike("Royal Enfield", "GT650", "Glossy Silver", "Petrol", "650cc", "35 kmpl", 450000));
        

        inventory.addVehicle(new Scooty("Honda", "Activa", "Red", "Petrol", "110cc", "50 kmpl", 75000));
        inventory.addVehicle(new Scooty("Honda", "Activa", "Blue", "Petrol", "110cc", "50 kmpl", 75000));
        inventory.addVehicle(new Scooty("Honda", "Dio", "Red", "Petrol", "110cc", "48 kmpl", 78000));
        inventory.addVehicle(new Scooty("Honda", "Dio", "Black", "Petrol", "110cc", "48 kmpl", 78000));
        inventory.addVehicle(new Scooty("Honda", "Grazia", "Black", "Petrol", "125cc", "45 kmpl", 88000));
        inventory.addVehicle(new Scooty("Honda", "Grazia", "White", "Petrol", "125cc", "45 kmpl", 88000));
        inventory.addVehicle(new Scooty("TVS", "Ntorq 125", "Red", "Petrol", "125cc", "42 kmpl", 98000));
        inventory.addVehicle(new Scooty("TVS", "Ntorq 125", "Blue", "Petrol", "125cc", "42 kmpl", 98000));
        inventory.addVehicle(new Scooty("TVS", "Jupiter", "White", "Petrol", "110cc", "48 kmpl", 72000));
        inventory.addVehicle(new Scooty("TVS", "Jupiter", "Red", "Petrol", "110cc", "48 kmpl", 72000));
        inventory.addVehicle(new Scooty("TVS", "Scooty Pep+", "Pink", "Petrol", "90cc", "55 kmpl", 65000));
        inventory.addVehicle(new Scooty("TVS", "Scooty Pep+", "White", "Petrol", "90cc", "55 kmpl", 65000));

        inventory.addVehicle(new Car("Hyundai", "Creta", "White", "Petrol", "1500cc", "18 kmpl", 5, 1000000));
        inventory.addVehicle(new Car("Hyundai", "Creta", "Grey", "Petrol", "1500cc", "18 kmpl", 5, 1000000));
        inventory.addVehicle(new Car("Hyundai", "Creta", "Black", "Petrol", "1500cc", "18 kmpl", 5, 1000000));
        inventory.addVehicle(new Car("Hyundai", "i20", "White", "Petrol", "1200cc", "20 kmpl", 5, 800000));
        inventory.addVehicle(new Car("Hyundai", "i20", "Grey", "Petrol", "1200cc", "20 kmpl", 5, 800000));
        inventory.addVehicle(new Car("Hyundai", "i20", "Red", "Petrol", "1200cc", "20 kmpl", 5, 800000)); 
        inventory.addVehicle(new Car("Maruti", "Swift", "Red", "Petrol", "1200cc", "22 kmpl", 5, 600000));
        inventory.addVehicle(new Car("Maruti", "Swift", "Black", "Petrol", "1200cc", "22 kmpl", 5, 600000));
        inventory.addVehicle(new Car("Maruti", "Swift", "White", "Petrol", "1200cc", "22 kmpl", 5, 600000));
        inventory.addVehicle(new Car("Maruti", "Baleno", "Red", "Petrol", "1200cc", "23 kmpl", 5, 750000));
        inventory.addVehicle(new Car("Maruti", "Baleno", "Black", "Petrol", "1200cc", "23 kmpl", 5, 750000));
        inventory.addVehicle(new Car("Maruti", "Baleno", "White", "Petrol", "1200cc", "23 kmpl", 5, 750000));
        inventory.addVehicle(new Car("Tata", "Nexon", "Blue", "Petrol", "1500cc", "17 kmpl", 5, 950000));
        inventory.addVehicle(new Car("Tata", "Nexon", "Black", "Petrol", "1500cc", "17 kmpl", 5, 950000));
        inventory.addVehicle(new Car("Tata", "Nexon", "Grey", "Petrol", "1500cc", "17 kmpl", 5, 950000));

        inventory.addVehicle(new Bus("Ashok Leyland", "City Bus", "Yellow", "Diesel", "5000cc", "5 kmpl", 40, 3000000));
        inventory.addVehicle(new Bus("Ashok Leyland", "City Bus", "Blue", "Diesel", "5000cc", "5 kmpl", 40, 3000000));
        inventory.addVehicle(new Bus("Ashok Leyland", "School Bus", "Yellow", "Diesel", "4500cc", "7 kmpl", 50, 2800000));
        inventory.addVehicle(new Bus("Ashok Leyland", "School Bus", "Red", "Diesel", "4500cc", "7 kmpl", 50, 2800000));
        inventory.addVehicle(new Bus("Tata", "Star Bus", "White", "Diesel", "5200cc", "6 kmpl", 40, 3500000));
        inventory.addVehicle(new Bus("Tata", "Star Bus", "Red", "Diesel", "5200cc", "6 kmpl", 40, 3500000));
        inventory.addVehicle(new Bus("Tata", "Luxury Bus", "Black", "Diesel", "6000cc", "4 kmpl", 30, 5000000));
        inventory.addVehicle(new Bus("Tata", "Luxury Bus", "White", "Diesel", "6000cc", "4 kmpl", 30, 5000000));

        inventory.addVehicle(new Lorry("Tata", "Lorry 1212", "Blue", "Diesel", "4000cc", "4 kmpl", 3, 2500000));
        inventory.addVehicle(new Lorry("Tata", "Lorry 1212", "Yellow", "Diesel", "4000cc", "4 kmpl", 3, 2500000));
        inventory.addVehicle(new Lorry("Tata", "Ultra", "Yellow", "Diesel", "4500cc", "6 kmpl", 3, 3000000));
        inventory.addVehicle(new Lorry("Tata", "Ultra", "White", "Diesel", "4500cc", "6 kmpl", 3, 3000000));
        inventory.addVehicle(new Lorry("Eicher", "Pro 2055", "Green", "Diesel", "4200cc", "6 kmpl", 3, 2700000));
        inventory.addVehicle(new Lorry("Eicher", "Pro 2055", "Yellow", "Diesel", "4200cc", "6 kmpl", 3, 2700000));
        inventory.addVehicle(new Lorry("Eicher", "Cargo", "White", "Diesel", "5000cc", "4 kmpl", 2, 3500000));
        inventory.addVehicle(new Lorry("Eicher", "Cargo", "Brown", "Diesel", "5000cc", "4 kmpl", 2, 3500000));
    }
}