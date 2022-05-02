package level_1;

public class No_04_2 {
	public int solution(String s) {
		
        String[] digits = {"0","1","2","3","4","5","6","7","8","9"};
        String[] alphabets = {"zero","one","two","three","four","five","six","seven","eight","nine"};

        for(int i=0; i<10; i++){
            s = s.replaceAll(alphabets[i], digits[i]);
        }

        return Integer.parseInt(s);
    }
	
	public static void main(String[] args) {
		No_04_2 no = new No_04_2();
		System.out.println(no.solution("one4seveneight"));
	}
}
