package db.dip.problem;

public class Driver {

    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }


    public void drive(){
        car.move();
    }
}
