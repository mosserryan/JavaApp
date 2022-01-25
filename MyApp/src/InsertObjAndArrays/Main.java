package InsertObjAndArrays;

public class Main {

	public static void main(String[] args) {
		
		Garage garage = new Garage();
		
		Car carOne = new Car("white","Subaru","Forester");
		Car carTwo = new Car("black","Ford","Thingy");
		
		garage.parkCar(carOne);
		//garage.parkCar(carTwo);
		//garage.parkCar(carOne);
		
		garage.checkGarage();
	}
	
}
