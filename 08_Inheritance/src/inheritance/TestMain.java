package inheritance;

class Test extends Object {
	int a, b;
	
	@Override
	public String toString() {
		
		return "Have a nice day!";
	}
}

public class TestMain {
	public static void main(String[] args) {
		Test test1 = new Test();
		Test test2 = test1;
		
		System.out.println("객체 test = " + test1);
		
		test1.a = 2;
		test1.b = 5;
		
		System.out.println(test1.a + " " + test1.b);
		System.out.println(test2.a + " " + test2.b);
		
		test2.a = 7;
		test2.b = 9;
		System.out.println(test1.a + " " + test1.b);
		System.out.println(test2.a + " " + test2.b);
		
		test2 = new Test();
		test2.a = 10;
		test2.b = 4;
		System.out.println(test1.a + " " + test1.b);
		System.out.println(test2.a + " " + test2.b);
	}
}

