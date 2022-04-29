package _inheritance;

public class Sub extends Super {
	
	private String name;
	private int age;
	
	public Sub(double wight, double height, String name, int age) {
		super(wight, height);
		this.name = name;
		this.age = age;
	}
	
	public void output() {
		System.out.println("이름: " + name);
		System.out.println("나이:" + age + "세");
	}

	public static void main(String[] args) {
		Super superTest = new Super(52, 163);
		superTest.display();
		System.out.println();
		
		Sub sub1 = new Sub(48, 155, "아이티", 13);
		sub1.output();
		sub1.display();
		
		System.out.println();
		Super sub2 = new Sub(76, 179, "비트", 21);
		sub2.display();
//		sub2.output(); // error
	}
}
