package db.dip.solution;

public class Driver {

    private Vehicle vehicle;


    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void drive(){
        vehicle.move();
    }
}
