package _abstract;

import java.text.*;
import java.util.*;

public class Today {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) throws ParseException {
//		# 1 - get date
		Date data = new Date();
		System.out.println("오늘 날짜: " + data + "\n");
		
//		# 2 change date format
//		SimpleDateFormat sdf = new SimpleDateFormat();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH:mm:ss");
		System.out.println(" 오늘 : " + sdf.format(data));
		
//		# 3 get birthday
		SimpleDateFormat input = new SimpleDateFormat("yyyyMMddHHmmss");
		Date birth = input.parse("19930426052015");
//		System.out.println(birth);
		System.out.println("내생일: " + sdf.format(birth));
		
//		# 4
//		Calendar cal = new Calendar(); // error, abstract class
//		Calendar cal = new GregorianCalendar(); // 현재 시스템 날짜가 기준
		Calendar cal = Calendar.getInstance();
//		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("Canada/Pacific"));
		int year = cal.get(Calendar.YEAR); // == cal.get(1) / 상수 사용
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int week = cal.get(Calendar.DAY_OF_WEEK); // 일-1, 월-2, 화-3, ~~, 토-7
		
		String dayOfWeek = null;
		switch(week) {
		case 1: dayOfWeek="일"; break;
		case 2: dayOfWeek="월"; break;
		case 3: dayOfWeek="화"; break;
		case 4: dayOfWeek="수"; break;
		case 5: dayOfWeek="목"; break;
		case 6: dayOfWeek="금"; break;
		case 7: dayOfWeek="토"; break;
		}
		
		System.out.println(" 오늘 : " +year+"년 " + month+"월 " + day +"일");
		System.out.println();
	}
}
