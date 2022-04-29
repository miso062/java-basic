package exception;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ExceptionMain{
	public static void main(String[] args) throws IOException{
		if(args.length >= 1) {
				System.out.println("args[0] = " + args[0]);
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.print("정수 입력: ");
			String a = br.readLine();
			System.out.print("정수 입력: ");
//			문자가 한 개 입력될 때에만 변경 가능
			Integer b = Integer.parseInt(br.readLine());
			System.out.print("정수 입력: ");
			int c = Integer.parseInt(br.readLine());
			System.out.println();
			System.out.println("정수1: " + a + " | 정수1 형식: " + a.getClass().getName() +  
							 "\n정수2: " + b + " | 정수2 형식: " + b.getClass().getName());
			System.out.println(a + " / " + b + " = " + b/c);
		}catch(IOException e) {
			e.printStackTrace();
		}catch(ArithmeticException e) {
			System.out.println("영으로는 나눌 수 없음");
		}catch(NumberFormatException e) {
			System.out.println("숫자만 입력해죠..ㅜ");
		}finally {
			System.out.println("error가 있든 없든! 처리해죠!");
		}
	}
}
