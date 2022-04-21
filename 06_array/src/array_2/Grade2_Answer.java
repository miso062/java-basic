package array_2;

import java.util.Scanner;

public class Grade2_Answer {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("인원수 입력: ");
		
		int cnt = scan.nextInt();
		
		String[] name = new String[cnt];
		String[][] subject = new String[cnt][]; // 가변길이
		
		int subjectCnt;
		int[][] jumsu = new int[cnt][];
		double[] avg = new double[cnt];
		
		
		// enter
		for(int i=0; i<cnt; i++) { // repeat by cnt
			
			System.out.println("\n   <"+ (i+1) + "번째>");
			
			System.out.print("> 이름 입력: ");
			name[i] = scan.next();
			
			System.out.print("> 과목수 입력: ");
			subjectCnt = scan.nextInt();
			
			subject[i] = new String[subjectCnt]; 
			for(int j=0; j<subjectCnt; j++) {
				System.out.print("  >> 과목명 입력: ");
				subject[i][j] = scan.next();
			}
			
			jumsu[i] = new int[subjectCnt+1];
			for(int j=0; j<subjectCnt; j++) {
				System.out.print("    >> " + subject[i][j]+" 점수 입력: ");
				jumsu[i][j] = scan.nextInt();
				jumsu[i][subjectCnt] += jumsu[i][j];
			}
			avg[i] = (double)jumsu[i][subjectCnt]/subjectCnt;
		}
		
		System.out.println();
		
		// print
		for(int i=0; i<cnt; i++) {
			System.out.println("========================================================");
			// print title
			System.out.print("이름\t");
			for(int j=0; j<subject[i].length; j++) {
				System.out.print(subject[i][j] + "\t");
			}
			System.out.println("총점\t평균");
			
			// print data
			System.out.println("--------------------------------------------------------");
			System.out.print(name[i] + "\t");
			for(int j=0; j<jumsu[i].length; j++) {
				System.out.print(jumsu[i][j] + "\t");
			}
			System.out.println(String.format("%.2f", avg[i]));
		}
		System.out.println("========================================================");
		
		
		scan.close();
	}
}
