package variable;

import java.text.DecimalFormat;

public class Pay {

	public static void main(String[] args) {
		char name = 'L';
		int basePay = 2500000;
		
		DecimalFormat df = new DecimalFormat();
		
		System.out.println("*** " + name + "의 월급 ***");
//		System.out.println("기본급 : " + basePay + "원");
		System.out.println("기본급 : " + df.format(basePay) + "원");
//		System.out.println("세금  : " + String.format("%.0f", (basePay*0.033)) + "원");
		System.out.println("세금  : " + df.format(basePay*0.033) + "원");		
//		System.out.println("월급  : " + String.format("%.0f", (basePay-(basePay*0.033))) + "원");
		System.out.println("월급  : " + df.format(basePay-(basePay*0.033)) + "원");

	}

}
