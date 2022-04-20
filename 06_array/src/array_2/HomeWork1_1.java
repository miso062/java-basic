package array_2;

import java.util.Scanner;

public class HomeWork1_1 {
		
//	BaseBall Game
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] randNum = new int[3];
		int[] userNum = new int[3];
		
		int count=1, flag=0, strike=0, ball=0;
		String userStr;
		
		for(int i=0; i<randNum.length; i++) {
			randNum[i] = (int)(Math.random()*9)+1;
			for(int j=0; j<i; j++) {
				if(randNum[j] == randNum[i]) {
					i--;
					break;
				}
			}
			System.out.print(randNum[i]);
		}
		
		System.out.println();
		
		
		while(flag==0) {
			
			System.out.print("게임을 실행하시겠습니까(Y/N): ");
			char start = scan.next().charAt(0);
			
			if(start == 'Y' || start == 'y') {
				
				System.out.println("게임을 시작합니다.");
				
				while(true) {
					
					System.out.print("\n숫자 입력: ");
					userStr = scan.next();
					
					for(int i=0; i<userNum.length; i++) {
						userNum[i] = (int)(userStr.charAt(i)-'0');
					}
					
					for(int i=0; i<randNum.length; i++) {
						if(randNum[i] == userNum[i]) {
							strike++;
						}
					}
					
					for(int i=0; i<randNum.length; i++) {
						for(int j=0; j<randNum.length; j++) {
							if(i!=j && randNum[i] == userNum[j]) {
								ball++;
							}
						}
					}
					
					if(strike == 3) {
						System.out.println("축하합니다." + count + "번 만에 맞추셨습니다.");
						flag = 1;
						break;
					}
					else {
						count++;
						
						System.out.println(strike + "스트라이크 " + ball + "볼");
						strike = 0;
						ball = 0;
					}
				}
				
			}else if(start == 'N' || start == 'n'){
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				System.out.println("잘못된 입력입니다.\n");
				continue;
			}
		}
		scan.close();
	}
}
