package week3.day1;

public class MyVehicle {

	public static void main(String[] args) {

		Vehicle vehicle = new Vehicle();
		Car car = new Car();
		Audi audi = new Audi();
		vehicle.applyBrake();
		vehicle.applyABSBrake();
		vehicle.soundHorn();
		car.openDoor();
		audi.autoPark();
		audi.applyABSBrake();

	}

}
