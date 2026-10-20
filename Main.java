public class Main {
    public static void main(String[] args) {

        ParkingLot lot1 = ParkingLot.getInstance();
        ParkingLot lot2 = ParkingLot.getInstance();

        System.out.println("=== Parking Lot Management System ===\n");

        System.out.println("Same Instance? " + (lot1 == lot2));
        System.out.println();

        System.out.println("--- Initial Status ---");
        lot1.displayStatus();
        System.out.println();

        System.out.println("--- Parking Vehicles ---");
        lot1.parkVehicle();
        lot1.parkVehicle();
        System.out.println();

        System.out.println("--- Status After Parking ---");
        lot2.displayStatus();
        System.out.println();

        System.out.println("--- Removing Vehicle ---");
        lot1.removeVehicle();
        System.out.println();

        System.out.println("--- Final Status ---");
        lot1.displayStatus();
    }
}
// This is Main file
