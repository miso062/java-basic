package array;

public class MultiArray2 {
	public static void main(String[] args) {
		int[][] ar = new int[10][10];
		
//		# 1
//		for(int i=0; i<ar.length; i++) {
//			for(int j=0; j<ar[i].length; j++) {
//				ar[i][j] = (i*10)+j+1;
//			}
//		}
		
//		# 2
//		for(int i=0; i<ar.length; i++) {
//			for(int j=0; j<ar[i].length; j++) {
//				ar[j][i] = (i*10)+j+1;
//			}
//		}
		
//		# 3
//		for(int i=0; i<ar.length; i++) {
//			for(int j=0; j<ar[i].length; j++) {
//				ar[9-j][9-i] = (i*10)+j+1;
//			}
//		}
		
		
		for(int i=0; i<ar.length; i++) {
			for(int j=0; j<ar[i].length; j++) {
				System.out.printf("%4d", ar[i][j]);
			}
			System.out.println();
		}
	}
}
