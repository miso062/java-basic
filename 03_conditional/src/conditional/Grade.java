package conditional;

import java.util.Scanner;

public class Grade {
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
		
		if(avg >= 90)	 grade = 'A';
		else if(avg >= 80) grade = 'B';
		else if(avg >= 70) grade = 'C';
		else if(avg >= 60) grade = 'D';
		else 			grade = 'F';		
		
		System.out.println("\t*** " + name + " 성적표 ***\t");
		System.out.println("국어\t영어\t수학\t총점\t평균\t학점");
		System.out.println(kor + "\t" + eng + "\t" + math + "\t" + sum + "\t" + String.format("%.2f", avg) + "\t" + grade);
		
		scan.close();
	}
}
