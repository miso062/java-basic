package _collection;

import java.util.*;

public class MapMain {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("book101", "백설공주");
		map.put("book201", "인어공주");
		map.put("book102", "백설공주"); // Value 중복허용
		map.put("book301", "피오나");
		map.put("book101", "엄지공주"); // key 중복 허용 -> 결과는... 새로 들어온 것으로 변경됨, 이전에 들어온 것은 잃어버림 (사실상 중복 불가능)
		
		System.out.println(map.get("book101"));
		System.out.println(map.get("book102"));
		System.out.println(map.get("book502")); // 없는 키를 넣었을 때 [결과] null
		
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
