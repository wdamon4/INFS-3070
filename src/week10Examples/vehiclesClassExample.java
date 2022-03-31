package week10Examples;

public class vehiclesClassExample {

	public static void main(String[] args) {
		
		// create the object of the class vehicle
		vehicle fordF350 = new vehicle(); 
		fordF350.type = "Truck";
		fordF350.economy = 18;
		fordF350.speed = 100;
		fordF350.passengers = 5;
		fordF350.fuelCapacity = 35;
		
		vehicle jeepWrangler = new vehicle();
		jeepWrangler.type = "SUV";
		jeepWrangler.economy = 24;
		jeepWrangler.speed = 80;
		jeepWrangler.passengers = 5;
		jeepWrangler.fuelCapacity = 25;
		
		System.out.println("The F350 can hold " + fordF350.passengers + " passengers");
		System.out.println("The Wrangler gets " + jeepWrangler.economy + " mpg");
		
		System.out.println("\nF350: ");
		fordF350.estimatedRange();
		
		System.out.println("\nWrangler: ");
		jeepWrangler.estimatedRange();

	}
}

	class vehicle {
		String type;
		int passengers;
		int speed;
		int economy;
		int fuelCapacity;
		
		void estimatedRange() {
			double range;
			
			range = fuelCapacity * economy;
			
			System.out.println("The estimated range is: " + range + " miles");
	}
}
	

