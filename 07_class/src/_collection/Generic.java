package _collection;

class GenericTest<T> {
	private T a;
	public void setA(T a) {
		this.a = a;
	}
	public T getA() {
		return a;
	}	
}

public class Generic{
	public static void main(String[] args) {
		GenericTest<Integer> gt1 = new GenericTest<Integer>();
		gt1.setA(25);
		System.out.println("나이 = " + gt1.getA());
		
		GenericTest<String> gt2 = new GenericTest<String>();
		gt2.setA("홍길동");
		System.out.println("이름 = " + gt2.getA());
	}
}
