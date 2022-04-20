package array_2;

import java.util.Scanner;

public class Grade2 {
	public static void main(String[] args) {
		
		int num;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("인원수: ");
		num = scan.nextInt();
		
		String[] name = new String[num];
		String[][] subject = new String[num][];
		
		double[] avg = new double[num];
		int[] subject_num = new int[num];
		int[] sum = new int[num];
		
		int[][] score = new int[num][];
		
		
		for(int i=0; i<num; i++) {
			System.out.println();
			
			System.out.print("이름입력: ");
			name[i] = scan.next();
			
			System.out.print("과목수 입력: ");
			subject_num[i] =scan.nextInt(); 
			
			subject[i] = new String[subject_num[i]];
			score[i] = new int[subject_num[i]];
			
			for(int j=0; j<subject_num[i]; j++) {
				System.out.print("과목명 입력: ");
				subject[i][j] = scan.next();
			}
			for(int j=0; j<subject_num[i]; j++) {
				System.out.print(subject[i][j] + "점수 입력: ");
				score[i][j] = scan.nextInt();
				sum[i] += score[i][j]; 
			}
			avg[i] = (double)sum[i]/subject_num[i];
		}
		
		System.out.println();
		
		for(int i=0; i<num; i++) {
			System.out.println("========================================================");
			System.out.print("이름\t");
			for(int j=0; j<subject_num[i]; j++) {
				System.out.print(subject[i][j] + "\t");
			}
			System.out.println("총점\t평균");
			System.out.println("--------------------------------------------------------");
			System.out.print(name[i] + "\t");
			for(int j=0; j<subject_num[i]; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.println(sum[i] + "\t" + String.format("%.2f", avg[i]));
		}
		System.out.println("========================================================");
		
		scan.close();
		
	}
}
