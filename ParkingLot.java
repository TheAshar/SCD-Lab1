public class ParkingLot {

    private static ParkingLot instance;
    private String name;
    private int totalSlots;
    private int availableSlots;

    private ParkingLot() {
        this.name = "City Parking Lot";
        this.totalSlots = 50;
        this.availableSlots = 50;
    }

    public static ParkingLot getInstance() {
        if (instance == null) {
            instance = new ParkingLot();
        }
        return instance;
    }

    public void parkVehicle() {
        if (availableSlots > 0) {
            availableSlots--;
            System.out.println("Vehicle parked successfully.");
        } else {
            System.out.println("Sorry! No slots available.");
        }
    }

    public void removeVehicle() {
        if (availableSlots < totalSlots) {
            availableSlots++;
            System.out.println("Vehicle removed successfully.");
        } else {
            System.out.println("Parking lot is already empty.");
        }
    }

    public void displayStatus() {
        System.out.println("Parking Lot   : " + name);
        System.out.println("Total Slots   : " + totalSlots);
        System.out.println("Available     : " + availableSlots);
        System.out.println("Occupied      : " + (totalSlots - availableSlots));
    }
}
