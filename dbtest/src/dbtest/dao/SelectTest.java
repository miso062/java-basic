package dbtest.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SelectTest {
	
	private Connection conn;
	private PreparedStatement pstmt;
	
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String userName = "c##java";
	private String password = "oracle";
	
	
	public SelectTest() {
		try {
			Class.forName(driver);
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
	
	public void selectArticle() {
		
		this.getConnection();
		String sql = "SELECT * FROM DBTEST";
		
		try {	
			
			pstmt = conn.prepareStatement(sql);
			
			int num = pstmt.executeUpdate();
			System.out.println(num + "개의 행을 출력합니다.");
			ResultSet rs = pstmt.executeQuery();
			
			System.out.println("\nNAME\tAGE\tHEIGHT\tLOGTIME");
			System.out.println("-------------------------------------------------");
			while(rs.next()) {
				System.out.println(rs.getString("name") + "\t" + rs.getInt("age") + "\t" + rs.getDouble("height") + "\t" + rs.getString("logtime"));
			}
			
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
			} catch (SQLException e){
				e.printStackTrace();
			}
		}
	}
	
	
	public static void main(String[] args) {
		SelectTest st = new SelectTest();
		st.selectArticle();
	}
}
