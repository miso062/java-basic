package _constructor;

import java.util.Scanner;

public class MemberService_A {
	
	private MemberDTO[] member = new MemberDTO[5];
	
	@SuppressWarnings("resource")
	public void menu() {
		Scanner scan = new Scanner(System.in);
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
		
		System.out.println(" >> 프로그램을 종료합니다.");
		
	}
	
	private void insertMember() {
		
		int i;
		for(i=0; i<member.length; i++) {
			if(member[i]==null) break;
		}
		if(i==member.length) {
			System.out.println("정원초과");
			return;
		}
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		String name, phone, address;
		int age;
		
		for(i=0; i<member.length; i++) {
			if(member[i] == null) {
				System.out.print(" >> 이름 입력: ");
				name = scan.next();
				System.out.print(" >> 나이 입력: ");
				age = scan.nextInt();
				System.out.print(" >> 핸드폰 입력: ");
				phone = scan.next();
				System.out.print(" >> 주소 입력: ");
				address = scan.next();
				
				member[i] = new MemberDTO(name, phone, address, age);
				System.out.println("\n[등록 완료! " + (member.length-(i+1)) + "자리 남았습니다.]");
				
				break;
			}
		}
		
//		확장형 for문 사용불가능: MemberDTO 에서 사용된 m은 for 문이 끝나면 사라짐!
//		for(MemberDTO m : member) {
//			if(m == null) {
//				System.out.print(" >> 이름 입력: ");
//				name = scan.next();
//				System.out.print(" >> 나이 입력: ");
//				age = scan.nextInt();
//				System.out.print(" >> 핸드폰 입력: ");
//				phone = scan.next();
//				System.out.print(" >> 주소 입력: ");
//				address = scan.next();
//				
//				m = new MemberDTO(name, phone, address, age);
//				System.out.println("\n[등록 완료! " + (member.length-(i+1)) + "자리 남았습니다.]");
//				
//				break;
//				
//			}
//		}
	}
	
	
	private void displayMember() {
		
		int i;
	
		System.out.println(" >> 이름\t나이\t핸드폰\t\t주소");
		for(i=0; i<member.length; i++) {
			if(member[i]!=null) {
				System.out.println("    " + member[i].getName() + "\t" + 
											member[i].getAge() + "\t" + 
											member[i].getPhone() + "\t" + 
											member[i].getAddress());
			}
		}
		if(i==member.length) {
			System.out.println("\n[회원이 없습니다!]");
		}
		
//		확장형 for문으로 출력하는 것은 상관 없음!
//		for(MemberDTO m: member) {
//			if(m != null) {
//				System.out.println("    " + m.getName() + "\t" + 
//						m.getAge() + "\t" + 
//						m.getPhone() + "\t" + 
//						m.getAddress());
//			}
//		}
	}
	
	public void updateMember() {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String name, phone, address;
		int age, i;
		
		System.out.print(" >> 핸드폰 번호 입력: ");
		phone = scan.next();
		
		for(i=0; i<member.length; i++) {
			if(member[i] != null && phone.equals(member[i].getPhone())) {
				System.out.println(" >> 이름\t나이\t핸드폰\t\t주소");
				System.out.println("    " + member[i].getName() + "\t" + 
						member[i].getAge() + "\t" + 
						member[i].getPhone() + "\t" + 
						member[i].getAddress());
				
				System.out.print("\n >> 수정할 이름 입력: ");
				name = scan.next();
				System.out.print(" >> 수정할 나이 입력: ");
				age = scan.nextInt();
				System.out.print(" >> 수정할 핸드폰 입력: ");
				phone = scan.next();
				System.out.print(" >> 수정할 주소 입력: ");
				address = scan.next();
				
				member[i].setMember(name, phone, address, age);
				
				System.out.println("\n[수정 완료!]");
				break;
			}
		}
		
		if(i==member.length) {
			System.out.println("\n[찾고자 하는 회원이 없습니다.]");
		}
	}
	
	public void deleteMember() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String phone;
		int i;
		
		System.out.print(" >> 핸드폰 번호 입력: ");
		phone = scan.next();

		for(i=0; i<member.length; i++) {
			if(member[i] != null && phone.equals(member[i].getPhone())) {
				member[i] = null;
				
				System.out.println("\n[삭제 완료!]");
				break;
			}
		}
		if(i==member.length) {
			System.out.println("\n[찾고자 하는 회원이 없습니다.]");
		}		
	}
}
