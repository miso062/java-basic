package zoo.safari;

import zoo.Zoo;

class SafariTest extends Zoo {
//	protected void giraffe() {
//		System.out.println("하하");
//	}
}

public class Safari extends SafariTest { 
	public static void main(String[] args) {
		
		Zoo z = new Zoo();
		z.tiger();
//		z1.giraffe();
//		protected 접근 제한자는 다른 클래스는 접근하지 못하게 함!
//			- Zoo를 생성한 클래스가 자식인지 아닌지 알수가 없음!
//		Zoo 자체를 생성하면 Zoo 객체를 생성한 클래스가 자식인지 알 수 없어서 사용 불가능
//		자식의 타입으로 객체를 생성해야함!
		
		
		Zoo zst = new SafariTest();
		zst.tiger();
//		zst.giraffe();
		
		SafariTest sts = new Safari();
		sts.tiger();
//		sts.giraffe();
//		오버라이딩 했을 경우 얘는 왜 오류가 아니냐!
//			같은 패키지 내로 옮겨졌기 때문! 자식이 우선순위!
//		    다른 패키지 안에 있는 클래스에 오버라이딩 하면 오류남!
		
		Zoo zs = new Safari();
		zs.tiger();
//		zs.giraffe();
//		다형성 -> 부모의 타입으로 자식 객체를 생성 (부모의 범위만큼만 사용)
//		그렇다면	질문1) 자식 객체인데 왜 protected에 접근할 수가 없을까?
//					  답1) 객체의 타입 자체가 부모의 타입이기 때문에!
//						   자식 타입(혹은 같은 패키지 안에 있는 클래스 타입)으로 생성되어함!
//					질문2) Safari()가 자기 자신이자 자식인데 왜 몰라..?
//					  답2) 현재 클래스에서 Safari()에 접근이 가능한지
//						   또는 Zoo로 형 변환이 되는지만 확인하고 자식인지 아닌지는 구분 못함!
		
		
		
	}
	
}