package level_1;
import java.util.*;
import java.util.stream.Collectors;


public class No_01_2 {

	public int[] solution(String[] id_list, String[] report, int k) {
		int[] answer = new int[id_list.length];
		
		// report 리스트 중복 제거
		List<String> delDupReport = Arrays.stream(report).distinct().collect(Collectors.toList());
		// A를 신고한 사람의 리스트를 저장하는 저장소 만들기
		HashMap<String, String> reportList = new HashMap<String, String>();
		// 신고당한 사람의 신고 횟수를 저장하는 저장소 만들기
		HashMap<String, Integer> reportedNum = new HashMap<>();
		// 아이디 인덱스 리스트 저장소 만들기
		HashMap<String, Integer> idIndex = new HashMap<>();
		
		for(int i=0; i<id_list.length; i++) {
			idIndex.put(id_list[i], i);	
			reportedNum.put(id_list[i], 0);
			reportList.put(id_list[i], "");
		}
		
		for(String s: delDupReport) {
			String[] str = s.split(" ");
			reportList.put(str[1], reportList.get(str[1]) + str[0] + " ");
//			System.out.println("\n1)   " + str[1] + " " + str[0]);
			reportedNum.put(str[1], reportedNum.get(str[1])+1);
		}
		
		for(String id: id_list) {
//			System.out.println(id);
			if(reportedNum.get(id) >= k) {
				String[] str = reportList.get(id).split(" ");
//				System.out.println(reportedNum.get(id) + " " + reportList.get(id));
				for(String s: str) {
					answer[idIndex.get(s)]++;
				}
			}
		}
		
		return answer;
    }

	public static void main(String[] args) {
		No_01_2 no01 = new No_01_2();
		
		String[] id_list = {"muzi", "frodo", "apeach", "neo"};
		String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
		int k = 2;
		
		
		for(int answer: no01.solution(id_list, report, k)) {
			System.out.println(answer);
		}
		
	}
}
