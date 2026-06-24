package oops_practice.gcr_codebase.oops_fundamenntals.scenerio;
class Vehicle {
    private String vehicleNumber;
    private String ownerName;
    private String vehicleType;

    Vehicle(String vehicleNumber, String ownerName, String vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    String getVehicleType() {
        return vehicleType;
    }

    void display() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println();
    }
}

public class Parking_manage {

    static void displayCars(Vehicle[] vehicles) {
        System.out.println("Cars:");
        for (Vehicle v : vehicles) {
            if (v.getVehicleType().equalsIgnoreCase("Car")) {
                v.display();
            }
        }
    }

    static void displayBikes(Vehicle[] vehicles) {
        System.out.println("Bikes:");
        for (Vehicle v : vehicles) {
            if (v.getVehicleType().equalsIgnoreCase("Bike")) {
                v.display();
            }
        }
    }

    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[10];

        vehicles[0] = new Vehicle("UP81AB1234", "Rahul", "Car");
        vehicles[1] = new Vehicle("UP81CD5678", "Priya", "Bike");
        vehicles[2] = new Vehicle("UP81EF1111", "Aman", "Car");
        vehicles[3] = new Vehicle("UP81GH2222", "Riya", "Bike");
        vehicles[4] = new Vehicle("UP81IJ3333", "Vikas", "Car");
        vehicles[5] = new Vehicle("UP81KL4444", "Neha", "Bike");
        vehicles[6] = new Vehicle("UP81MN5555", "Karan", "Car");
        vehicles[7] = new Vehicle("UP81OP6666", "Anjali", "Bike");
        vehicles[8] = new Vehicle("UP81QR7777", "Arjun", "Car");
        vehicles[9] = new Vehicle("UP81ST8888", "Sneha", "Bike");

        displayCars(vehicles);
        displayBikes(vehicles);
    }
}