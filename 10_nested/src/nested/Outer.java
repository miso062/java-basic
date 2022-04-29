package nested;

public class Outer {
	private String name;
	
	public void outer() {
		Inner in = new Inner();
		System.out.println("이름: " + /*this.*/name + "\t나이: " + in.age);
	}
	
	class Inner {
		private int age;
		public void display() {
			System.out.println("이름: " + /*Outer.this.*/name + "\t나이: " + /*this.*/age);
		}
	}
	
	public static void main(String[] args) {
		Outer out = new Outer();
		out.name = "홍길동";
		System.out.println("이름: " + out.name);
		
		Outer.Inner in = out.new Inner();
		in.age = 25;
		in.display();
		
		Outer.Inner in2 = out.new Inner();
		in2.age = 30;
		in2.display();
//		in2.name = "코난";     // 불가능
//								  class 내에서만 사용가능 (main은 static영역 -> this가 사용 불가능)
		
//		완전히 새로운 Outer 객체의 Inner를 만들고 싶다면?!
		Outer.Inner in3 = new Outer().new Inner();
		in3.age=35;
		in3.display();
	}
}
