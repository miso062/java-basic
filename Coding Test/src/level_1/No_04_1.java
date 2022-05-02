package level_1;

public class No_04_1 {
	public int solution(String s) {
        int answer = 0;
        String ans = "";
        Number[] arr = Number.values();
        
        System.out.println(s);
        for(int i=0; i<s.length(); i++) {
        	if(s.charAt(i) < 'A') {
        		ans += s.charAt(i);
        	}
        	else {
        		for(int j=0; j<arr.length; j++) {
        			String num = arr[j].toString();
        			if(num.length()+i <= s.length()) {
        				String sub = s.substring(i, i+num.length());
        				if(num.equals(sub)) {
        					ans += arr[j].ordinal();
        					i += num.length()-1;
        					break;
        				}
        			}
        		}
        	}
        }
        
        answer = Integer.parseInt(ans);
        return answer;
    }

	enum Number{
	    zero, one, two, three, four, five, six, seven, eight, nine
	}
	
	public static void main(String[] args) {
		No_04_1 no = new No_04_1();
		System.out.println(no.solution("one4seveneight"));
	}
}
