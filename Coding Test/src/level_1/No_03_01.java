package level_1;


public class No_03_01 {
	public String solution(String new_id) {
        String answer;
            
        answer = new_id.toLowerCase();
//      answer = answer.replaceAll("[^a-z0-9-[./-/_]]", "");
        answer = answer.replaceAll("[^-_.a-z0-9]", "");

        while(answer.indexOf("..") != -1) {
        	answer = answer.replace("..", ".");
        }
              
        StringBuffer sb = new StringBuffer(answer);
        
        if(sb.charAt(0) == '.') sb.deleteCharAt(0);
        if(answer.charAt(answer.length()-1) == '.') sb.deleteCharAt(sb.length()-1);
        if(sb.equals("")) sb.append("a");
        if(sb.length()>=16) sb.delete(15, sb.length()-1);
        if(sb.charAt(sb.length()-1) == '.') sb.deleteCharAt(sb.length()-1);
        if(sb.length()<3)   sb.append(sb.charAt(sb.length()-1));
        
        answer = sb.toString();
        
         System.out.println(answer);
        return answer;
    }
	
	public static void main(String[] args) {
		No_03_01 no3 = new No_03_01();
		
		no3.solution("...!@BaT#*..y.abcdefghijklm");
	}
}
