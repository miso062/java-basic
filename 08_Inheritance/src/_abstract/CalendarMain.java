package _abstract;

import java.util.Calendar;
import java.util.Scanner;

class CalendarTest{
	private int year, month;
	
	public CalendarTest(int year, int month) {
		this.year = year;
		this.month = month;
	}
	
	public int[] calc() {
		int[] sfDay = new int[2];
		
		Calendar cal = Calendar.getInstance();
//		cal.set(Calendar.YEAR, year);
//		cal.set(Calendar.MONTH, month);
		cal.set(year, month-1, 1);
		
		sfDay[0] = cal.get(Calendar.DAY_OF_WEEK)-1;
		sfDay[1] = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
//		System.out.println(cal.get(Calendar.DAY_OF_WEEK) + " " + cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		
		return sfDay;
	}
	
	public void display() {
		int[] sfDay = calc();
		
		System.out.println("\n일 월 화 수 목 금 토");
		
		for(int i=0; i<5; i++) {
			for(int j=1; j<8; j++) {
//				System.out.print(j+(i*7)+1 + " ");
				if( (j+(i*7)) <= sfDay[1]+sfDay[0]) {
					if(j+(i*7)-sfDay[0] <= 0) {
						System.out.print("   ");
					}
					else	System.out.print(String.format("%2d", (j+(i*7))-(sfDay[0])) + " ");
				}
			}
			System.out.println();
		}
	}
}

public class CalendarMain {
	public static void main(String[] args) {
		int year, month;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("년도 입력: ");
		year = scan.nextInt();
		
		System.out.print("월 입력: ");
		month = scan.nextInt();
		
		CalendarTest ct = new CalendarTest(year, month);
		ct.display();
	}
}
