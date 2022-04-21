package _constructor;

public class MemberDTO {
	
	String name, phone, address;
	int age;
	
	public MemberDTO() {
		
	}
	
	public MemberDTO(String name, String phone, String address, int age) {
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.age = age;
		
	}
	
	public String getName() {
		return name;
	}
	public String getPhone() {
		return phone;
	}
	public String getAddress() {
		return address;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
