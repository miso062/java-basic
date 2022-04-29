package _inheritance;

class Test2 extends Object {
	
}

class Sample {
	@Override
	public String toString() {
		return getClass() + "@개바부~🐶💩";
	}
}

public class ObjectMain {
	
	public static void main(String[] args) {
		Test2 t = new Test2();
		System.out.println("객체 t = " + t); // 클@16진수, 내부적으로 toString을 call하고 있음!
		System.out.println("객체 t = " + t.toString());
		System.out.println("객체 t = " + t.hashCode()); // 10진수로 표현
		System.out.println();
		
		Sample s = new Sample();
		System.out.println("객체 s = " + s.toString());
		System.out.println();

//		String class에서 toString과 equals가 재정의(Overriding) 됨
		
		String str = "apple";
		String text = new String("apple");
		System.out.println("객체 str = " + str);
		System.out.println("str == text: " + (str == text));			// 주소 비교
		System.out.println("str.equals(text): " + str.equals(text));		// 문자열 비교
		System.out.println();
		
		Object ob = new Object();
		Object ob2 = new Object();
		System.out.println("ob == ob2: " + (ob == ob2));			// 주소 비교
		System.out.println("ob.equals(ob2): " + ob.equals(ob2));		// 주소 비교
	}
}