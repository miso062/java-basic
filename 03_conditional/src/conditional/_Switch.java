package conditional;

import java.util.Scanner;

public class _Switch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
//		# 1
		System.out.print("월 입력: ");
		int month = scan.nextInt();
		int days;
		
		if(month == 1) days = 31;
		else if(month == 2) days = 28;
		
		switch(month){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			days = 31;
			break;
		case 2:
			days = 28;
		default:
			days = 30;
		}
		System.out.println(month + "월은 " + days + "일 입니다.\n");
		
//		# 2
		int num1, num2;
		char oper;
		
		System.out.print("첫번째 데이터: ");
		num1 = scan.nextInt();
		System.out.print("연산자 입력: ");
		oper = scan.next().charAt(0);
		System.out.print("두번째 데이터: ");
		num2 = scan.nextInt();
		
		switch(oper) {
		case '+':
			System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
			break;
		case '-':
			System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
			break;
		case '*':
			System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
			break;
		case '/':
			System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
			break;
		default:
			System.out.println("연산자 에러");
			
		scan.close();
		}
	}

}
