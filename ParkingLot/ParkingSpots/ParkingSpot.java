package LLD.ParkingLot.ParkingSpots;

import LLD.ParkingLot.Vehicals.Vehical;

public interface ParkingSpot {
    void setType(String type);
    String getType();
    void setSpotId(String spotId);
    String getSpotId();

    boolean isAvailable();
    boolean park(Vehical vehical);
    boolean unPark();
    int getCost();
}
