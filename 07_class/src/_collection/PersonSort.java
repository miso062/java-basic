package _collection;

import java.util.*;

public class PersonSort {
	public static void main(String[] args) {
		String[] ar = {"orange", "apple", "banana", "pear", "peach", "applemango"};
		
		System.out.print("정렬 전 = ");
		for(String str : ar) {
			System.out.print(str + " ");
		}
		
		Arrays.sort(ar);
		
		System.out.print("\n정렬 후 = ");
		for(String str : ar) {
			System.out.print(str + " ");
		}
		
		System.out.println("\n\n<객체 정렬>");
		PersonDTO ps1 = new PersonDTO("프로도", 24);
		PersonDTO ps2 = new PersonDTO("네오", 25);
		PersonDTO ps3 = new PersonDTO("라이언", 18);
		
		List<PersonDTO> list = new ArrayList<>();
		list.add(ps1);
		list.add(ps2);
		list.add(ps3);
		
		System.out.println("정렬 전 = " + list);
		Collections.sort(list);
		System.out.println("정렬 후 = " + list);
		
		System.out.println("\n<다른 기준으로 정렬 - 이름>");
		Comparator<PersonDTO> com = new Comparator<PersonDTO>() {
			@Override
			public int compare(PersonDTO p1, PersonDTO p2) {
				return p1.getName().compareTo(p2.getName());  // 오름차순
//				return p1.getName().compareTo(p2.getName())*-1;  // 내림차순
			}
		};
		System.out.println("정렬 전 = " + list);
		Collections.sort(list, com);
		System.out.println("정렬 후 = " + list);
	}
}
