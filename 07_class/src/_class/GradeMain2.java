package _class;

public class GradeMain2 {
	public static void main(String[] args) {
		Grade[] student = new Grade[3]; // 객체 배열
		
		for(int i=0; i<student.length; i++) {
			student[i] = new Grade();
			System.out.println(student[i]);
		}
		
		student[0].setName("홍길동");	student[0].setKor(90);	student[0].setEng(96);	student[0].setMath(100);
		student[1].setName("라이언");	student[1].setKor(100);	student[1].setEng(89);	student[1].setMath(75);
		student[2].setName("어피치");	student[2].setKor(75);	student[2].setEng(80);	student[2].setMath(48);
		
		System.out.println("\n이름\t국어\t영어\t수학\t총점\t 평균\t");
		for(int i=0; i<student.length; i++) {
			System.out.println(student[i].getName() + "\t" + 
					student[i].getKor() + "\t" + 
					student[i].getEng() + "\t" + 
					student[i].getMath() + "\t" + 
					student[i].calTot() + "\t" + 
					student[i].calAvg() + "\t");
		}
		
	}
}
