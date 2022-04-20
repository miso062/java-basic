package _class;

class Grade{
	
	private String name;
	private int kor, eng, math, tot;
//	private int[] score = new int[4];
	private double avg;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	public int calTot() {
		this.tot = this.kor + this.eng + this.math;
		return this.tot;
	}
	
	public String calAvg() {
		this.avg = this.tot/3.0;
		return String.format("%.2f", avg);
	}
	
}

public class GradeMain {
	public static void main(String[] args) {
		
		Grade hong = new Grade();
		Grade lion = new Grade();
		Grade apeach = new Grade();
			
		System.out.println("이름\t국어\t영어\t수학\t총점\t 평균\t");
		
		hong.setName("홍길동");
		hong.setKor(90);
		hong.setEng(96);
		hong.setMath(100);
		System.out.println(hong.getName() + "\t" + 
							hong.getKor() + "\t" + 
							hong.getEng() + "\t" + 
							hong.getMath() + "\t" + 
							hong.calTot() + "\t" + 
							hong.calAvg() + "\t");
		
		lion.setName("라이언");
		lion.setKor(100);
		lion.setEng(89);
		lion.setMath(75);
		System.out.println(lion.getName() + "\t" + 
							lion.getKor() + "\t" + 
							lion.getEng() + "\t" + 
							lion.getMath() + "\t" + 
							lion.calTot() + "\t" + 
							lion.calAvg() + "\t");
		
		apeach.setName("어피치");
		apeach.setKor(75);
		apeach.setEng(80);
		apeach.setMath(48);
		System.out.println(apeach.getName() + "\t" + 
							apeach.getKor() + "\t" + 
							apeach.getEng() + "\t" + 
							apeach.getMath() + "\t" + 
							apeach.calTot() + "\t" + 
							apeach.calAvg() + "\t");
	}
}