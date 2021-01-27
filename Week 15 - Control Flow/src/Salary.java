/**
 * 
 * @author Melanie
 * This is the Second Salary class - used to explore if and loop statements
 * 
 */


public class Salary {
	
	// Task 1
	public double salaryTax(double grossSalary) {
		double netSalary=0;
		if(grossSalary < 30000) {
			netSalary=grossSalary-((grossSalary/100)*15);
		}
		else if(grossSalary >= 45000) {
			netSalary=grossSalary-((grossSalary/100)*50);
		}
		else if(grossSalary >= 30000) {
			netSalary=grossSalary-((grossSalary/100)*30);
		}
		return netSalary;
	}
	
	// Task 2
	public double calculateNI(double grossSalary, double ni) {
		double netSalary=0;
		 	if(ni=='A')
		 		netSalary = grossSalary-((grossSalary/100)*12);
		 	else if(ni=='B')
		 		netSalary = grossSalary-((grossSalary/100)*5.85);
		 	else if(ni=='C')
		 		netSalary = grossSalary-((grossSalary/100)*2);
		 	else if(ni!= 'A')
		 		netSalary = grossSalary;
			return netSalary;
	}
	
	
	// Task 3
	public double salaryTotal(double[] salaries) {
	double total = 0;
		for(double number : salaries)
			total = total + number;
		return total;
	}
	
	
	// Task 4	
	public double salaryAverage(double[] salaries) {
		double total=0;
			for(double number : salaries) {
				total = total + number;
			}
			double averageSalary = 0;
			for(int count = 0;count<salaries.length;count++) {
				count++;
				averageSalary = total/count;
			}
		return averageSalary;
	}
	
	
	// Task 5	
	public double[] salaryIncrease(double[] salaries) {
		
		for(int i = 0; i < salaries.length; i++ ) {
			salaries[i] = salaries[i] * 1.05;
		}
		return salaries;	
		
	}

}
