package student.dao;

public class StudentMain {
	public static void main(String[] args) {
		StudentDAO stuDAO = new StudentDAOImpl();
		stuDAO.menu();
		System.out.println("----------------------------끗!");
	}
}
