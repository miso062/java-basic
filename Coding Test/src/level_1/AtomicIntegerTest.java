package level_1;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class AtomicIntegerTest {
	
	private static int count;
	
	public static void main(String[] args) throws InterruptedException {
		int[] a = {4,5,6,7,8,9,4,6,7,7,3,2,4,5,7};
		int[] b = {6,7,1,2,5,9,3,6,5,3,2,1,2,3,5};
		
		System.out.println(IntStream.range(1, 10).map(i -> a[i] + b[i]).sum());
	}
}
