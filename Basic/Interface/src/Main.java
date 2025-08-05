

public class Main {
    public static void main(String[] args) {

        Bicycle b = new Bicycle();
        b.changeGear();
        b.speedUp();
        b.applyBrake();

        b.displayBicycle();

        Bike bike = new Bike();
        bike.changeGear();
        bike.speedUp();
        bike.applyBrake();

        bike.displayBike();
    }
}
