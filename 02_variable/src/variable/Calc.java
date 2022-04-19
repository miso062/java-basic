package variable;

import java.text.DecimalFormat;

public class Calc {

	public static void main(String[] args) {
		short num1 = 320;
		short num2 = 258;
		
		DecimalFormat df = new DecimalFormat();
		
		short sum = (short)(num1+num2);
		short sub = (short)(num1-num2);
//		short mul = (short)(num1*num2);
		int mul = num1*num2;
		double div = (double)num1/num2;
		
		System.out.println(num1 + " + " + num2 + " = " + sum);
		System.out.println(num1 + " - " + num2 + " = " + sub);
		System.out.println(num1 + " * " + num2 + " = " + mul);
		System.out.println(num1 + " * " + num2 + " = " + df.format(mul));
		System.out.println(num1 + " / " + num2 + " = " + String.format("%.2f", div));
	}
}

