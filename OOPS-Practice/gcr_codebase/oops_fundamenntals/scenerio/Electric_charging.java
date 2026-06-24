package oops_practice.gcr_codebase.oops_fundamenntals.scenerio;

class ChargingStation {

static int totalStations = 0;
static double electricityRate = 8.5;

private String stationId;
private double unitsConsumed;

ChargingStation(String stationId, double unitsConsumed) {
    this.stationId = stationId;
    this.unitsConsumed = unitsConsumed;
    totalStations++;
}

double calculateBill() {
    return unitsConsumed * electricityRate;
}

void displayStationDetails() {
    System.out.println("Station ID: " + stationId);
    System.out.println("Units Consumed: " + unitsConsumed);
    System.out.println("Bill: Rs." + calculateBill());
    System.out.println();
}
}

public class Electric_charging {
    public static void main(String[] args) {

        ChargingStation[] stations = {
                new ChargingStation("CS101", 120),
                new ChargingStation("CS102", 150),
                new ChargingStation("CS103", 100),
                new ChargingStation("CS104", 180),
                new ChargingStation("CS105", 90)
        };

        for (ChargingStation s : stations) {
            s.displayStationDetails();
        }

        System.out.println("Total Stations: " +
                ChargingStation.totalStations);

        System.out.println("\nChanging Electricity Rate to Rs.10/unit\n");
        ChargingStation.electricityRate = 10;

        for (ChargingStation s : stations) {
            s.displayStationDetails();
        }
    }
}