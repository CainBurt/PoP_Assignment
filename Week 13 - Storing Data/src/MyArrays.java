import java.util.Arrays;

/** 
 * MyArrays class
 * This class contains all the array tasks following the week 13 lecture. 
 * 
 * @author melanie
 * @since 2019
 */

public class MyArrays {

	// Task 1
	public int addUpNumbers(int num1, int num2, int num3, int num4, int num5) {
		int result = num1 + num2 + num3 + num4 + num5;
		return result;
	}
	
	//Task 2
	public int addUpNumbers(int[] numbers) {
		int sum = numbers[0]+numbers[1]+numbers[2]+numbers[3]+numbers[4];
		return sum;
	}
	
	// Task 3
	public double averageOfNumbers(int[] numbers) {
		double total = numbers[0]+numbers[1]+numbers[2]+numbers[3]+numbers[4];
		double average = total/5;
		return average;
	}
	 
	
	// Task 4
	public int[] convertToCelsius(int[] tempsF) {
		int tempsC0 = (tempsF[0]-32)*5/9;
		int tempsC1 = (tempsF[1]-32)*5/9;
		int tempsC2 = (tempsF[2]-32)*5/9;
		int tempsC3 = (tempsF[3]-32)*5/9;
		int tempsC4 = (tempsF[4]-32)*5/9;
		int CtempsAnswer[] = {tempsC0,tempsC1,tempsC2,tempsC3,tempsC4};
		return CtempsAnswer;
	}
	 
	
	//Task 5
	public String[] unitMarks(int[] grades) {
		String grade0 = "APP:" + grades[0];
		String grade1 = "BSAD:" + grades[1];
		String grade2 = "CF:" + grades[2];
		String grade3 = "DAD:" + grades[3];
		String grade4 = "N&CS:" + grades[4];
		String grade5 = "POP:" + grades[5];
		double total = grades[0]+grades[1]+grades[2]+grades[3]+grades[4]+grades[5];
		double averageNum = total/6;
		String averageText = "Average:" + averageNum;
		String gradesAnswer[]= {grade0, grade1, grade2, grade3, grade4, grade5,averageText};
		return gradesAnswer;
	}
	
	
	//Task 6
	public String andTheWinnerIs(String[] names) {
		java.util.Random r = new java.util.Random();
		return(names[r.nextInt(names.length)]);
	}
}
