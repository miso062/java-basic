package _interface;

public class ExaminationDTO {
	String name, dap;
	char[] ox;
	int score = 0;
	
	public ExaminationDTO(String name, String dap) {
		this.name = name;
		this.dap = dap;
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
	public void setOx(String ox) {
		this.ox = ox.toCharArray();
	}
}
