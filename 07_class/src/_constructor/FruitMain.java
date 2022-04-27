package _constructor;

class Fruit{
	String pum; 
	int jan, feb, mar, tot;
	static int sumJan, sumFeb, sumMar;
	
	public Fruit(String pum, int jan, int feb, int mar) {
		this.pum = pum;
		this.jan = jan;
		this.feb = feb;
		this.mar = mar;
	}
	
	public void calcTot() {
		tot = jan + feb + mar;
		sumJan += jan;
		sumFeb += feb;
		sumMar += mar;
	}
	
	public void display() {
		calcTot();
		System.out.printf("| %s\t%3d\t%3d\t%3d\t%3d |\n", pum, jan, feb, mar, tot);
	}
	
	public static void output() {
		System.out.println("|\t" + sumJan + "\t" + sumFeb + "\t" + sumMar + "\t    |");
	}
}

public class FruitMain {
	public static void main(String[] args) {
		Fruit apple = new Fruit("사과", 100, 80, 70);
		Fruit grape = new Fruit("포도", 30, 25, 10);
		Fruit straw = new Fruit("딸기", 25, 30, 90);

		System.out.println("-------------------------------------");
		System.out.println("| PUM\tJAN\tFEB\tMAR\tTOT |");
		System.out.println("-------------------------------------");
		apple.display();
		grape.display();
		straw.display();
		System.out.println("-------------------------------------");
		Fruit.output();
		System.out.println("-------------------------------------");
	}
}