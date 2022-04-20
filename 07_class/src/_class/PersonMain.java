package _class;

class Person {
	
	// field
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setData(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void setData() {}
}

public class PersonMain {
	public static void main(String[] args) {
		
//		# 1
		Person p1 = new Person();
		
		p1.setAge(25);
		p1.setName("홍길동");
//		p.name = "홍길동";
//		p.age = 25;
		
		// package.className@address
		System.out.println("객체 p1 = " + p1);
//		System.out.println(p.name + ", " + p.age);
		System.out.println(p1.getName() + ", " + p1.getAge());
		
//		# 2
		Person p2 = new Person();
		
		p2.setAge(13);
		p2.setName("코난");
		System.out.println("객체 p2 = " + p2);
		System.out.println(p2.getName() + ", " + p2.getAge());
		
//		# 3
		Person p3 = new Person();
		p3.setData("둘리", 1000);
		System.out.println("객체 p3 = " + p3);
		System.out.println(p3.getName() + ", " + p3.getAge());
		
//		# 4
		Person p4 = new Person();
		p4.setData();
		System.out.println("객체 p4 = " + p4);
		System.out.println(p4.getName() + ", " + p4.getAge());
	}
}
