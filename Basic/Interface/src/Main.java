//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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