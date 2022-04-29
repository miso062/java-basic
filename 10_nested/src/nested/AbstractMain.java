package nested;

// # 1
//public class AbstractMain implements InterA{
//	
//	public static void main(String[] args) {
//		InterA in = new InterAImpl();
//		in.aa();
//		in.bb();
//	}
//
//	@Override
//	public void aa() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void bb() {
//		// TODO Auto-generated method stub
//		
//	}
//}


// # 2
//public class AbstractMain{
//	
//	public static void main(String[] args) {
//		InterA in = new InterAImpl();
//		in.aa();
//		in.bb();
//	}
//}

// # 3
public class AbstractMain{
	
	public static void main(String[] args) {
		InterA in = new InterAImpl() {
			public void aa() {	System.out.println("aa");	}
			public void bb() {	System.out.println("bb");	}
		};
		
		AbstractTest at = new AbstractTest() {
			// 내부 메소드가 추상 메소드 -> 무조건 Override
			public void setName(String name) {
				this.name = name;
			}
		};
		
		in.aa();
		in.bb();
		
		AbstractExam aa = new AbstractExam() {
//			내부에 추상 메소드가 없기 때문에 재구현은 
//			그냥 하고 싶으면 하고 안하고 싶으면 안해도 됨
		};
	}
}
