package _interface;

public class ExaminationMain {
	public static void main(String[] args) {
		ExaminationService es = new ExaminationImple();
		es.menu();
	}
}
