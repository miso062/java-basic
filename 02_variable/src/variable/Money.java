package variable;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Money {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int cash;
		
		System.out.print("현금 입력: ");
		cash = scan.nextInt();
		
		System.out.println("현금: " + new DecimalFormat().format(cash) + "원");
		System.out.println("천의 자리: " + (cash/1000) + "장");
		System.out.println("백의 자리: " + (cash/100%10) + "개"); // cash%1000/100
		System.out.println("십의 자리: " + (cash/10%10) + "개");  // cash%1000%100/10
		System.out.println("일의 자리: " + (cash/1%10) + "개");
		
		scan.close();
	}
}
