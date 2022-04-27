package _interface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExaminationImple implements ExaminationService {
	
	private List<ExaminationDTO> list = new ArrayList<>();
	
	public void menu() {
		Scanner scan = new Scanner(System.in);
		int num; 
		
		while(true) {
			System.out.println("");
			System.out.println("****************************");
			System.out.println("*     1. 입력              *");
			System.out.println("*     2. 출력              *");
			System.out.println("*     3. 종료              *");
			System.out.println("****************************");
			System.out.print("     - 번호 선택: ");
			num = scan.nextInt();
			
			System.out.println();
			
			if(num==3) break;
			else if(num==2) {
				printArticle();
			}
			else {
				insertArticle();
			}
		}
		scan.close();
		System.out.println(" >> 프로그램을 종료합니다.");
	}

	
	public void insertArticle() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int studentNum;
		String name, studentAnswer;
		
		System.out.print(" > 인원수 입력: ");
		studentNum = scan.nextInt();
		
		for(int i=0; i<studentNum; i++) {
			System.out.print("\n > 이름 입력: ");
			name = scan.next();
			System.out.print(" > 답 입력: ");
			studentAnswer = scan.next();
			
			ExaminationDTO dto = new ExaminationDTO(name, studentAnswer);
			dto.compare();
			list.add(dto);
		}
	}

	public void printArticle() {
		System.out.println("이름\t1 2 3 4 5  점수");
		for(ExaminationDTO dto: list) {
			System.out.print(dto.getName() + "\t");
			for(char c: dto.getOx()) {
				System.out.print(c + " ");
			}
			System.out.printf("%4d\n", dto.getScore());
		}
	}
}
