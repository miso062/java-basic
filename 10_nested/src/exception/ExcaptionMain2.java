package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class ExcaptionMain2 {
//	NumberFormatException, IOException 두 개의 예외가 있음 
//	IOExeption은 NumberFormatException의 부모이므로 IOExeption만 던져줘도 된다
//	모든 예외의 부모 -> Exception
	public static void main(String[] args) throws IOException {
			
		ExcaptionMain2 em = new ExcaptionMain2();
		em.output();
	}
	
	public int input() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("원하는 단을 입력: ");
		int tableNum = Integer.parseInt(br.readLine());
		return tableNum;
	}
	
	public void output() throws IOException {
		int tableNum = input();
		
		for(int i=1; i<10; i++) {
			System.out.println(tableNum + "*" + i + "=" + (tableNum*i) );
		}
	}
}
