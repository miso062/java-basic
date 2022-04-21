package _constructor;

public class Constructor {
	
	private String name;
	private int age;
	
	public Constructor() {
		System.out.println("this = " + this);
		System.out.println("기본생성자~\n");
	}
	
	public Constructor(String name) {
		System.out.println("this = " + this);
		this.name = name;
	}
	
	public Constructor(int age) {
		this("네오");
		System.out.println("this = " + this);
		this.age = age;
	}
	
	public Constructor(String name, int age) {
//		Overload된 다른 생성자를 호출 / 단, 첫번째 줄에서만 호출 가능
		this(name);
		
		System.out.println("this = " + this);
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}
