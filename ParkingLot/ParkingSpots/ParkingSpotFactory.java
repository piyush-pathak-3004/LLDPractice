package LLD.ParkingLot.ParkingSpots;

public class ParkingSpotFactory {

    public ParkingSpot getParkingSpot(String type) {
        ParkingSpot parkingSpot = null;
        if(type.equals("two")) {
            parkingSpot = new TwoWheelerParkingSpot();
        } else if(type.equals("four")) {
            parkingSpot = new FourWheelerParkingSpot();
        }

        return parkingSpot;
    }
}
