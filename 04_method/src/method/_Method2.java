package method;

public class _Method2 {
	
	public int sum(int num1, int num2)		{	return num1+num2;			}	
	public int sub(int num1, int num2) 	 	{	return num1-num2;			}
	public int mul(int num1, int num2) 	 	{	return num1*num2;			}
	public double div(int num1, int num2) 	{	return (double)num1/num2;	}
	
	public static void main(String[] args){
		_Method2 _method = new _Method2();
		
		int num1, num2;
		num1 = 10; num2 = 20;
		
		System.out.println(_method.sum(num1, num2));
		System.out.println(_method.sub(num1, num2));
		System.out.println(_method.mul(num1, num2));
		System.out.println(_method.div(num1, num2));		
		
	}
}
