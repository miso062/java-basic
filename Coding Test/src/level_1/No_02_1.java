package level_1;

import java.util.HashSet;
import java.util.Set;

public class No_02_1 {
	public int[] solution(int[] lottos, int[] win_nums) {
		Set<Integer> set = new HashSet<Integer>();
		
		int[] answer = new int[2];
        int zeroCount = 0;
        int sameCount = 0;

        for(int lotto : lottos) {
            if(lotto == 0) {
                zeroCount++;
                continue;
            }
            set.add(lotto);
        }

        for(int winNum : win_nums) {
            if(set.contains(winNum)) sameCount++;
        }
        
        answer[0] = 7 - (sameCount + zeroCount);
        answer[1] = 7 - sameCount;
        
        for(int i=0; i<answer.length; i++) {
        	if(answer[i] > 6) {
        		answer[i] = 6;
        	}
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
		No_02_1 solu = new No_02_1();
		
		int[] lottos = {0, 0, 0, 0, 0, 0};
		int[] win_nums = {38, 19, 20, 40, 15, 25};
		
//		[0, 0, 0, 0, 0, 0], [38, 19, 20, 40, 15, 25]
//		[45, 4, 35, 20, 3, 9], [20, 9, 3, 45, 4, 35]
		int[] answer = solu.solution(lottos, win_nums);
		
		for(int i: answer) {
			System.out.print(i + " ");
		}
		
	}
}
