package array;

import java.util.Scanner;

public class HomeWork2 {
	public static void main(String[] args) {
		int num;
		int[] binaryNum = new int[100];
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			int i=0, count=0;
			System.out.print("10진수 입력: ");
			num = scan.nextInt();
			
			if(num == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			else if(num < 0) {
				System.out.println();
				continue;
			}
			else {
				while(num > 0) {
					binaryNum[i] = num%2;
					num /= 2;
					i++;
				}
				i--;

				if(((i+1)%4) != 0) {
					for(int j=4-((i+1)%4); j>0; j--) {
						System.out.print("0");
						count++;
					}
				}
				for(; i>=0; i--) {
					if(count%4 == 0 && count/4 > 0) {
						System.out.print(" ");
					}
					System.out.print(binaryNum[i]);
					count++;
				}
			}
			System.out.println("\n");
		}
		scan.close();
	}

}