package loop;

public class _MultiFor {
	public static void main(String[] args) {
		
//		# 1
		int tableNum, i;
//		
//		for(tableNum=2; tableNum<10; tableNum++) {
//			System.out.print(tableNum +"단 -");
//			for(i=1; i<10; i++) {
//				System.out.printf("%2d ", i*tableNum);
//			}
//			System.out.println();
//		}
		
		
//		# 2
		for(i=1; i<10; i++) {
			for(tableNum=2; tableNum<10; tableNum++) {
				System.out.printf("%d * %d = %2d\t", tableNum, i, i*tableNum);
			}
			System.out.println();
		}
		
	}
}
