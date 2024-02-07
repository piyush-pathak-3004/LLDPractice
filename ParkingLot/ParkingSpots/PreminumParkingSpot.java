package LLD.ParkingLot.ParkingSpots;

import LLD.ParkingLot.Vehicals.Vehical;

public class PreminumParkingSpot implements ParkingSpot {

    String type;
    String spotId;
    Vehical vehical;

    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }

    public void setSpotId(String spotId) {
        this.spotId = spotId;
    }
    public String getSpotId() {
        return spotId;
    }

    @Override
    public boolean isAvailable() {
        return vehical == null;
    }

    @Override
    public boolean park(Vehical vehical) {
        this.vehical = vehical;
        return true;
    }

    @Override
    public boolean unPark() {
        this.vehical = null;
        return true;
    }

    @Override
    public int getCost() {
        return 200;
    }
    
}
