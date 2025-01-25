package db.dip.problem;

public class Main {

    public static void main(String[] args) {

        Car car = new Car();

        Driver driver = new Driver();

        driver.setCar(car);

        driver.drive();
    }
}
