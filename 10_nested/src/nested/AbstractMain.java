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
		in.aa();
		in.bb();
	}
}
