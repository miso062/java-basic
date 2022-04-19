package array;

import java.util.Arrays;

public class _Array {
	public static void main(String[] args) {
		int[] arr = new int[3];
		
		System.out.println(arr.length);
		
		arr[0] = 10;
		arr[1] = 9;
		arr[2] = 12;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		Arrays.sort(arr);
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
	}
}
