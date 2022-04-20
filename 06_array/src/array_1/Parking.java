package array_1;

import java.util.*;

public class Parking {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		boolean[] carList = new boolean[] {false, false, false, false, false};
		
		int menu;
		
		
		while(true) {
			System.out.println(" ***************<MENU>***************");
			System.out.println(" *          1. 입차                 *");
			System.out.println(" *          2. 출차                 *");
			System.out.println(" *          3. 리스트               *");
			System.out.println(" *          4. 종료                 *");
			System.out.println(" ************************************");
			System.out.print(" - 원하는 메뉴를 선택하세요: ");
			menu = scan.nextInt();
			
			System.out.println();
			
			if(menu == 1) {
				int areaNum = 0;
				System.out.print(" - 위치 입력: ");
				areaNum = scan.nextInt();
				
				if(carList[areaNum-1]) {
					System.out.println(" - 이미 주차된 구역입니다. 입차할 수 없습니다.\n");
				}
				else {
					carList[areaNum-1] = true;
					System.out.println(" - 성공적으로 주차되었습니다.\n");
				}
			}
			else if(menu == 2) {
				int areaNum = 0;
				System.out.print(" - 위치 입력: ");
				areaNum = scan.nextInt();
				
				if(!carList[areaNum-1]) {
					System.out.println(" - 주차된 차가 없습니다. 출차할 수 없습니다.\n");
				}
				else {
					carList[areaNum-1] = false;
					System.out.println(" - 성공적으로 출차되었습니다.\n");
				}
			}
			else if(menu == 3) {
				System.out.println("   <현재 주차 목록>");
				int count = 0;
				for(int i=0; i<carList.length; i++) {
					if(carList[i])	count++;
					System.out.println("   # " + (i+1) + "번\t" + carList[i]);
				}
				System.out.println(" - 총" + count + "대 입니다. " + (carList.length-count) + "대 주차 가능합니다.\n");
			}
			else{
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		
		scan.close();
	}
}
