package finalExam;

public class Gravity {

public double distanceFallen(double time, double acc) {
		
		return (0.5)*acc*Math.pow(time, 2);
	}

public static void main(String[] args) {

	Gravity g = new Gravity();
	
	System.out.printf("%5s %17s %16s \n","Time","Distance Earth","Distance Moon");
	
	for (int i = 1; i <= 10; i++) {
		
		System.out.printf("%3d %16.2f %16.2f \n", i, g.distanceFallen(i, 9.8), g.distanceFallen(i, 1.625));
		}
	}
}

	

