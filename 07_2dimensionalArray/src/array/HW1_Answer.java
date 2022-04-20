package array;

import java.io.IOException;
import java.util.Scanner;

public class HW1_Answer {
	public static void main(String[] args) throws IOException {
		char yn; 
		int[] com = new int[3];
		int[] user = new int[3];
		int strike, ball, count=1;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.print("게임을 실행하시겠습니까(Y/N): ");
			yn = scan.next().charAt(0);
//			yn = System.in.read();
			
		}while(yn!='Y' && yn!='y' && yn!='N' && yn !='n');
		
		if(yn!='Y' || yn!='y') {
			System.out.println("\n게임을 시작합니다.");
			
			for(int i=0; i<com.length; i++) {
				com[i] = (int)(Math.random()*9)+1;
				for(int j=0; j<i; j++) {
					if(com[i] == com[j]) {
						i--;
						break;
					}
				}
			}
//			System.out.println(com[0] + " | " +com[1] + " | " +com[2]);
			
			while(true) {
				System.out.print("\n숫자 입력: ");
				for(int i=0; i<user.length; i++) {
					user[i] = System.in.read()-'0';
				}
				System.in.read();
				System.in.read();
				
				strike = ball =0;
				for(int i=0; i<com.length; i++) {
					for(int j=0; j<user.length; j++) {
						if(com[i] == user[j]) {
							if(i == j) strike++;
							else ball++;
						}
					}
				}
				
				System.out.println(strike + "스트라이크  " + ball + "볼\n");
				if(strike == 3) {
					System.out.println("🎉🎉축하합니다! " + count + "번 만에 맞추셨습니다!");
					break;
				}
				count++;
			}
			
			
		}
		else {
			System.out.println("프로그램을 종료합니다.");
		}
		scan.close();
	}
}
