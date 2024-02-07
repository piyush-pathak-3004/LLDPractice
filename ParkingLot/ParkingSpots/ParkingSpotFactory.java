package LLD.ParkingLot.ParkingSpots;

public class ParkingSpotFactory {

    public ParkingSpot getParkingSpot(String type) {
        ParkingSpot parkingSpot = null;
        if(type.equals("Premium")) {
            parkingSpot = new PreminumParkingSpot();
        } else if(type.equals("Premium")) {
            parkingSpot = new NormalParkingSpot();
        }

        return parkingSpot;
    }
}
