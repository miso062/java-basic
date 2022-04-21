package _constructor;

public class ConstructorMain {
	public static void main(String[] args) {
		
		Constructor con1 = new Constructor();
		
		System.out.println("객체 con1 = " + con1);
		System.out.println(con1.getName()+" "+con1.getAge());
		System.out.println();
		
		Constructor con2 = new Constructor("홍길동");
		System.out.println("객체 con2 = " + con2);
		System.out.println(con2.getName()+" "+con2.getAge());
		System.out.println();
		
		Constructor con3 = new Constructor(25);
		System.out.println("객체 con3 = " + con3);
		System.out.println(con3.getName()+" "+con3.getAge());
		System.out.println();
		
		Constructor con4 = new Constructor("홍길동", 30);
		System.out.println("객체 con4 = " + con4);
		System.out.println(con4.getName()+" "+con4.getAge());
		System.out.println();
	}
}
