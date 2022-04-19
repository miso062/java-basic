package loop;

import java.util.Scanner;

public class _While {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int i=0, j=0;
		
//		# 1
		while(i<10) {
//			System.out.println(i+1);
			i++;
		}
		
//		# 2
		do {
//			System.out.println(j+1);
			j++;
		}while(j<10);
		
//		# 3 Number Game
		int randNum, num, count=1, flag=0;
		char exit;
		
		
		while(true) {
			
			if(flag == 0) break;
			
			randNum = (int)(Math.random()*100)+1;
			System.out.println(randNum+"***1~100 사이의 난수를 발생하였습니다.***");
			
			while(true) {
				
				System.out.print("숫자 입력: ");
				num = scan.nextInt();
				
				if(num > randNum) {
					System.out.println(num + "보다 작습니다\n");
				}
				else if(num < randNum) {
					System.out.println(num + "보다 큽니다\n");
				}
				else{
					System.out.println("딩동댕~🎶😀🎶😀 " + count + "번만에 맞추셨습니다.\n");
					count = 1;
					break;
				}
				count++;
			}
			
			
			while(flag == 1) {
				System.out.print("계속하시겠습니까? (Y/N): ");
				exit = scan.next().charAt(0);
				
				if(exit == 'n' || exit == 'N') {
					System.out.println("프로그램을 종료합니다.\n");
					flag = 0;
				}
				else if(exit == 'y' || exit == 'Y') {
					System.out.println("계속\n");
					break;
				}
				else {
					System.out.println("잘못된 입력입니다.\n");
				}
			}
		}
		
//		# 4
		char ch = 'A';
		count = 0;
		
		do {
			System.out.print(ch + " ");
			ch++;
			count++;
			if(count%7==0) {
				System.out.println();
			}
			
		}while(ch < 'Z');
		
//		# 5
		int p=1;
		
		while(true) {
			System.out.print("\n숫자 입력: ");
			num = scan.nextInt();
			
			if(num == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			if(num < 0) {
				continue;
			}
			
			for(i=0; i<num; i++) {
				p *= (i+1);
			}
			System.out.println(num + "! = " + p);
			p = 1;
			
		}
		
		
		
		scan.close();
		
	}
}
