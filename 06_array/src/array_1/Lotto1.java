package array_1;

import java.util.*;

public class Lotto1 {
	public static void main(String[] args) {
		
		int[] lotto = new int[6];
	
//		Generate Lotto Number 1
		for(int i=0; i<lotto.length; i++) {
			int rand = (int)(Math.random()*45)+1;
			if(i>0) {
				for(int j=0; j<i; j++) {
					if(lotto[j] == rand) {
						rand = (int)(Math.random()*45)+1;
						j = 0;
					}
				}
				lotto[i] = rand;
			}
			else
				lotto[i] = rand;
		}
		

//		Generate Lotto Number 2
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45)+1;
			for(int j=0; j<i; j++) {
				if(lotto[j] == lotto[i]) {
					i--;
					break;
				}
			}
		}
		
//		Sort Lotto Number 1
		for(int i=0; i<lotto.length; i++) {
			for(int j=i; j<lotto.length; j++) {
				if(lotto[i] > lotto[j]) {
					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		
				
//		Sort Lotto Number 2 - Use Method
		Arrays.sort(lotto);
		
//		Print Lotto Number
		for(int num: lotto) {
			System.out.printf("%2d ", num);
		}
		System.out.println();

	}
}

