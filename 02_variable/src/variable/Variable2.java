package variable;

public class Variable2 {

	int num1;
	static int num3;
	
	public static void main(String[] args) {
		int num2 = 10;
		int num1 = 1;
		
		Variable2 v = new Variable2();
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(v.num1);
		System.out.println(new Variable2().num1);
		System.out.println(num3);
	}
}
