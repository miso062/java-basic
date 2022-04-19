package conditional;

//import java.io.IOException;
import java.util.Scanner;

public class Comp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		# 1
		int score;
		
		System.out.print("점수를 입력하세요: ");
		score = scan.nextInt();
		
		System.out.println(score>=80 && score<=100 ? "합격\n" : "불합격\n");
		
//		# 2
		int a, b;
		System.out.print("a의 값 입력: ");
		a = scan.nextInt();
		System.out.print("b의 값 입력: ");
		b = scan.nextInt();
		System.out.println(a>b ? "큰 값 = "+a : "큰 값 = "+b);
		
//		#3
		char ch;
		System.out.print("\n문자 입력: ");
//		ch = (char)System.in.read();
		ch = scan.next().charAt(0);
		
		int result = (ch>='A' && ch<='Z' ? ch+32 : ch-32);
		System.out.println(ch + " -> " + (char)result);
		
		System.out.println(ch + " -> " + (ch >= 'a' ? (char)(ch-32) : (char)(ch+32)));
		
		scan.close();
	}
}