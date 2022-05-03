package test;

import java.text.DecimalFormat;

public class SalaryDTO implements Comparable<SalaryDTO>{
	int no, basePay, extraPay, tax, salary;
	double taxRate;
	String name, rank;
	
	public SalaryDTO(int no, int basePay, int extraPay, String name, String rank) {
		this.no = no;
		this.basePay = basePay;
		this.extraPay = extraPay;
		this.name = name;
		this.rank = rank;
		
		calc();
	}
	
	public void calc() {
		int tot = basePay + extraPay;
		
		if(tot <= 2000000) {
			taxRate = 0.01;
		}
		else if(tot <= 4000000) {
			taxRate = 0.02;
		}
		else if(tot > 4000000) {
			taxRate = 0.03;
		}
		
		tax = (int)(tot * taxRate);
		salary = tot - tax;
	}
	
	public String toString() {
		DecimalFormat df = new DecimalFormat();
		return no + "\t\t" + name + "\t" + rank + "\t" + 
				df.format(basePay) + "\t" + df.format(extraPay) + "\t\t" + 
				(int)(taxRate*100) + "%\t" + df.format(tax) + "\t\t" + df.format(salary);
	}
	
	public int getNo() {
		return this.no;
	}
	
	public String getName() {
		return this.name;
	}
	public String getRank() {
		return this.rank;
	}
	public int getSalary() {
		return this.salary;
	}

	public void setBasePay(int basePay) {
		this.basePay = basePay;
	}

	public void setExtraPay(int extraPay) {
		this.extraPay = extraPay;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	@Override
	public int compareTo(SalaryDTO o) {
		return this.name.compareTo(o.name);
	}
	
}
