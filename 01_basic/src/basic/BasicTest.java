package basic;

public class BasicTest {
	
	public static void main(String[] args) {	
		System.out.println('A' + 3);
		System.out.println((char)('A' + 3));
		System.out.println("A" + 3);
		
		System.out.println(2+5);
		System.out.println('2'+'5');
		System.out.println('2'+'5' - (48*2));
		System.out.println(Integer.parseInt("2") + Double.parseDouble("5"));
	}
}