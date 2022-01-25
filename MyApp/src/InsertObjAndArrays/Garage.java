package InsertObjAndArrays;

public class Garage {

	Car[] garage = new Car[2];
	
	void parkCar(Car car) {
		
		if(garage[0] == null) {
			System.out.print("Parking " + car + " in spot one." + "\n");
			garage[0] = car;
		} else if (garage[0] != null && garage[1] == null) {
			System.out.print("Parking " + car + " in spot two." + "\n");
			garage[1] = car;
		} else {
			System.out.print("Spot one has " + garage[0] + " and spot two has " + garage[1] + ". The garage is full." + "\n");
		}
		
	}
	
	void checkGarage() {
		for(int i = 0; i < garage.length; i++) {
			if(i == 0 && garage[i] != null) {
				System.out.println("The " + garage[i] + " is in spot one.");
			}
			
			if(i == 1 && garage[i] != null) {
				System.out.println("The " + garage[i] + " is in spot two.");
			}
			
		}
	}
	
}
