package conditional;

import java.util.Scanner;

public class _If {

	public static void main(String[] args) {
		int a, b, c;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 과목 점수 입력: ");
		a = scan.nextInt();
		System.out.print("두번째 과목 점수 입력: ");
		b = scan.nextInt();
		System.out.print("세번째 과목 점수 입력: ");
		c = scan.nextInt();
		
		if( (a+b+c)/3 >= 60) {
			if( a < 40 || b < 40 || c < 40)
				System.out.println("과락으로 불합격");
			else
				System.out.println("합격");
		}
		else
			System.out.println("불합격");
		
		scan.close();
	}
}
