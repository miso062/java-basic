package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class SalaryServiceImpl implements SalaryService {
	
	Scanner scan = new Scanner(System.in);
	private List<SalaryDTO> list;
	
	public SalaryServiceImpl() {
		 list = new ArrayList<SalaryDTO>(); 
	}
	
	public void menu() {
		int num; 
		
		while(true) {
			System.out.println("");
			System.out.println("*******************************");
			System.out.println("*      1. 사원 등록           *");
			System.out.println("*      2. 전체 출력           *");
			System.out.println("*      3. 사원 정보 수정      *");
			System.out.println("*      4. 퇴사                *");
			System.out.println("*      5. 정렬                *");
			System.out.println("*      6. 종료                *");
			System.out.println("*******************************");
			System.out.print("     - 번호 입력: ");
			num = scan.nextInt();
			
			System.out.println();
			
			if(num==6) 			break;
			else if(num==1) 	insertEmp();
			else if(num==2) 	displayEmp();
			else if(num==3) 	updateEmp();
			else if(num==4) 	deleteEmp();
			else if(num==5) 	sortEmp();
			else 				System.out.println("[1~6번 중에 입력하세요!]");
			
		}
		System.out.println(" >> 프로그램을 종료합니다.");
	}

	
	@Override
	public void insertEmp() {
		int no, basePay, extraPay;
		String name, rank;
	
		System.out.print(" >> 사원번호 입력: ");
		no = scan.nextInt();
		
//		for(SalaryDTO data: list) {
//			if(data.getNo()==no) {
//				System.out.println("\n[이미 있는 번호입니다!]");
//				return;
//			}
//		}
		
		System.out.print(" >> 사원명 입력: ");
		name = scan.next();
		System.out.print(" >> 직급 입력: ");
		rank = scan.next();
		System.out.print(" >> 기본급 입력: ");
		basePay = scan.nextInt();
		System.out.print(" >> 수당 입력: ");
		extraPay = scan.nextInt();
		
		list.add(new SalaryDTO(no, basePay, extraPay, name, rank));
		System.out.println("\n[등록이 완료되었습니다]");
	}
	
	@Override
	public void displayEmp() {
		int i=0;
		System.out.println("[사원 목록 출력]\n");
		System.out.println("사원 번호\t이름\t직급\t기본급\t\t수당\t\t세율\t세금\t\t월급");
		for(SalaryDTO data: list) {
			System.out.println(data);
			i++;
		}
		if(i==0) {
			System.out.println("\n[리스트가 비어있습니다.]");
		}
	}

	@Override
	public void updateEmp() {
		int no;
		boolean flag = true;
		System.out.print(" >> 수정할 사원번호 입력: ");
		no = scan.nextInt();
		
		for(SalaryDTO dto : list) {
			if(dto.getNo() == no) {
				flag = false;
				System.out.println("\n[해당 사원 정보]");
				System.out.println("사원 번호\t이름\t직급\t기본급\t\t수당\t\t세율\t세금\t\t월급");
				System.out.println(dto);
				
				System.out.print("\n >> 직급 입력: ");
				dto.setRank(scan.next());
				System.out.print(" >> 기본급 입력: ");
				dto.setBasePay(scan.nextInt());
				System.out.print(" >> 수당 입력: ");
				dto.setExtraPay(scan.nextInt());
				
				dto.calc();
				System.out.println("\n[수정되었습니다.]");
			}
		}
		if(flag) {
			System.out.println("\n[사원 번호가 없습니다.]");
		}
	}

	@Override
	public void deleteEmp() {
		int no;
		boolean flag = true;
		System.out.print(" >> 퇴사할 사원번호 입력: ");
		no = scan.nextInt();
		
		Iterator<SalaryDTO> iter = list.iterator();
		while(iter.hasNext()) {
			SalaryDTO dto = iter.next();
			if(dto.getNo() == no) {
				System.out.println("\n["+ dto.getName() + " " + dto.getRank() + 
									" 퇴사 처리 되었습니다.]");
				iter.remove();
				flag = false;
			}
		}
		if(flag) {
			System.out.println("\n[사원 번호가 없습니다.]");
		}
	}

	@Override
	public void sortEmp() {
		int num; 
		System.out.println("***********************************");
		System.out.println("*   1. 이름으로 정렬 (오름차순)   *");
		System.out.println("*   2. 월급으로 정렬 (내림차순)   *");
		System.out.println("*   3. 이전 메뉴                  *");
		System.out.println("***********************************");
		System.out.print("     - 번호 선택: ");
		num = scan.nextInt();
		
		if(num == 1) {
			System.out.println("\n[이름(오름차순)으로 정렬합니다.]");
			Collections.sort(list);
			this.displayEmp();
		}
		else if(num == 2) {
			System.out.println("\n[월급(내림차순)으로 정렬합니다.]");
			Comparator<SalaryDTO> com = new Comparator<SalaryDTO>() {
				@Override
				public int compare(SalaryDTO s1, SalaryDTO s2) {
					return s1.getSalary() > s2.getSalary() ? -1 : 1;
				}
			};
			Collections.sort(list, com);
			this.displayEmp();
		}
		else {
			System.out.println("\n[이전 메뉴로 돌아갑니다.]");
			return;
		}
	}
}
