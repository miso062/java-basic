package array_1;

import java.util.*;

public class HomeWork1 {
	public static void main(String[] args) {
		
		int[] array, count;
		
		array = new int[100];
		count = new int[26];
		
		
//		# 1
		for(int i=0; i<array.length; i++) {
			array[i] = (int)(Math.random()*26)+65;
			count[array[i]-65]++;
		}
		
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				System.out.print((char)array[(i*10)+j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		for(int i=0; i<9; i++) {
			for(int j=0; j<3; j++) {
//				System.out.println(i*3+j+65); 
				if(((i*3)+j+65) <= 'Z') {
					System.out.print((char)((i*3)+j+65) + "의 개수 = " + count[(i*3)+j] + "\t");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		
//		# 2
		
		for(int i=0; i<array.length; i++) {
			array[i] = (int)(Math.random()*26)+65;
			System.out.print((char)array[i]+ " ");
			
			if((i+1)%10==0) System.out.println();
			
			for(int j='A'; j<='Z'; j++) {
				if(array[i]==j) {
					count[j-'A']++;
				}
			}
		}
		
		Arrays.fill(count, 0);

		System.out.println();
		for(int i=0; i<count.length; i++) {
			System.out.print((char)(i+'A') + "의 개수 = " + count[i] + "\t");
			if((i+1)%3 == 0) System.out.println();
		}
	}
	

}
