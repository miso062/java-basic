package variable;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String name;
		int kor, eng, math;
		
		System.out.print("이름 입력: ");
		name = scan.next();
		
		System.out.print("국어 입력: ");
		kor = scan.nextInt();
		System.out.print("영어 입력: ");
		eng = scan.nextInt();
		System.out.print("수학 입력: ");
		math = scan.nextInt();
		
		System.out.println("\t*** " + name + " 성적표 ***\t");
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println(kor + "\t" + eng + "\t" + math + "\t" + (kor+eng+math) + "\t" + String.format("%.2f", (kor+eng+math)/3.0));
//		System.out.printf("%d\t%d\t%d", kor, eng, math);
		
		scan.close();
		
	}
}
