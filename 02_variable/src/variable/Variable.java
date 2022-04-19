package variable;

public class Variable {

	public static void main(String[] args) {
		boolean b = 25>36;
		char ch1 = 'i';
		int num1 = 65;
		double d = 25.8;
		
		char ch2 = 65;
		int num2 = 'A';
		
		float f = 43.6F;
		
		// int가 더 작은 정수형이기 때문에 가능
		long l1 = 25;
		long l2 = 25L;
		
		System.out.println(b);
		System.out.println(ch1);
		System.out.println(num1);
		System.out.println(d);
		System.out.println(ch2);
		System.out.println(num2);
		System.out.println(f);
		
		System.out.println(l1 + " " + l2);
	}
}
