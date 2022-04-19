package array;

import java.util.Scanner;

public class HomeWork1 {
	
//	BaseBall
	
	public static void main(String[] args) {
		int[] randNum = new int[3];
		String randNumber = "", userNumber;
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<randNum.length; i++) {
			randNum[i] = (int)(Math.random()*9)+1;
			for(int j=0; j<i; j++) {
				if(randNum[j] == randNum[i]) {
					i--;
					break;
				}
			}
		}
		for(int i=0; i<randNum.length; i++) {
			randNumber += randNum[i];
		}
		
		while(true) {
			System.out.print("게임을 실행하시겠습니까(Y/N): ");
			char start = scan.next().charAt(0);
			if(start == 'Y' || start == 'y') {
				while(true) {
					System.out.print("숫자 입력: ");
					userNumber = scan.next();
				}
			}
			else if(start == 'N' || start == 'n'){
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			else {
				System.out.println("잘못된 입력입니다.\n");
				continue;
			}
			
		}
	}
}
