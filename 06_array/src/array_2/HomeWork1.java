package array_2;

import java.util.Scanner;

public class HomeWork1 {
	
	public int checkBall(int[] randNum, int[] userNum) {
		
		int count=0;
		
		for(int i=0; i<randNum.length; i++) {
			for(int j=0; j<randNum.length; j++) {
				if(i!=j && randNum[i] == userNum[j]) {
					count++;
				}
			}
		}
		
		return count;
	}
	
	public int checkStrike(int[] randNum, int[] userNum) {
		int count=0;
		
		for(int i=0; i<randNum.length; i++) {
			if(randNum[i] == userNum[i]) {
				count++;
			}
		}
		
		return count;
		
	}
	
	public int[] getUserNum(String userStr) {
		int[] userNum = new int[3];
		
		for(int i=0; i<userNum.length; i++) {
			userNum[i] = (int)(userStr.charAt(i)-'0');
		}
		
		return userNum; 
	}
	
	public int[] genRandNum() {
		int[] randNum = new int[3];
		
		for(int i=0; i<randNum.length; i++) {
			randNum[i] = (int)(Math.random()*9)+1;
			for(int j=0; j<i; j++) {
				if(randNum[j] == randNum[i]) {
					i--;
					break;
				}
			}
		}
		
		return randNum;
	}

//	BaseBall Game
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		HomeWork1 hw = new HomeWork1();
		
		int[] randNum = new int[3];
		int[] userNum = new int[3];
		
		int count=1, flag=0;
		
		randNum = hw.genRandNum();
		
		
		while(flag==0) {
			
			System.out.print("게임을 실행하시겠습니까(Y/N): ");
			char start = scan.next().charAt(0);
			
			if(start == 'Y' || start == 'y') {
				
				System.out.println("게임을 시작합니다.");
				
				while(true) {
					
					System.out.print("\n숫자 입력: ");
					userNum = hw.getUserNum(scan.next());
					
					if(hw.checkStrike(randNum, userNum) == 3) {
						System.out.println("축하합니다. " + count + "번 만에 맞추셨습니다.");
						flag = 1;
						break;
					}
					else {
						count++;
						System.out.println(hw.checkStrike(randNum, userNum) + "스트라이크 " + hw.checkBall(randNum, userNum) + "볼");
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
