package dbtest.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertTest {
	
	private Connection conn;
	private PreparedStatement pstmt;
	
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String userName = "c##java";
	private String password = "oracle";
	
	// Constructor
	public InsertTest() {
		try {
			Class.forName(driver);
			System.out.println("드라이버 로딩 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	// method - for connection
	public void getConnection(){
		try {
			conn = DriverManager.getConnection(
					url, userName, password);
			System.out.println("접속");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void insertArticle() {
		Scanner scan = new Scanner(System.in);
		String name;
		int age;
		double height;
		
		this.getConnection();
		try {
			System.out.print("이름을 입력하세요: ");
			name = scan.next();
			System.out.print("나이를 입력하세요: ");
			age = scan.nextInt();
			System.out.print("키를 입력하세요: ");
			height = scan.nextDouble();
			
			String sql = "INSERT INTO DBTEST VALUES(?, ?, ?, sysdate)";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, name);
			pstmt.setInt(2, age);
			pstmt.setDouble(3, height);
			
			int num = pstmt.executeUpdate();
			System.out.println(num + "개의 행이 생성되었습니다.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null)	pstmt.close();
				if(conn != null)	conn.close();
				if(scan != null) 	scan.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		InsertTest it = new InsertTest();
		it.insertArticle();
	}
}
