package array;

import java.util.Scanner;

public class _Array {
	public static void main(String[] args) {
		
		
//		# 1
		int[] array = new int[5];
		
		System.out.println("배열 = " + array);
		array[0] = 25;
		array[1] = 35;
		array[2] = 43;
		array[3] = 26;
		array[4] = 78;
		
		for(int i=0; i<array.length; i++) {
			System.out.println("array[" + i + "] = " + array[i]);
		}
		
//		# 2
		System.out.println();
		for(int i:array) {
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
		
//		# 3   setting argument
		System.out.println();
		for(String s: args) {
			System.out.print(s + "\t");
			System.out.println(s.length());
		}
		
//		# 4
		Scanner scan = new Scanner(System.in);
//		System.out.print("\n문자열 입력: ");
//		String str = scan.nextLine();
//		
//		System.out.println("가운데 문자 = " + str.charAt(str.length()/2));
		
//		# 5
		int[] ar;
		int sum=0, size, max=0, min=0;
		System.out.print("\n배열의 크기 입력: ");
		size = scan.nextInt();
		
		ar = new int[size];
		
		System.out.println();
		for(int i=0; i<ar.length; i++) {
			System.out.print("ar[" + i + "]의 값을 입력: ");
			ar[i] = scan.nextInt();
			sum += ar[i];
			if(i==0) {
				max = ar[i];
				min = ar[i];
			}
			else {
				if(max < ar[i]) {
					max = ar[i];
				}
				if(min > ar[i]) {
					min = ar[i];
				}
			}
		}
		
		System.out.println("\n총 합은 " + sum + "입니다.");
		System.out.println("최고값은 " + max + "입니다.");
		System.out.println("최저값은 " + min + "입니다.");
		
		scan.close();
	}
}
