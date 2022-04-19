package array;

public class Grade {
	public static void main(String[] args) {
		
		String[] name = {"홍길동", "라이언", "어피치"};
		
		int[][] score = {{90, 96, 100, 0}, {100, 89, 75, 0}, {75, 80, 48, 0}};
		double[] avg = new double[3];
		char[] grade = new char[3];
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[0].length-1; j++) {
				score[i][3] += score[i][j];	
			}
		}
		
		for(int i=0; i<avg.length; i++) {
			avg[i] = (double)score[i][3]/(score[i].length-1);
		}
		
		for(int i=0; i<grade.length; i++) {
			if(avg[i]>=90) 		grade[i] = 'A';
			else if(avg[i]>=80) grade[i] = 'B';
			else if(avg[i]>=70) grade[i] = 'C';
			else if(avg[i]>=60) grade[i] = 'D';
			else				grade[i] = 'E';
		}
		
		System.out.println(" ___________________________________________________________ ");
		System.out.println("|                                                            |");
		System.out.println("| 이름\t\t국어\t영어\t수학\t총점\t평균\t학점 |");
		System.out.println("|------------------------------------------------------------|");
		for(int i=0; i<score.length; i++) {
			System.out.print("| "+ name[i] + "\t");
			for(int j=0; j<score[0].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.println(String.format("%.2f", avg[i]) + "\t" + grade[i] + "    |");
		}
		System.out.println("|____________________________________________________________|");
		
		
	}
}
