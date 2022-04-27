package _class;

class StaticTest{
	private int a;
	// 생성자를 통한 초기화가 불가능
	static int b;
	
//	Constructor - 객체의 초기화를 담당
	public StaticTest(){
		System.out.println("StaticTest의 기본생성자");
		
	}
	
	static {
		System.out.println("Static 초기화 영역");
		b=3;
	}
	
	public void calc() {
		a++;
		b++;
	}
	
	public void disp() {
		System.out.println("a = " + a + " | b = " + b);
	}
	
	public static void output() {
		System.out.println("static method...");
		System.out.println(b);
//		System.out.println("a = " + a + " | b = " + b);
	}
}

public class StaticMain {
	public static void main(String[] args) {
		System.out.println(StaticTest.b);
//		StaticTest st1 = new StaticTest();
//		st1.calc();
//		st1.disp();
//		System.out.println();
//		
//		StaticTest st2 = new StaticTest();
//		st2.calc();
//		st2.disp();
//		System.out.println();
//		
//		StaticTest st3 = new StaticTest();
//		st3.calc();
//		st3.disp();
//		System.out.println();
		
//		a는 고정값 | b는 계속 증가
	}
}
