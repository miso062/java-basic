package inheritance;

class AA {
	protected int a = 3;
	
	public void disp() {
		a +=5;
		System.out.println("AA : " + a + " ");
	}
}

class BB extends AA {
	public int a = 8;
	
	public void disp() {
		this.a += 5;
		System.out.println("BB : " + a + " ");
	}
}

public class TestMain2 {
	public static void main(String[] args) {
		BB aa = new BB();
		aa.disp();
		System.out.println("aa : " + aa.a + "\n");
		
		AA bb = new BB();
		bb.disp(); // method override
		System.out.println("bb : " + bb.a + "\n"); // field(variable)에는 override가 없음
		
		AA cc = new AA();
		cc.disp();
		System.out.println("cc : " + cc.a + "\n");
		
		BB dd = (BB)bb;
//		BB dd = (BB)cc; // error Casting 불가능 (다형성을 사용하지 않아서 메모리에 잡히지 않음)
//		AA cc = new AA() -> AA로 생성했고, AA를 참조함 / 자식이 존재하는지 알 수 없음
//		AA bb = new BB() -> BB로 생성했고, AA까지만 참조함 // 자식이 존재함.
		dd.disp();
		System.out.println("dd : " + dd.a + "\n");
		
	}
}
