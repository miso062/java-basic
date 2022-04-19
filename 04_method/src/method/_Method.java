package method;

public class _Method {
	
	int sum1(int num1, int num2){
			int sum = num1 + num2;	
			return sum;	
	}
	
	static int sum2(int num1, int num2){
		int sum = num1 + num2;	
		return sum;	
	}

	public static void main(String[] args){
		int num1, num2;
		num1 = 10; num2 = 20;

		_Method _method = new _Method();                         // 1번 호출 (객체선언)
		System.out.println(_method.sum1(num1, num2));                        
                                                                      
		System.out.println(new _Method().sum1(num1, num2));      // 2번 호출
		
		System.out.println(sum2(num1, num2));     				 // static method 호출
	}

}
