package dbtest.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateTest {
	
	private Connection conn;
	private PreparedStatement pstmt;
	
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String userName = "c##java";
	private String password = "oracle";
	
	public UpdateTest() {
		try {
			Class.forName(driver);
			System.out.println("드라이버 로딩 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void getConnection() {
		try {
			conn = DriverManager.getConnection(url, userName, password);
			System.out.println("접속");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void updateArticle() {
		Scanner scan = new Scanner(System.in);
		
		this.getConnection();
		String sql = "UPDATE DBTEST SET AGE=AGE+1, HEIGHT=HEIGHT+1 WHERE NAME LIKE ?";
		
		System.out.print("수정할 이름 입력: ");
		String name = scan.next();
		name = "%" + name + "%";
		
		try {	
			
			pstmt = conn.prepareStatement(sql);
//			System.out.println(name);
			pstmt.setString(1, name);
			
			int num = pstmt.executeUpdate();
			System.out.println(num + "개의 행을 수정하였습니다.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) {
					pstmt.close();
				}
				if(conn != null) {
					conn.close();
				}
				if(scan != null) {
					scan.close();
				}
			} catch (SQLException e){
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		UpdateTest ut = new UpdateTest();
		ut.updateArticle();
	}
}

