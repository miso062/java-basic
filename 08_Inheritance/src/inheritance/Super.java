package inheritance;

public class Super {
	protected double weight, height;
	
	// Constructor
	public Super(double wight, double height) {
		this.weight = wight;
		this.height = height;
	}
	
	public Super() {		
	}
	
	public void display() {
		System.out.println("몸무게: " + this.weight + "kg");
		System.out.println("키: " + this.height + "cm");
	}
	
}
