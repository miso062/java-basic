package _constructor;

public class VarArgs {
	public int sum (int a, int b) {
		return a+b;
	}
	public int sum (int a, int b, int c) {
		return a+b+c;
	}
	public int sum (int a, int b, int c, int d) {
		return a+b+c+d;
	}
	
	public int sum(int...ar) {
		int sum =0;
		for(int i=0; i<ar.length; i++) {
			sum += ar[i];
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		VarArgs va = new VarArgs();
		
		System.out.println("합 = " + va.sum(1, 2));
		System.out.println("합 = " + va.sum(1, 2, 3));
		System.out.println("합 = " + va.sum(1, 2, 3, 4));
	}
}
