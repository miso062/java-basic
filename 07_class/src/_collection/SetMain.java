package _collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMain {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("호랑이");
		set.add("사자");
		set.add("기린");
//		같은 데이터를 넣으면 무시하고 한 개만 처리
		set.add("호랑이"); // 중복 허용 X, 순서X
		set.add("코끼리");
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
