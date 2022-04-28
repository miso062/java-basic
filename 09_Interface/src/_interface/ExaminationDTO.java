package _interface;

public class ExaminationDTO {
	private String name, dap;
	private char[] ox;
	private int score = 0;
	
	public ExaminationDTO(String name, String dap) {
		this.name = name;
		this.dap = dap;
		ox = new char[ExaminationService.ANSWER.length()];
	}
	
	public String getName() {
		return name;
	}
	public String getDap() {
		return dap;
	}
	public char[] getOx() {
		return ox;
	}
	public int getScore() {
		return score;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDap(String dap) {
		this.dap = dap;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	public void compare() {
		
		for(int i=0; i<ExaminationService.ANSWER.length(); i++) {
			if(ExaminationService.ANSWER.charAt(i) == this.dap.charAt(i)) {
				score += 20;
				ox[i] = 'O';
			}
			else ox[i] = 'X';
		}
	}
}
