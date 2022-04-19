package loop;

public class HomeWork2 {
	public static void main(String[] args) {
		

//		# 1
		for(int i=0; i<3; i++) {
			for(int j=1; j<10; j++) {
				for(int tableNum=2; tableNum<10; tableNum++) {
					if((tableNum-2) / 3 < i) {
						continue;
					}
					else if((tableNum-2) / 3 == i) {
						System.out.printf("%d * %d = %2d\t", tableNum, j, j*tableNum);
					}
					else {
						break;
					}
				}
				System.out.println();
			}
			System.out.println();	
		}
		
//		# 2
		
		for(int i=2; i<9; i+=3) {
			for(int j=1; j<10; j++) {
				for(int dan=i; dan<(i+3); dan++) {
					if(dan<10) {
						System.out.print(dan + "*" + j + "=" + (dan*j) + "\t");
					}
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}