package LLD.ParkingLot;

import LLD.ParkingLot.ParkingSpots.ParkingSpot;
import LLD.ParkingLot.ParkingSpots.ParkingSpotFactory;

public class Client {
    public static void main(String[] args) {
        ParkingSpotFactory factory = new ParkingSpotFactory();
        ParkingSpot parkingSpot = factory.getParkingSpot("two");
        parkingSpot.setSpotId("123");
        if(parkingSpot.isAvailable()) {
            System.out.println("Spot is Available... you can go to spot 123 and park");
        }
        
    }
}
