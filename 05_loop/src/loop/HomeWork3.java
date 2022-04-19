package loop;

import java.io.IOException;
import java.util.Scanner;

public class HomeWork3 {
	public static void main(String[] args) throws IOException {
		
//		RPS 게임
		
		int com, user, betting, money=1000;
		boolean flag = false;
		char exit;
		
		String comS, userS;
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			if(flag) break;
			

			com = (int)(Math.random()*3)+1;
			
			System.out.print("가위(1), 바위(2), 보(3) 중 번호 입력: ");
			user = scan.nextInt();
			System.out.print("배팅 금액 입력: ");
			betting = scan.nextInt();
			System.out.print("결과를 보시려면 enter를 치세요.");
			System.in.read();
			
			if(com == 1) 		comS = "가위";
			else if(com == 2) 	comS = "바위";
			else 				comS = "보";
			
			if(user == 1) 		userS = "가위";
			else if(user == 2) 	userS = "바위";
			else 				userS = "보";
			
			
			System.out.println("\n컴퓨터: " + comS + "\t나: " + userS);
			if(com-user == 0) {
				System.out.println("You Draw!");
				System.out.println("당신의 금액은 " + money + "입니다.\n");
			}
			else if(com-user == -1 || com-user == 2){
				System.out.println("You Win!");
				money += betting;
				System.out.println("당신의 금액은 " + money + "입니다.\n");
			}
			else {
				System.out.println("You Lose!");
				money -= betting;
				System.out.println("당신의 금액은 " + money + "입니다.\n");
			}
//			System.out.println("Money: " + money);
			
			if(money < 0) {
				while(!flag) {
					System.out.print("다시 하시겠습니까? (Y/N): ");
					exit = scan.next().charAt(0);
					
					if(exit == 'n' || exit == 'N') {
						System.out.println("프로그램을 종료합니다.\n");
						flag = true;
					}
					else if(exit == 'y' || exit == 'Y') {
						System.out.print("Insert Coin!: ");
						money = scan.nextInt();
						break;
					}
					else {
						System.out.println("잘못된 입력입니다.\n");
					}
				}
				break;
			}
		}
		
		scan.close();
	}
		
}
