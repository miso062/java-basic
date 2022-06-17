package student.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentDAOImpl implements StudentDAO{
	Scanner scan = new Scanner(System.in);
	
	private Connection conn;
	private PreparedStatement pstmt;
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String userName = "c##java";
	private String password = "oracle";
	private String sql;
	private ResultSet rs; 
	
	public StudentDAOImpl() {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void getConnection() {
		try {
			conn = DriverManager.getConnection(url, userName, password);
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
	
	public void menu() {
		int num; 
		
		while(true) {
			System.out.println("");
			System.out.println("****************************");
			System.out.println("*         < 관리 >         *");
			System.out.println("****************************");
			System.out.println("*         1. 입력          *");
			System.out.println("*         2. 검색          *");
			System.out.println("*         3. 삭제          *");
			System.out.println("*         4. 종료          *");
			System.out.println("****************************");
			System.out.print("     - 번호 선택: ");
			num = scan.nextInt();
			
			System.out.println();
			
			if(num==1) {
				insertArticle();
			}
			else if(num==2){
				selectArticle();
			}
			else if(num==3) {
				deleteArticle();
			}
			else {
				break;
			}
		}
		scan.close();
		System.out.println(" >> 프로그램을 종료합니다.");
	}
	
	public void insertArticle() {
		int code;
		String name, value;
		System.out.println("****************************");
		System.out.println("*       1. 학생            *");
		System.out.println("*       2. 교수            *");
		System.out.println("*       3. 관리자          *");
		System.out.println("*       4. 이전메뉴        *");
		System.out.println("****************************");
		System.out.print("     - 번호 선택: ");
		code = scan.nextInt();
		
		if(code==4)		return;
		
		this.getConnection();
				
		try {
			System.out.print(" > 이름 입력: ");
			name = scan.next();
			if(code==1) {
				System.out.print(" > 학번 입력: ");
			}
			else if(code==2){
				System.out.print(" > 과목 입력: ");
			}
			else{
				System.out.print(" > 부서 입력: ");
			}
			value = scan.next();
			
			sql = "INSERT INTO student VALUES(?, ?, ?)";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, value);
			pstmt.setInt(3, code);
			
			int num = pstmt.executeUpdate();
			System.out.println(num + "개의 행이 생성되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeDB();
		}
	}
	
	public void selectArticle() {
		int num;
		String name;
		System.out.println("****************************");
		System.out.println("*       1. 이름 검색       *");
		System.out.println("*       2. 전체 검색       *");
		System.out.println("*       3. 이전메뉴        *");
		System.out.println("****************************");
		System.out.print("     - 번호 선택: ");
		num = scan.nextInt();
		
		if(num==3)		return;
		
		this.getConnection();
				
		try {
			if(num==1) {
				System.out.print("\n > 검색할 이름 입력: ");
				name = scan.next();
				sql = "SELECT * FROM student WHERE name LIKE ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, "%"+name+"%");
				rs = pstmt.executeQuery();
				while(rs.next()) {
					System.out.print("\n이름: " + rs.getString("name") + "\t");
					
					int code = rs.getInt("code");
					System.out.println();
					if(code == 1) {
						System.out.println("학번: " + rs.getString("value"));
					}
					else if(code == 2) {
						System.out.println("과목: " + rs.getString("value"));
					}
					else {
						System.out.println("부서: " + rs.getString("value"));
					}
				}
			}
			else if(num==2){
				sql = "SELECT * FROM student";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				
				System.out.println("\n이름\t학번/과목/부서");
				while(rs.next()) {
					System.out.println(rs.getString("name") + "\t" + rs.getString("value"));
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeDB();
		}
	}
	
	public void deleteArticle() {
		String name;		
		this.getConnection();
				
		try {
			System.out.print(" > 삭제할 이름 입력: ");
			
			sql = "DELETE student WHERE name=?";
			name = scan.next();
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			
			int num = pstmt.executeUpdate();
			System.out.println(" > " + num + "개의 행이 삭제되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeDB();
		}
		
	}
	
	public void closeDB() {
		try {
			if(rs != null)		rs.close();
			if(pstmt != null)	pstmt.close();
			if(conn != null)	conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

