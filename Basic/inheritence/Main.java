
public class Main
{
	public static void main(String[] args) {
		ElectricCar tesla= new ElectricCar(70,40,600,80,900,5);
		
		System.out.println("Electric Car Details: ");
		System.out.println("Accelerator: "+ tesla.accelerator);
		System.out.println("Brake: "+ tesla.brake);
		System.out.println("Engine: "+ tesla.engine);
		System.out.println("Transmission: "+ tesla.transmission);
		System.out.println("Battery: "+ tesla.battery);
		System.out.println("Charge Time: "+ tesla.chargeTime);
	}
}