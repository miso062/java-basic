package array;

public class Lotto {
	public static void main(String[] args) {
		int[] lotto = new int[6];
		
//		Generate Lotto Number 
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
		
//		Sort Lotto Number
		for(int i=0; i<lotto.length; i++) {
			for(int j=i; j<lotto.length; j++) {
				if(lotto[i] > lotto[j]) {
					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		
//		Print Lotto Number
		System.out.print("로또 번호: ");
		for(int num: lotto) {
			System.out.print(num + " ");
		}
	}
}
