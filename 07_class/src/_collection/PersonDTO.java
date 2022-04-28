package _collection;

public class PersonDTO implements Comparable<PersonDTO>{
	
	private String name;
	private int age;
	
	public PersonDTO(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public int compareTo(PersonDTO o) {
		if(this.age > o.age)
			return -1;
		else if(this.age == o.age)
			return 0;
		else
			return 1;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " " + age;
	}
}
