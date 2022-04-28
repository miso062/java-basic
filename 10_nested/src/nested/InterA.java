package nested;

public interface InterA {
	public void aa();
	public void bb();
}

/*
 * Interface를 사용하는 방법 - 객체 생성 -
 * 
 * 1. implements
 * 		interface가 가지고 있는 모든 메소드 Override
 * 		public class AbstractMain implements InterA{
 * 			public void aa() { ... 구현부 ... }
 * 			public void bb() { ... 구현부 ... }
 * 
 * 		}
 * 
 * 2. Interface를 사용하고 싶은데,, 모든 메소드 Override가 벅찰때...
 * 		Interface를 구현한 다른 class로 객체를 생성한다
 * 		InterA in = new InterAImpl(); 
 * 
 * 3. 익명 클래스를 사용하여 Override
 * 		InterA in = new InterAImpl(){
 * 			public void aa() { ... 구현부 ... }
 * 			public void bb() { ... 구현부 ... }
 * 		}
 * 
 * 4. method를 통해 생성
 * 
 */