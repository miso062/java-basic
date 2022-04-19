package array;

import java.util.Scanner;

public class HomeWork3 {
	public static void main(String[] args) {
		int dec;
		int[] binary = new int[32];
		int i=0;
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("10진수 입력: ");
			dec = scan.nextInt();
			
			if(dec == 0) break;
			if(dec < 0) continue;
			
			for(i=0; dec!=0; i++) {
				binary[i] = dec%2;
				dec = dec/2;
			}
			
			for(int j=i-1; j>=0; j--) {
				System.out.print(binary[j]);
				if(j%4==0) System.out.print(" ");
			}
			System.out.println();
			
		}
		
		System.out.println("프로그램을 종료합니다.");
		scan.close();
	}

}

/*



 */