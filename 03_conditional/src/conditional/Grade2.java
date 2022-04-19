package conditional;

import java.util.Scanner;

public class Grade2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name;
		
		char grade;	
		int kor, eng, math;
		
		System.out.print("이름 입력: ");
		name = scan.next();
		
		System.out.print("국어 입력: ");
		kor = scan.nextInt();
		System.out.print("영어 입력: ");
		eng = scan.nextInt();
		System.out.print("수학 입력: ");
		math = scan.nextInt();
		
		int sum = (kor + eng + math);
		double avg = sum/3.0;
		
		switch((int)avg/10) {
			case 10:
			case 9:
				grade = 'A';
				break;
			case 8:
				grade = 'B';
				break;
			case 7:
				grade = 'C';
				break;
			case 6:
				grade = 'D';
				break;
			default:
				grade = 'F';
				break;
		}
		
		System.out.println("\t*** " + name + " 성적표 ***\t");
		System.out.println("국어\t영어\t수학\t총점\t평균\t학점");
		System.out.println(kor + "\t" + eng + "\t" + math + "\t" + sum + "\t" + String.format("%.2f", avg) + "\t" + grade);
		
		scan.close();
	}
}
