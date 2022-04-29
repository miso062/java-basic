package _inheritance;

class Final {
	public final String FRUIT = "사과";
	public final String FRUIT2;
	
	public static final String ANIMAL = "호랑이";
	public static final String ANIMAL2;
	
	static {
		ANIMAL2 = "기린";
	}
	
	public Final(){
		FRUIT2 = "딸기";
	}
}

public class FinalMain {
	public static void main(String[] args) {
		final int AGE = 25;
		Final f = new Final();
		
		System.out.println("상수 AGE = " + AGE);
		
		final int AGE2;
		AGE2 = 30;
		System.out.println("상수 AGE2 = " + AGE2);
		
		System.out.println("상수 FRUIT = " + f.FRUIT);
		System.out.println("상수 FRUIT2 = " + f.FRUIT2);
		System.out.println("static 상수 ANIMAL = " + Final.ANIMAL);
		System.out.println("static 상수 ANIMAL2 = " + Final.ANIMAL2);
	}
}
