package array;

public class BubbleSort {
	public static void main(String[] args) {
		int ar[] = {40, 78, 36, 55, 50};
		
		System.out.print("정렬 전: ");
		for(int data: ar) {
			System.out.print(data + " ");
		}
		System.out.println();
		
		for(int i=0; i<ar.length-1; i++) {
			for(int j=0; j<ar.length-1-i; j++) {
//				System.out.println(j+ " " + (j+1));
				if(ar[j] > ar[j+1]) {
					int temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
				}
			}
			System.out.print("중간 결과 " + (i+1) + ": ");
			for(int data: ar) {
				System.out.print(data + " ");
			}
			System.out.println();
		}
		
		System.out.print("정렬 후: ");
		for(int data: ar) {
			System.out.print(data + " ");
		}
		
	}
}
