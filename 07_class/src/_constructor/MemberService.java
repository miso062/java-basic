package _constructor;

import java.util.Scanner;

public class MemberService {
	
	private MemberDTO[] member = new MemberDTO[5];
	Scanner scan = new Scanner(System.in);
	
	public void menu() {
		int num; 
		
		while(true) {
			System.out.println("");
			System.out.println("****************************");
			System.out.println("*     1. 회원 가입         *");
			System.out.println("*     2. 정보 보기         *");
			System.out.println("*     3. 정보 수정         *");
			System.out.println("*     4. 회원 탈퇴         *");
			System.out.println("*     5. 종료하기          *");
			System.out.println("****************************");
			System.out.print("     - 번호 선택: ");
			
			num = scan.nextInt();
			
			System.out.println();
			
			if(num==5) break;
			else if(num==1) {
				insertMember();
			}
			else if(num==2){
				displayMember();
			}
			else if(num==3) {
				updateMember();
			}
			else if(num==4) {
				deleteMember();
			}
		}
		scan.close();
		System.out.println(" >> 프로그램을 종료합니다.");
		
	}
	
	private void insertMember() {
		
		String name, phone, address;
		int age, flag=0;
		
		Loop:
		for(int i=0; i<member.length; i++) {
			if(member[i] == null) {
				System.out.print(" >> 이름 입력: ");
				name = scan.next();
				for(int j=0; j<member.length; j++) {
					if(member[j]!=null) {
						if(name.equals(member[j].getName())) {
							System.out.println("\n[이미 존재하는 이름입니다.]");
							flag=1;
							break Loop;
						}
					}
				}
				System.out.print(" >> 나이 입력: ");
				age = scan.nextInt();
				System.out.print(" >> 핸드폰 입력: ");
				phone = scan.next();
				System.out.print(" >> 주소 입력: ");
				scan.nextLine();
				address = scan.nextLine();
				member[i] = new MemberDTO(name, phone, address, age);
				
				System.out.println("\n[등록 완료! " + (member.length-(i+1)) + "자리 남았습니다.]");
				flag=1;
				break;
			}
		}
		if(flag == 0) {
			System.out.println("정원초과");
		}
	}
	
	
	private void displayMember() {
		
		int flag = 0;
		
		System.out.println(" >> 이름\t나이\t핸드폰\t\t주소");
		for(int i=0; i<member.length; i++) {
			if(member[i]!=null) {
				System.out.println("    " + member[i].getName() + "\t" + 
											member[i].getAge() + "\t" + 
											member[i].getPhone() + "\t" + 
											member[i].getAddress());
				flag =1;
			}
		}
		if(flag==0) {
			System.out.println("\n[회원이 없습니다!]");
		}
	}
	
	public void updateMember() {
		
		String name, phone, address;
		int age, flag=0;
		
		System.out.print(" >> 핸드폰 번호 입력: ");
		phone = scan.next();
		
		Loop:
		for(int i=0; i<member.length; i++) {
			if(member[i] != null && phone.equals(member[i].getPhone())) {
				flag=1;
				System.out.println(" >> 이름\t나이\t핸드폰\t\t주소");
				System.out.println("    " + member[i].getName() + "\t" + 
						member[i].getAge() + "\t" + 
						member[i].getPhone() + "\t" + 
						member[i].getAddress());
				
				System.out.print("\n >> 수정할 이름 입력: ");
				name = scan.next();
				for(int j=0; j<member.length; j++) {
					if(member[j]!=null) {
						if(name.equals(member[j].getName()) && i!=j) {
							System.out.println("\n[이미 존재하는 이름입니다.]");
							flag=1;
							break Loop;
						}
					}
				}
				member[i].setName(name);
				System.out.print(" >> 수정할 나이 입력: ");
				age = scan.nextInt();
				member[i].setAge(age);
				System.out.print(" >> 수정할 핸드폰 입력: ");
				phone = scan.next();
				member[i].setPhone(phone);
				System.out.print(" >> 수정할 주소 입력: ");
				scan.nextLine();
				address = scan.nextLine();
				member[i].setAddress(address);
				
				System.out.println("\n[수정 완료!]");
				break;
			}
		}
		
		if(flag==0) {
			System.out.println("\n[찾고자 하는 회원이 없습니다.]");
		}
		
	}
	
	public void deleteMember() {
		String phone;
		int flag=0;
		
		System.out.print(" >> 핸드폰 번호 입력: ");
		phone = scan.next();

		for(int i=0; i<member.length; i++) {
			if(member[i] != null && phone.equals(member[i].getPhone())) {
				flag=1;
				
				member[i] = null;
				
				System.out.println("\n[삭제 완료!]");
				break;
			}
		}
		
		if(flag==0) {
			System.out.println("\n[찾고자 하는 회원이 없습니다.]");
		}		
	}
}
