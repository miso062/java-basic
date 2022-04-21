package array_2;

public class MultiArray4 {
	public static void main(String[] args) {
		int[][] ar = {{1, 2, 3, 0}, {4, 5, 6, 0}, {7, 8, 9, 0}, {0, 0, 0, 0}};
		
//		# 1
//		for(int i=0; i<ar.length; i++) {
//			for(int j=0; j<ar[i].length; j++) {
//				if(j<ar[i].length-1) {
//					ar[i][3] += ar[i][j];
//				}
//				if(i == ar.length-1) {
//					for(int z=0; z<ar[i].length-1; z++) {
////						System.out.print(ar[z][j] + " ");
//						ar[i][j] += ar[z][j];
//					}
//				}
//			}
//		}
		
//		# 2
		for(int i=0; i<ar.length-1; i++) {
			for(int j=0; j<ar[i].length-1; j++) {
				ar[i][3] += ar[i][j];
				ar[3][j] += ar[i][j];
				ar[3][3] += ar[i][j];
			}
		}
		
		for(int i=0; i<ar.length; i++) {
			for(int j=0; j<ar[i].length; j++) {
				System.out.printf("%3d ", ar[i][j]);
			}
			System.out.println();
		}
	}
}
