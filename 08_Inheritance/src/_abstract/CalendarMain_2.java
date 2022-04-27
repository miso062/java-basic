package _abstract;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

class CalendarTest_2 {
	int year, month;
	
	// 생성자를 통한 입력
	public CalendarTest_2() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("년도 입력: ");
		year = scan.nextInt();
		
		System.out.print("월 입력: ");
		month = scan.nextInt();
		
		scan.close();
	}
	
	public int[] calc() {
//		Calendar cal = Calendar.getInstance();
		Calendar cal = new GregorianCalendar();		// 날짜생성기준 - 시스템 날짜
				
//		기준을 원하는 날짜로 변경
		cal.set(year, month-1, 1);
		
		int[] sfDay = new int[2];
		sfDay[0] = cal.get(Calendar.DAY_OF_WEEK)-1;
		sfDay[1] = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		return sfDay;
	}
	
	public void display() {
		int[] sfDay = calc();
		
		System.out.println("\n일 월 화 수 목 금 토");
		
		for(int i=1; i<sfDay[0]; i++) {
			System.out.print("   ");
		}
		for(int i=1; i<=sfDay[1]; i++) {
			System.out.print(String.format("%2d", i) + " ");
			if(sfDay[0]%7==0) System.out.println();
			sfDay[0]++;
		}
		
//		for(int i=0; i<5; i++) {
//			for(int j=1; j<8; j++) {
//				if( (j+(i*7)) <= sfDay[1]+sfDay[0]) {
//					if(j+(i*7)-sfDay[0] <= 0) {
//						System.out.print("   ");
//					}
//					else	System.out.print(String.format("%2d", (j+(i*7))-(sfDay[0])) + " ");
//				}
//			}
//			System.out.println();
//		}
	}
}

public class CalendarMain_2 {
	public static void main(String[] args) {
		CalendarTest_2 ct = new CalendarTest_2();
		ct.display();		
	}
}
