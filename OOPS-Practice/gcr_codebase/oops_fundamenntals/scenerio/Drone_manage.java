package oops_practice.gcr_codebase.oops_fundamenntals.scenerio;

class Drone {
    private String droneId;
    private int batteryPercentage;

    static String companyName = "SkyExpress Logistics";

    Drone(String droneId, int batteryPercentage) {
        this.droneId = droneId;
        this.batteryPercentage = batteryPercentage;
    }

    void startDelivery() {
        if (batteryPercentage >= 30) {
            System.out.println(droneId + " started delivery.");
            batteryPercentage -= 30;
        } else {
            System.out.println(droneId + " has insufficient battery.");
        }
    }

    void displayStatus() {
        System.out.println("Drone ID: " + droneId);
        System.out.println("Battery: " + batteryPercentage + "%");
        System.out.println("Company: " + companyName);
        System.out.println();
    }
}

public class Drone_manage {
    public static void main(String[] args) {

        Drone d1 = new Drone("D101", 80);
        Drone d2 = new Drone("D102", 60);
        Drone d3 = new Drone("D103", 40);

        d1.startDelivery();
        d2.startDelivery();
        d3.startDelivery();

        d1.displayStatus();
        d2.displayStatus();
        d3.displayStatus();
    }
}