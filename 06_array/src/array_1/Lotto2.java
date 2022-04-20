package array_1;

import java.util.Scanner;
import java.util.Arrays;

public class Lotto2 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		int[] lotto = new int[6];
		int money=0, count=0;
		
		System.out.print("돈 입력: ");
		money = scan.nextInt();
		System.out.println("\n       <로또번호>   ");
				
		for(; money>0; money-=1000) {			
//			Generate Lotto Number 2
			for(int i=0; i<lotto.length; i++) {
				lotto[i] = (int)(Math.random()*45)+1;
				for(int j=0; j<i; j++) {
					if(lotto[j] == lotto[i]) {
						i--;
						break;
					}
				}
			}
					
//			Sort Lotto Number 2 - Use Method
			Arrays.sort(lotto);
			
//			Print Lotto Number
			for(int num: lotto) {
				System.out.printf("%3d ", num);
			}
			System.out.println();
			count++;
			if(count%5==0) {
				System.out.println();
			}
			
		}
		
		scan.close();
	}
}