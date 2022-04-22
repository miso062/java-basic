package _string;

import java.util.Scanner;

public class StringBufferMain {
	
	public int input() {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("원하는 단을 입력: ");
		return scan.nextInt();
		
	}
	
	public void output() {
//		int tableNum = input();
//		
//		for(int i=1; i<10; i++) {
//			System.out.println(tableNum + " * " + i + " = " + (tableNum*i));
//		}
		StringBuffer buffer = new StringBuffer();
		int tableNum = input();
		
		for(int i=1; i<10; i++) {
			buffer.append(tableNum);
			buffer.append(" * ");
			buffer.append(i);
			buffer.append(" = ");
			buffer.append(tableNum*i);
			
			System.out.println(buffer);
			buffer.delete(0, buffer.length());
		}
	}

	public static void main(String[] args) {
		StringBufferMain sb = new StringBufferMain();
		sb.output();
	}
}
