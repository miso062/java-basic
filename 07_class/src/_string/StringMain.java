package _string;

public class StringMain {
	public static void main(String[] args) {
		String a = "apple";
		String b = "apple";
		
		if(a==b) 	System.out.println("a와 b의 참조값은 같다");
		else		System.out.println("a와 b의 참조값은 다르다");
		
		if(a.equals(b)) System.out.println("a와 b의 문자열은 같다");
		else			System.out.println("a와 b의 문자열은 다르다");
		System.out.println();
		
		String c = new String("apple");
		String d = new String("apple");
		
		if(c==d) 	System.out.println("c와 d의 참조값은 같다");
		else		System.out.println("c와 d의 참조값은 다르다");
		
		if(c.equals(d)) System.out.println("c와 d의 문자열은 같다");
		else			System.out.println("c와 d의 문자열은 다르다");
		System.out.println();
		
		String e = "오늘 날짜는 " + 2022 + 4 + 22; 
		System.out.println("문자열 = " + e);
		System.out.println("문자열 크기 = " + e.length());
		
		System.out.println("첫번째 문자 = " + e.charAt(0));
		System.out.println("두번째 문자 = " + e.charAt(1));
		System.out.println("세번째 문자 = " + e.charAt(2));
		
		System.out.println("부분 문자열 추출 = " + e.substring(7)); 		// 7번 부터
		System.out.println("부분 문자열 추출 = " + e.substring(7, 11)); 	// 7~11번 이전까지
		
		System.out.println("대문자 변경 = " + "Hello".toUpperCase());
		System.out.println("소문자 변경 = " + "Hello".toLowerCase());
		
		System.out.println("문자열 검색 = " + e.indexOf("짜"));			// 4
		System.out.println("문자열 검색 = " + e.indexOf("날짜"));		// 3
		System.out.println("문자열 검색 = " + e.indexOf("개바부"));		// -1
		System.out.println("문자열 검색 = " + e.indexOf("2"));			// 7
		System.out.println("문자열 검색 = " + e.indexOf("2", 0));		// 7
		System.out.println("문자열 검색 = " + e.indexOf("2", 8));		// 8번 위치부터 찾아라 -> 9
		
		System.out.println("문자열 치환 = " + e.replace("날짜", "일자"));

		
	}
}
