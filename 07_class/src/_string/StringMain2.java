package _string;

import java.util.Scanner;

public class StringMain2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		StringMain2 sm = new StringMain2();
		
		String str, corr, change;
		int count=0;
		
		
		System.out.print("문자열 입력: ");
		str = scan.next();
		str = str.toLowerCase();
		System.out.print("현재 문자열 입력: ");
		corr = scan.next();
		corr = corr.toLowerCase();
		System.out.print("바꿀 문자열 입력: ");
		change = scan.next();
		change = change.toLowerCase();
		
		if(str.length() < corr.length()){
			System.out.println("\n입력한 문자열의 크기가 더 작습니다");
			System.out.println("치환할 수 없습니다.");
		}
		else {
			while(str.indexOf(corr) != -1) {
				str = str.replaceFirst(corr, change);
				count++;
			}
			
			System.out.println();
			System.out.println(str);
			System.out.println(count + "번 치환");
		}
		
		scan.close();
	}
}
