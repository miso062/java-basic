package _constructor;

class Compute{
	
	int x, y, sum, sub, mul;
	double div;
	
	public Compute(int x, int y){
		this.x = x;
		this.y = y;
	}

	public int getSum() {
		sum = x+y;
		return sum;
	}

	public int getSub() {
		sub = x-y;
		return sub;
	}

	public int getMul() {
		mul = x*y;
		return mul;
	}

	public double getDiv() {
		div = (double)x/y;
		return div;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
}

public class ComputeMain {

	public static void main(String[] args) {
//		# 1
		Compute com1 = new Compute(320, 258);
		Compute com2 = new Compute(125, 110);
		Compute com3 = new Compute(578, 312);
		
		System.out.println("x\ty\tsum\tsub\tmul\tdiv");
		System.out.println(com1.getX() + "\t" + 
				com1.getY() + "\t" + 
				com1.getSum() + "\t" +
				com1.getSub() + "\t" +
				com1.getMul() + "\t" + 
				String.format("%.2f", com1.getDiv()));
		
		System.out.println(com2.getX() + "\t" + 
				com2.getY() + "\t" + 
				com2.getSum() + "\t" +
				com2.getSub() + "\t" +
				com2.getMul() + "\t" + 
				String.format("%.2f", com2.getDiv()));
		
		System.out.println(com3.getX() + "\t" + 
				com3.getY() + "\t" + 
				com3.getSum() + "\t" +
				com3.getSub() + "\t" +
				com3.getMul() + "\t" + 
				String.format("%.2f", com3.getDiv()));
		
		System.out.println();
		
//		# 2
		Compute[] comAr1 = {new Compute(405, 394), 
							new Compute(125, 34), 
							new Compute(865, 137)};
		
		System.out.println("x\ty\tsum\tsub\tmul\tdiv");
		for(int i=0; i<comAr1.length; i++) {
			System.out.println(comAr1[i].getX() + "\t" + 
					comAr1[i].getY() + "\t" + 
					comAr1[i].getSum() + "\t" +
					comAr1[i].getSub() + "\t" +
					comAr1[i].getMul() + "\t" + 
					String.format("%.2f", comAr1[i].getDiv()));
		}
		
		System.out.println();
		
//		# 3
		Compute[] comAr2 = new Compute[]{
				new Compute(678, 425), 
				new Compute(762, 334), 
				new Compute(563, 123)};
		System.out.println("x\ty\tsum\tsub\tmul\tdiv");
//		향상된 for 문의 사용
		for(Compute com: comAr2) {
			System.out.println(com.getX() + "\t" + 
					com.getY() + "\t" + 
					com.getSum() + "\t" +
					com.getSub() + "\t" +
					com.getMul() + "\t" + 
					String.format("%.2f", com.getDiv()));
		}

	}

}
