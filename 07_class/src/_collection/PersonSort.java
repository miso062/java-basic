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
		PersonDTO ps1 = new PersonDTO("프로도", 23);
		PersonDTO ps2 = new PersonDTO("네오", 37);
		PersonDTO ps3 = new PersonDTO("라이언", 32);
		
		List<PersonDTO> list = new ArrayList<>();
		list.add(ps1);
		list.add(ps2);
		list.add(ps3);
		
		System.out.println("정렬 전 = " + list);
		Collections.sort(list);
		System.out.println("정렬 전 = " + list);
	}
}
