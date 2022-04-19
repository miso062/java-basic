package variable;

import java.io.IOException;
import java.util.Scanner;

public class Input {
	public static void main(String[] args) throws IOException {
		
		System.out.print("데이터 입력: ");
		int data = System.in.read();
		System.out.println(data);
//		뒤에 들어온 enter를 제거해 주어야 함.
		System.in.read();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num1 = scan.nextInt();
		System.out.print("실수 입력: ");
		double num2 = scan.nextDouble();
		
		System.out.println(num1 + " " + num2);
		
		scan.close();	
	}
}
