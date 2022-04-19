package method;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Pay {
	
	public int calPay(int basePay, int extraPay) {
		return basePay + extraPay;
	}
	
	public int calTax(int totalPay, double tariff) {
		return (int)(totalPay*tariff);
	}
	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat();
		Pay pay = new Pay();
		
		String name, rank;
		
		int basePay, extraPay, totalPay, tax, salary;
		double tariff;
		
		System.out.print("이름 입력: ");
		name = scan.next();
		System.out.print("직급 입력: ");
		rank = scan.next();
		System.out.print("기본금 입력: ");
		basePay = scan.nextInt();
		System.out.print("수당 입력: ");
		extraPay = scan.nextInt();
		
		totalPay = pay.calPay(basePay, extraPay);
		
		if(totalPay >= 4000000)	tariff = 0.03;
		else 				tariff = 0.02;
		
		tax = pay.calTax(totalPay, tariff);
		salary = totalPay - tax;
		
		
		System.out.println("\n\t *** " + name + " 월급 명세서 *** \t");
		System.out.println("직급: " + rank);
		System.out.println("기본급\t\t수당\t\t급여\t\t세율\t세금\t\t월급");
		System.out.println(df.format(basePay) + "\t" + df.format(extraPay) + "\t\t" + df.format(pay) + "\t" + (int)(tariff*100) + "%\t" + df.format(tax) + "\t\t" + df.format(salary));

		scan.close();
	}
}