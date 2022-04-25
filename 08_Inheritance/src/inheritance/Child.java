package inheritance;

public class Child extends Super{
	
	private String name;
	private int age;
	
	public Child(String n, int a, double w, double h) {
		this.name = n;
		this.age = a;
		this.weight = w;
		this.height = h;
	}
	
//	Override
	public void display() {
		System.out.println("이름: " + name);
		System.out.println("나이:" + age + "세");
//		this.display();  // Recursion Function - Error
		super.display();
	}
	
	public static void main(String[] args) {
		Child c = new Child("홍길동", 31, 72.8, 183.2);
		c.display();
	}
}
