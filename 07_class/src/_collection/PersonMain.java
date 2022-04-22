package _collection;

import java.util.ArrayList;

public class PersonMain {
	
	public ArrayList<PersonDTO> init() {
		
		PersonDTO ps1 = new PersonDTO("프로도", 23);
		PersonDTO ps2 = new PersonDTO("네오", 37);
		PersonDTO ps3 = new PersonDTO("라이언", 45);
		
		ArrayList<PersonDTO> list = new ArrayList<PersonDTO>();
		list.add(ps1);
		list.add(ps2);
		list.add(ps3);
		
		return list;
	}
	
	
	public static void main(String[] args) {
		PersonMain pm = new PersonMain();
		ArrayList<PersonDTO> list = pm.init();
		System.out.println("list = " + list);
				
		for(PersonDTO dto: list) {
			System.out.println(dto.getName() + ", " + dto.getAge());
		}
		
//		System.out.println(ps2.getName() + ", " + ps2.getAge());
//		System.out.println(ps3.getName() + ", " + ps3.getAge());
	}
}
