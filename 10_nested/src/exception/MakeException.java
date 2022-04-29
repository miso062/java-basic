package exception;

// 개발자가 만드는 Eception 클래스
@SuppressWarnings("serial")
public class MakeException extends Exception { 
	@SuppressWarnings("unused")
	private String errorMasg;	
	
	public MakeException() {	}

	public MakeException(String errorMasg) {
		super();
		this.errorMasg = errorMasg;
	}
	
}
