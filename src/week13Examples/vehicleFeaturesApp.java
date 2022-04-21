package week13Examples;

public class vehicleFeaturesApp {

	public static void main(String[] args) {

		jeepWrangler jeep = new jeepWrangler();
		jeep.airConditioning();
		jeep.cruiseControl();
		jeep.selfDriving();
		jeep.tintedWindows();
		jeep.liftKit();
		
		System.out.println("----------------------------------------");
		
		fordF350 f350 = new fordF350();
		f350.airConditioning();
		f350.cruiseControl();
		f350.selfDriving();
		f350.liftKit();
		
	}

}
