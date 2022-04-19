package conditional;

//import java.util.*;

public class Operator {

	public static void main(String[] args) {
		
//		# 1
		String a = "apple"; // 리터럴 생성
		String b = new String("apple");
		String c = "apple"; // 리터럴 cache 받아옴
		
		// 주소 비교
		System.out.println(a==b ? "같다" : "다르다");
		System.out.println(a==c ? "같다" : "다르다");
		
		// 문자열비교
		System.out.println(a.equals(b) ? "같다" : "다르다");
		
//		#2
		int num1=0, num2=0;     
		boolean result;
	      
		result = ( (num1+=10) < 0 && (num2+=10) > 0 );   
		System.out.println("\nresult = "+result);    // false
		System.out.println("num1 = "+ num1 + " num2 = "+ num2);    // num1 = 10, num2 = 0   
		System.out.println();

		result = ( (num1+=10) > 0 || (num2+=10) > 0 );

		System.out.println("result = "+result); // true 
		System.out.println("num1 = "+ num1 + " num2 = "+ num2); // num1 = 20, num = 0
	}
}
