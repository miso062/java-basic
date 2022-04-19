package basic;

public class HelloTest {
	
	 public static void main(String[] args){
		 
//		 # 1
		 System.out.print("Hello, Java!\n");
		 System.out.print("반갑습니다~\n");
		 
//		 #2
		 System.out.println(25+36);
		 System.out.println("25+36");
		 System.out.println("25"+"36");
		 System.out.println("25+36 = " + (25+36));
		 
//		 #3
		 System.out.println("25/36 = " + (25.0/36));
		 System.out.println("25/36 = " + String.format("%.3f", (double)25/36));
		 
	 }
}
