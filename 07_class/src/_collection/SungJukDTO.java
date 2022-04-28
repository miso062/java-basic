package _collection;

public class SungJukDTO implements Comparable<SungJukDTO>{
	
	private String name;
	private int no, kor, eng, math, tot;
	private double avg;
	
	public SungJukDTO(String name, int no, int kor, int eng, int math) {
		super();
		this.name = name;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setNo(int no) {
		this.no = no;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	public int getNo() {
		return no;
	}
	public int getKor() {
		return kor;
	}
	
	public int getEng() {
		return eng;
	}	
	public int getMath() {
		return math;
	}
		
	public int getTot() {
		tot = kor + eng + math;
		return tot;
	}
	public double getAvg() {
		avg = tot/3.0;
		return avg;
	}
	
	public String toString() {
//		return name;
		getTot();
		getAvg();
		return no + "\t" + name + "\t" + 
				kor + "\t" + eng + "\t" + math + "\t" + 
				tot + "\t" + String.format("%.2f", avg) + "\t";
	}
	
	@Override
	public int compareTo(SungJukDTO o) {
		return this.name.compareTo(o.name);
	}
}
