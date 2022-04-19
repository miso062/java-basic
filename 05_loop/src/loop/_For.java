package loop;

import java.io.IOException;
import java.util.Scanner;

public class _For {
	public static void main(String[] args) throws IOException {
		
//		# 1
		for(int i=10; i>0; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for(char c='A'; c<'Z'; c++) {
			System.out.print(c + " ");
		}
		System.out.println();
		System.out.println();
		
//		# 2
		int sum=0, mul=1;
		System.out.println("i\tsum\tmul");
		for(int i=0; i<10; i++) {
			sum += (i+1);
			mul *= (i+1);
			System.out.println((i+1) + "\t" + sum + "\t" + mul);
		}
		
//		# 3     Multiplication-Table
		Scanner scan = new Scanner(System.in);
		System.out.print("\n원하는 단을 입력: ");
//		int tableNum = scan.nextInt();
		int tableNum = System.in.read()-'0';
		
		if(tableNum >1 && tableNum<10) {
			for(int i=1; i<10; i++) {
				System.out.println(tableNum + " * " + i + " = " + (tableNum*i));
			} 
		}
		else {
			System.out.println("범위 초과");
		}
		
//		# 4 
		System.out.print("\n숫자 입력: ");
		int num = scan.nextInt();
		boolean flag = true;
		
		for(int i=1; i<num+1; i++) {
			if(num%i == 0) {
				System.out.print(i + " ");
				if(i>1 && i< num) {
					flag = false;
				}
			}
		}
		System.out.println();
		
		if(flag) System.out.println("소수이다\n");
		else 	 System.out.println("소수가 아니다\n");
		
//		# 5
		int x, y, ans=1;
		
		System.out.print("x 입력: ");
		x = scan.nextInt();
		System.out.print("y 입력: ");
		y = scan.nextInt();
		
		for(int i=1; i<=y; i++) {
			ans *= x;  
		}
		
		System.out.println(x + "의 " + y + "승은 " + ans);
		
		scan.close();
	}
}
