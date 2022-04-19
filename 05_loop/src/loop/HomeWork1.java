package loop;

import java.util.Scanner;

public class HomeWork1 { // AddGame
	public static void main(String[] args) {
		
//		int com = (int)(Math.random()*100); // 0 ~ 99
//		System.out.println(com);
//		
//		// a ~ b 사이의 난수를 생성하고 싶을 때
//		int rand = (int)(Math.random()*26)+65;
//		System.out.println(rand);
		
		Scanner scan = new Scanner(System.in);
		
		int num1, num2, score=0, count=0, answer=0, times=0;
		
		for(int i=0; i<5; i++) {
			num1 = (int)(Math.random()*90)+10;
			num2 = (int)(Math.random()*90)+10;
			
			while(true) {
				System.out.print("[" + (i+1) + "] " + num1 + " + " + num2 + " = ");
				answer = scan.nextInt();
				
				if((num1 + num2) == answer) {
					System.out.println("딩동댕~ 참 잘했어요!\n");
					score += 20;
					count++;
					times = 0;
					break;
				}
				else {
					if(times == 1) {
						System.out.println("틀렸당 정답은 " + (num1+num2) + "이당!\n");
						times = 0;
						break;
					}
					else System.out.println("틀렸당");
					times++;
				}
			}
		}
		
		System.out.println("당신은 총 5문제 중에서 " + 
				count + "문제 맞추어서 " + 
				score + "점 입니다.");
		
		scan.close();
	}
}

