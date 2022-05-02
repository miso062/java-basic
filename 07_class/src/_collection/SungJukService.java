package _collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class SungJukService{
	
	private ArrayList<SungJukDTO> list; // 이 문장을 고치지 말것 -> 생성자로 new!
	
	public SungJukService() {
		list = new ArrayList<SungJukDTO>();
	}
	
	public void menu() {
		Scanner scan = new Scanner(System.in);
		int num; 
		
		while(true) {
			System.out.println("");
//			System.out.println("list = " + list);
			System.out.println("****************************");
			System.out.println("*      1. 입력             *");
			System.out.println("*      2. 출력             *");
			System.out.println("*      3. 검색             *");
			System.out.println("*      4. 삭제             *");
			System.out.println("*      5. 정렬             *");
			System.out.println("*      6. 종료             *");
			System.out.println("****************************");
			System.out.print("     - 번호 선택: ");
			num = scan.nextInt();
			
			System.out.println();
			
			if(num==6) 			break;
			else if(num==1) 	insertArticle();
			else if(num==2) 	printArticle();
			else if(num==3) 	searchArticle();
			else if(num==4) 	deleteArticle();
			else if(num==5) 	sortArticle();
			else 				System.out.println("[1~6번 중에 입력하세요!]");
			
		}
		scan.close();
		System.out.println(" >> 프로그램을 종료합니다.");
	}
	
	public void insertArticle() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
	
		String name;
		int no, kor, eng, math; 
	
		System.out.print(" >> 번호 입력: ");
		no = scan.nextInt();
		for(SungJukDTO data: list) {
			if(data.getNo()==no) {
				System.out.println("\n[이미 있는 번호입니다!]");
				return;
			}
		}
		
		System.out.print(" >> 이름 입력: ");
		name = scan.next();
		System.out.print(" >> 국어 입력: ");
		kor = scan.nextInt();
		System.out.print(" >> 영어 입력: ");
		eng = scan.nextInt();
		System.out.print(" >> 수학 입력: ");
		math = scan.nextInt();
		
		list.add(new SungJukDTO(name, no, kor, eng, math));
	}
	
	public void printArticle() {
		int i=0;
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		for(SungJukDTO data: list) {
			// toString() 메소드의 오버라이딩을 활용하여 쉽게 사용가능
			System.out.println(data);
//			System.out.println(data.getNo() + "\t" +
//								data.getName() + "\t" +
//								data.getKor() + "\t" +
//								data.getEng() + "\t" +
//								data.getMath() + "\t" + 
//								data.getTot() + "\t" +
//								String.format("%.2f", data.getAvg()) + "\t");
			i++;
		}
		if(i==0) {
			System.out.println("\n[리스트가 비어있습니다.]");
		}
	}
	
	@SuppressWarnings("resource")
	public void searchArticle() {
		String searchName;
		ArrayList<Integer> searchIndex = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		
		System.out.print(" >> 검색할 이름 입력: ");
		searchName = scan.next();
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getName().equals(searchName)) {
				searchIndex.add(i);
			}
		}
		
		if(searchIndex.isEmpty()) {
			System.out.println("\n[찾고자 하는 이름이 없습니다.]");
		}
		else {
			System.out.println("\n번호\t이름\t국어\t영어\t수학\t총점\t평균");
			for(int i: searchIndex) {
				System.out.println(list.get(i).getNo() + "\t" +
						list.get(i).getName() + "\t" +
						list.get(i).getKor() + "\t" +
						list.get(i).getEng() + "\t" +
						list.get(i).getMath() + "\t" + 
						list.get(i).getTot() + "\t" +
						String.format("%.2f", list.get(i).getAvg()) + "\t");
			}
		}
	}
	
	@SuppressWarnings({ "resource" })
	public void deleteArticle() {
		
		Iterator<SungJukDTO> iter = list.iterator();
		Scanner scan = new Scanner(System.in);
		String delName;
		
		System.out.print("삭제할 이름 입력: ");
		delName = scan.next();
		
		while(iter.hasNext()) {
			SungJukDTO dto = iter.next();
			if(dto.getName().equals(delName)){
//				해당 반복자로 반환되는 마지막 요소를 현재 컬렉션에서 제거함
				iter.remove();
			}
		}
		
//		String deleteName;
//		int check=0;
//		ArrayList<Integer> deleteIndex = new ArrayList<Integer>();
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.print("삭제할 이름 입력: ");
//		deleteName = scan.next();
//		
//		for(int i=0; i<list.size(); i++) {
//			if(list.get(i).getName().equals(deleteName)) {
//				deleteIndex.add(i);
//			}
//		}
//		
//		if(deleteIndex.isEmpty()) {
//			System.out.println("\n[삭제할 이름이 없습니다.]");
//		}
//		else {
//			for(int i: deleteIndex) {
//				list.remove(i-check);
//				check++;
//			}
//			System.out.println("\n[삭제되었습니다.]");
//		}
		
	}
	
	public void	sortArticle() {
		Scanner scan = new Scanner(System.in);
		int num; 
		System.out.println("****************************");
		System.out.println("*      1. 이름으로 정렬    *");
		System.out.println("*      2. 총점으로 정렬    *");
		System.out.println("*      3. 이전 메뉴        *");
		System.out.println("****************************");
		System.out.print("     - 번호 선택: ");
		num = scan.nextInt();
		
		if(num == 1) {
			System.out.println("\n[이름으로 정렬합니다.]\n");
			Collections.sort(list);
			this.printArticle();
		}
		else if(num == 2) {
			System.out.println("\n[총점으로 정렬합니다.]\n");
			Comparator<SungJukDTO> com = new Comparator<SungJukDTO>() {
				@Override
				public int compare(SungJukDTO s1, SungJukDTO s2) {
					// 조건연산자 사용
					return s1.getAvg() > s2.getAvg() ? -1 : 1;
				}
			};
			this.printArticle();
			
		}
		else {
			System.out.println("\n[이전 메뉴로 돌아갑니다.]");
			return;
		}
		
	}
}
