package array_2;

import java.util.Scanner;

public class Grade2 {
	public static void main(String[] args) {
		
		int num;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("인원수: ");
		num = scan.nextInt();
		
		String[] name = new String[num];
		String[][] subject = new String[num][];
		int[][] score = new int[num][];
		int[] subject_num = new int[num];
		
//		int[][] ar = new int[3][];
//		ar[0] = new int[2];
//		ar[1] = new int[3];
//		ar[2] = new int[4];
		
		
		for(int i=0; i<num; i++) {
			
			System.out.println("이름입력: ");
			name[i] = scan.next();
			
			System.out.println("과목수 입력: ");
			subject_num[i] =scan.nextInt(); 
			
			subject[i] = new String[subject_num[i]];
			
			for(int j=0; j<subject_num[i]; j++) {
				System.out.print("과목명 입력: ");
				subject[i][j] = scan.next();
			}
			for(int j=0; j<subject_num[i]; j++) {
				System.out.print(subject[j] + "점수 입력: ");
				score[i][j] = scan.nextInt();
			}
		}
		
//		System.out.println(" ___________________________________________________________ ");
//		System.out.println("|                                                            |");
//		System.out.println("| 이름\t\t국어\t영어\t수학\t총점\t 평균\t학점 |");
//		System.out.println("|------------------------------------------------------------|");
//		for(int i=0; i<num; i++) {
//			System.out.print("| "+ name[i] + "\t");
//			for(int j=0; j<subject_num; j++) {
//				System.out.printf("%3d\t", score[i][j]);
//			}
//			System.out.println(String.format("%.2f", avg[i]) + "\t" + String.format("%3c", grade[i]) + "  |");
//		}
//		System.out.println("|____________________________________________________________|");
		
		scan.close();
		
	}
}
