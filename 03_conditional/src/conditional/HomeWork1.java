package conditional;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.print("첫번째 입력: ");
		a = scan.nextInt();
		System.out.print("두번째 입력: ");
		b = scan.nextInt();
		System.out.print("세번째 입력: ");
		c = scan.nextInt();
		
//		# 1
		if(a<b) {
			if(b<c) {
				 System.out.println(a + "\t" + b + "\t" + c); // a<b<c
			}
			else { // c<b
				if(a<c)	System.out.println(a + "\t" + c + "\t" + b); // a<c<b
				else System.out.println(c + "\t" + a + "\t" + b);    // c<a<b
			}
		}
		else{
			if(c<b) {
				System.out.println(c + "\t" + b + "\t" + a);     // c<b<a 
			}
			else { // b<c b<a
				if(a<c)	System.out.println(b + "\t" + a + "\t" + c); // b<a<c
				else System.out.println(b + "\t" + c + "\t" + a);    // b<c<a
			}
		}
		
//		# 2
//		if(a<b && a<c) { //a가 가장 작다면
//			if(b<c) System.out.println(a+", "+b+", "+c);
//			else System.out.println(a+", "+c+", "+b);
//		}else if(b<c) { //b가 가장 작다면
//			if(a<c) System.out.println(b+", "+a+", "+c);
//			else System.out.println(b+", "+c+", "+a);
//		}else { //c가 가장 작은 값 
//			if(a<b) System.out.println(c+", "+a+", "+b);
//			else System.out.println(c+", "+b+", "+a);
//		}

		scan.close();
	}
}
