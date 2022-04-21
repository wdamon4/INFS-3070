package week13Examples;

class car{
	public void fuel() {
		System.out.println("This vehicle runs on gasoline.");
	}
}

class crossover extends car{
	
}

class truck extends car{
	
	@Override
	public void fuel() {
		System.out.println("This vehicle runs on diesel.");
	}
}

public class polymorphismExample {

	public static void main(String[] args) {

		car a = new car();
		a.fuel();
		
		System.out.println("------------------------------");
		
		crossover b = new crossover();
		b.fuel();
		
		System.out.println("------------------------------");
		
		truck c = new truck();
		c.fuel();
	}

}
