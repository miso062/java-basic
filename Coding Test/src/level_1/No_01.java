package level_1;
import java.util.*;


public class No_01 {

//	public int[] solution(String[] id_list, String[] report, int k) {
//        
//        int[] answer = new int[id_list.length];
//        int[] reportNum = new int[id_list.length];
//        String[] delReport = Arrays.stream(report).distinct().toArray(String[]::new);
//        String[] report_list = new String[id_list.length];
//        
//        for(int i=0; i<report_list.length; i++){
//            report_list[i] = "";
//        }
//        
//        int temp=0;
//           
//        for(String rep: delReport){
//            StringTokenizer st = new StringTokenizer(rep);
//            String[] tempID = new String[2];
//            for(int i=0; i<2; i++){
//                tempID[i] = st.nextToken();
//                if(i == 1){
//                    for(int j=0; j<id_list.length; j++){
//                        if(tempID[1].equals(id_list[j])){
//                            reportNum[j]++;
//                        }
//                    }
//                    for(int j=0; j<id_list.length; j++){
//                        if(tempID[1].equals(id_list[j])){
//                            report_list[j] = report_list[j] + " "+ tempID[0];
//                        }
//                    }
//                }
//            }
//        }
//        
//        for(int repNum: reportNum){
//            if(repNum >= k){
//                System.out.println(temp + " " + report_list[temp]);
//                StringTokenizer st = new StringTokenizer(report_list[temp]);
//                while(st.hasMoreTokens()){
//                    String tempStr = st.nextToken();
//                    for(int i=0; i<id_list.length; i++){
//                        if(tempStr.equals(id_list[i])){
//                            answer[i]++;
//                        }
//                    }
//                }
//            }
//            temp++;
//        }
//        return answer;
//    }

    public int[] solution(String[] id_list, String[] report, int k) {
    	
        int[] answer = new int[id_list.length];
        ArrayList<User> users = new ArrayList<>();
//        HashMap<String,Integer> suspendedList = new HashMap<>(); //<이름>
        HashSet<String> suspendedList = new HashSet<>();
        HashMap<String,Integer> idIdx = new HashMap<String,Integer>(); // <이름, 해당 이름의 User 클래스 idx>
        int idx = 0;

        for(String name : id_list) {
            idIdx.put(name,idx++);
            users.add(new User(name));
        }

        for(String re : report){
            String[] str = re.split(" ");
            //suspendedCount.put(str[0], suspendedCount.getOrDefault(str[0],0)+1);

            users.get( idIdx.get(str[0])).reportList.add(str[1]);
            users.get( idIdx.get(str[1])).reportedList.add(str[0]);
        }

        for(User user : users){
            if(user.reportedList.size() >= k)
//                suspendedList.put(user.name, 1);
                suspendedList.add(user.name);
        }

         for(User user : users){
             for(String nameReport : user.reportList){
//                 if(suspendedList.get(nameReport) != null){
                 if(suspendedList.contains(nameReport)){
                     answer[idIdx.get(user.name)]++;
                 }

             }
        }
        return answer;
    }

	class User{
	    String name;
	    HashSet<String> reportList;
	    HashSet<String> reportedList;
	    public User(String name){
	        this.name = name;
	        reportList = new HashSet<>();
	        reportedList = new HashSet<>();
	    }
	}
	
	public static void main(String[] args) {
		No_01 no01 = new No_01();
		
		String[] id_list = {"muzi", "frodo", "apeach", "neo"};
		String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
		int k = 2;
		
		
		for(int answer: no01.solution(id_list, report, k)) {
			System.out.println(answer);
		}
		
	}
}
