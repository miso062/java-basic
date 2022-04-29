package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionMain2 {
	
	int tableNum=0;
//	NumberFormatException, IOException 두 개의 예외가 있음 
//	IOExeption은 NumberFormatException의 부모이므로 IOExeption만 던져줘도 된다
//	모든 예외의 부모 -> Exception
	public static void main(String[] args) throws IOException, MakeException{
			
		ExceptionMain2 em = new ExceptionMain2();
		em.input();
		em.output();
	}
	
	public void input() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("원하는 단을 입력: ");
		tableNum = Integer.parseInt(br.readLine());
	}
	
	public void output() throws MakeException {
		
		if(tableNum > 9 || tableNum < 2) {
//			System.out.println("범위초과");
//			개발자가 강제로 Exception을 발생하는것
			try {
				throw new MakeException("범위초과");
			}catch(MakeException e) {
				e.printStackTrace();
			}
		}
		else {
			for(int i=1; i<10; i++) {
				System.out.println(tableNum + "*" + i + "=" + (tableNum*i) );
			}
		}
	}
}
