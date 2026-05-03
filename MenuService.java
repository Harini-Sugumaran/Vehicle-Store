package oops.vehiclestore;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuService {

    private VehicleInventory inventory;
    private Scanner sc;

    public MenuService(VehicleInventory inventory) {
        this.inventory = inventory;
        this.sc = new Scanner(System.in);
    }

    public void startStore() {
        System.out.println("\n===============================");
        System.out.println("    Sri Shakthi Automobiles");
        System.out.println("===============================\n");
        System.out.println("Welcome to Sri Shakthi Automobiles!!");

        while (true) {
            System.out.println("What do you want to do now??");
            System.out.println("1. Display All Vehicles");
            System.out.println("2. Buy Two Wheelers");
            System.out.println("3. Buy Four Wheelers");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("All the available vehicles in out store!!");
                    showAllByType(null);
                    break;

                case 2:
                    handleTwoWheelers();
                    break;

                case 3:
                    handleFourWheelers();
                    break;

                case 4:
                    System.out.println("Thank you for Reaching us! Visit Again! Have a Good Day!!");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    private void showAllByType(Class type) {

        System.out.println("====================================================================================================");
        System.out.printf("%-15s %-15s %-15s %-10s %-12s %-14s %-10s\n",
                "Brand", "Model", "Color", "Fuel", "Engine", "Mileage", "Price");
        System.out.println("====================================================================================================");

        for (Vehicle v : inventory.getVehicles()) {
            if (type == null) {
                System.out.printf("%-15s %-15s %-15s %-10s %-12s %-14s ₹%-10.2f\n",
                        v.getBrand(),
                        v.getModel(),
                        v.getColor(),
                        v.getFuelType(),
                        v.getEngine(),
                        v.getMileage(),
                        v.getPrice());
            }
            else if (type.isInstance(v)) {
                System.out.printf("%-15s %-15s %-15s %-10s %-12s %-14s ₹%-10.2f\n",
                        v.getBrand(),
                        v.getModel(),
                        v.getColor(),
                        v.getFuelType(),
                        v.getEngine(),
                        v.getMileage(),
                        v.getPrice());
            }
        }

        System.out.println("====================================================================================================");
    }


    private void handleTwoWheelers() {
        System.out.println("\nWhat you want to buy?");
        System.out.println("\n1. Bike");
        System.out.println("2. Scooty");
        System.out.println("3. Display all the Two Wheelers");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {
            processPurchase(Bike.class);
        }
        else if (choice == 2) {
            processPurchase(Scooty.class);
        }
        else if (choice == 3) {
            System.out.println("All the Two Wheeler available in our store!!");
            showAllByType(TwoWheeler.class);
        }
        else {
            System.out.println("Invalid choice!");
        }
    }

    private void handleFourWheelers() {
        System.out.println("\nWhat you want to buy?");
        System.out.println("\n1. Car");
        System.out.println("2. Bus");
        System.out.println("3. Lorry");
        System.out.println("4. Display all the Four Wheelers");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {
            processPurchase(Car.class);
        }
        else if (choice == 2) {
            processPurchase(Bus.class);
        }
        else if (choice == 3) {
            processPurchase(Lorry.class);
        }
        else if (choice == 4) {
            System.out.println("All the Four Wheeler available in our store!!");
            showAllByType(FourWheeler.class);
        }
        else {
            System.out.println("Invalid choice!");
        }
    }

    private void processPurchase(Class vehicleType) {

        List<String> brandList = new ArrayList<>();

        for (Vehicle v : inventory.getVehicles()) {
            if (vehicleType.isInstance(v) &&
                    !brandList.contains(v.getBrand())) {
                brandList.add(v.getBrand());
            }
        }

        System.out.println("\nAvailable Brands in our Store : ");
        for (int i = 0; i < brandList.size(); i++) {
            System.out.println((i + 1) + ". " + brandList.get(i));
        }

        System.out.print("Enter choice: ");
        int brandChoice = sc.nextInt();
        sc.nextLine();

        if (brandChoice < 1 || brandChoice > brandList.size()) {
            System.out.println("Invalid choice!");
            return;
        }

        String selectedBrand = brandList.get(brandChoice - 1);

        List<Vehicle> modelList = new ArrayList<>();

        for (Vehicle v : inventory.getVehicles()) {
            if (vehicleType.isInstance(v) &&
                    v.getBrand().equals(selectedBrand)) {

                boolean exists = false;

                for (Vehicle m : modelList) {
                    if (m.getModel().equals(v.getModel())) {
                        exists = true;
                        break;
                    }
                }

                if (!exists) {
                    modelList.add(v);
                }
            }
        }

        System.out.println("\nAvailable Models:");
        for (int i = 0; i < modelList.size(); i++) {
            System.out.println((i + 1) + ". " + modelList.get(i).getModel());
        }

        System.out.print("Enter choice: ");
        int modelChoice = sc.nextInt();
        sc.nextLine();

        if (modelChoice < 1 || modelChoice > modelList.size()) {
            System.out.println("Invalid choice!");
            return;
        }

        Vehicle selectedModel = modelList.get(modelChoice - 1);

        List<Vehicle> colorList = new ArrayList<>();

        for (Vehicle v : inventory.getVehicles()) {

            if (vehicleType.isInstance(v) &&
                    v.getBrand().equals(selectedBrand) &&
                    v.getModel().equals(selectedModel.getModel())) {

                colorList.add(v);
            }
        }

        System.out.println("\nAvailable Colors:");
        for (int i = 0; i < colorList.size(); i++) {
            System.out.println((i + 1) + ". " + colorList.get(i).getColor());
        }

        System.out.print("Enter choice: ");
        int colorChoice = sc.nextInt();
        sc.nextLine();

        if (colorChoice < 1 || colorChoice > colorList.size()) {
            System.out.println("Invalid choice!");
            return;
        }

        Vehicle chosen = colorList.get(colorChoice - 1);

        System.out.print("\nDo you want to buy this vehicle? (yes/no): ");
        String confirm = sc.nextLine();

        if (!confirm.equals("yes")) {
            System.out.println("---Purchase Cancelled---:(");
            return;
        }

        System.out.println("\n----Selected vehicle details----");
        System.out.println("Brand : " + chosen.getBrand());
        System.out.println("Model : " + chosen.getModel());
        System.out.println("Color : " + chosen.getColor());
        System.out.println("Fuel  : " + chosen.getFuelType());
        System.out.println("Engine: " + chosen.getEngine());
        System.out.println("Mileage: " + chosen.getMileage());
        System.out.println("Price : Rs." + chosen.getPrice());

        System.out.println("\n---Kindly fill the following details---\n");
        System.out.print("Enter Your Name: ");
        String name = sc.nextLine();
        System.out.print("Enter your Address: ");
        String address = sc.nextLine();
        System.out.print("Enter your Mobile Number: ");
        long Phone_num = sc.nextLong();

        System.out.println("\nSelect your Payment Method:");
        System.out.println("1. Cash");
        System.out.println("2. UPI");

        System.out.print("Enter choice: ");
        int pay = sc.nextInt();
        sc.nextLine();

        String payment;

        if (pay == 1) {
            payment = "Cash";
        }
        else if (pay == 2) {
            payment = "UPI";
        }
        else {
            System.out.println("Invalid Payment!");
            return;
        }

        System.out.println("This is your Bill Receipt");

        System.out.println("\n=========================================================");
        System.out.println("                     BILL RECEIPT");
        System.out.println("=========================================================");
        System.out.println("Customer Name : " + name);
        System.out.println("Contact : " + Phone_num);
        System.out.println("Address : " + address);
        System.out.println("---------------------------------------------------------");
        System.out.println("              ---Vehicle details!---");
        System.out.println("\nBrand : " + chosen.getBrand());
        System.out.println("Model : " + chosen.getModel());
        System.out.println("Color : " + chosen.getColor());
        System.out.println("Price : Rs." + chosen.getPrice());
        System.out.println("---------------------------------------------------------");
        System.out.println("Total Amount: Rs." + chosen.getPrice());
        System.out.println("---------------------------------------------------------");
        System.out.println("Your payment was Successfully paid via " + payment + "!!");
        System.out.println("Thankyou for visiting!!");
        System.out.println("==========================================================");

    }
}