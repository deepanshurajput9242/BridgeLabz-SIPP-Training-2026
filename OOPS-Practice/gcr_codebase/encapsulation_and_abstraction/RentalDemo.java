package oops_practice.gcr_codebase.encapsulation_and_abstraction;

abstract class Vehicle {

    private String vehicleNumber;
    private String vehicleType;

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    abstract double calculateRentalCost(int days);

    void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Vehicle Type: " + vehicleType);
    }
}

class Car extends Vehicle {

    private double dailyRate;

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    double calculateRentalCost(int days) {
        return days * dailyRate;
    }
}

class Bike extends Vehicle {

    private double dailyRate;

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    double calculateRentalCost(int days) {
        return days * dailyRate;
    }
}

class Truck extends Vehicle {

    private double dailyRate;
    private double loadingCharge;

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    public double getLoadingCharge() {
        return loadingCharge;
    }

    public void setLoadingCharge(double loadingCharge) {
        this.loadingCharge = loadingCharge;
    }

    double calculateRentalCost(int days) {
        return (days * dailyRate) + loadingCharge;
    }
}

public class RentalDemo {
    public static void main(String[] args) {

        Car c = new Car();
        c.setVehicleNumber("UP81AB1234");
        c.setVehicleType("Car");
        c.setDailyRate(2000);

        Bike b = new Bike();
        b.setVehicleNumber("UP81XY5678");
        b.setVehicleType("Bike");
        b.setDailyRate(500);

        Truck t = new Truck();
        t.setVehicleNumber("UP81TR9999");
        t.setVehicleType("Truck");
        t.setDailyRate(4000);
        t.setLoadingCharge(3000);

        c.displayDetails();
        System.out.println("Cost: " + c.calculateRentalCost(5));

        System.out.println();

        b.displayDetails();
        System.out.println("Cost: " + b.calculateRentalCost(5));

        System.out.println();

        t.displayDetails();
        System.out.println("Cost: " + t.calculateRentalCost(5));
    }
}