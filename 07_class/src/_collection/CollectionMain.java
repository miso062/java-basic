package _collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionMain {
	public static void main(String[] args) {
		Collection<String> coll = new ArrayList<String>();
		
		coll.add("호랑이");
		coll.add("사자");
		coll.add("기린");
		coll.add("호랑이"); // 중복 허용, 순서
		coll.add("코끼리");
		
		Iterator<String> it = coll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
