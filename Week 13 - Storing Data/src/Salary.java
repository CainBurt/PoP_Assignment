/** 
 * Salary class
 * This class contains all the Salary tasks following the week 13 lecture. 
 * 
 * @author melanie
 * @since 2019
 */

public class Salary {

	// Task 1	
  	public int salaryIncrease(int prevSalary) {
  		return prevSalary + 200;
	}

	
	// Task 2
	public double salaryIncrease(double prevSalary) {
		return prevSalary + 200.50;
	}
	
	
	// Task 3: 
	public double salaryIncrease(double prevSalary, int percentIncrease) {
		return prevSalary + ((prevSalary/100)*percentIncrease);
	}
	
	
	// Task 4
	public double calculatePay(double salary) {
		int tax= 15;
		double salaryTax = (salary/100)*tax;
		int pension= 13;
		double salaryPension= (salary/100)* pension;
		return ((salary - salaryTax) - salaryPension)/12;
	}

	
	//Task 5 - this one is more of a challenge - you can come back to it later
	public String formatCurrency(double salary){
		return String.format("£%,.2f", salary);
	}	
	
}
