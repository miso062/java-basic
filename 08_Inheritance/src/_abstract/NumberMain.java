package _abstract;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberMain {
	
	
	public static void main(String[] args) {
//		NumberFormat - abstract
//			child - DecimalFormat() & ChoiceFormat()
//		NumberFormat nf = new NumberFormat(); // Error
		
//		# 1 - use subClass
		NumberFormat nf = new DecimalFormat();
		System.out.println(nf.format(12345678.987654321));
		System.out.println(nf.format(12345678));
		System.out.println();
		
		NumberFormat nf2 = new DecimalFormat("#,###.##원");
		System.out.println(nf2.format(12345678.987654321));
		System.out.println(nf2.format(12345678));
		System.out.println();
		
		NumberFormat nf3 = new DecimalFormat("#,###.00원");
		System.out.println(nf3.format(12345678.987654321));
		System.out.println(nf3.format(12345678));
		System.out.println();
		
		
//		# 2 - use method
//		NumberFormat nf4 = NumberFormat.getInstance(); // class 객체를 반환하는 메소드를 이용하여 생성
		NumberFormat nf4 = NumberFormat.getCurrencyInstance();
		System.out.println(nf4.format(12345678.987654321));
		System.out.println(nf4.format(12345678));
		System.out.println();
		
		NumberFormat nf5 = NumberFormat.getCurrencyInstance(Locale.UK);
//		소수이하 2째자리
		nf5.setMaximumFractionDigits(2);
//		0을 강제로 표시
		nf5.setMinimumFractionDigits(4);
		System.out.println(nf5.format(12345678.987654321));
		System.out.println(nf5.format(12345678));
		System.out.println();

	}
}
