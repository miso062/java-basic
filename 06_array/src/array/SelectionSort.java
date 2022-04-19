package array;

public class SelectionSort {
	public static void main(String[] args) {
		int ar[] = {40, 78, 36, 55, 50};
		
		System.out.print("정렬 전: ");
		for(int data: ar) {
			System.out.print(data + " ");
		}
		System.out.println();
		
		for(int i=0; i<ar.length; i++) {
			for(int j=i; j<ar.length; j++) {
//				System.out.println(i + " " + j);
				if(ar[i] > ar[j]) {
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
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
