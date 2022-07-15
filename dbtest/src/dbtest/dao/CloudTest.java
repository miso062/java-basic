package dbtest.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class CloudTest {
	
	private Connection conn;
	private PreparedStatement pstmt;
	
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@db20220715003434_high?TNS_ADMIN=./src/Wallet";
	private String userName = "gese";
	private String password = "oracleGST1";
	
	// Constructor
	public CloudTest() {
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
			conn = DriverManager.getConnection(url, userName, password);
			System.out.println("접속");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void connectionTest() {
		this.getConnection();
		String sql = "SELECT * FROM like_pro";
		try {	
			
			pstmt = conn.prepareStatement(sql);
			
			int num = pstmt.executeUpdate();
			System.out.println(num + "개의 행을 출력합니다.");
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getInt("LIKE_PRO_ID") + "\t" + rs.getString("USER_ID") + "\t" + rs.getString("PRODUCT_ID") + "\t" + rs.getString("LIKE_PRO_DATE"));
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
		CloudTest it = new CloudTest();
		it.connectionTest();
	}
}
