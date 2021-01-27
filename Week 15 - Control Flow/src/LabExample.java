import java.util.Random;

/**
 * 
 * @author Melanie
 * This is the LabExample class - used to explore if and loop statements
 * 
 */

public class LabExample {

	// Task 1  
	public int highestOfTwo(int number1, int number2){
		if(number1>number2) {
			return number1;
		}
		else if(number2>number1) {
			return number2;
		}
		else
			return -1;
	}
	
	
	//Task 2 
	public String calculateGrade(int mark) {
	String grade = "";
		if(mark<0)
			grade = "Invalid mark";
		else if(mark<40)
			grade = "Fail";
		else if(mark<50)
			grade = "3rd";
		else if(mark<60)
			grade = "2ii";
		else if(mark<70)
			grade = "2i";
		else if(mark>100)
			grade = "Invalid mark";
		else if(mark>=70)
			return "1st";
	return grade;
	}
	
	//Task 3 
	public String headsOrTails(String guess) {
		Random r = new Random();
		int randomInt = r.nextInt(2);
		if(randomInt == 0)
			return "Correct: you guessed heads and I flipped heads";
		else if(randomInt == 1)
			return "Incorrect: you guessed heads and I flipped tails";
		return guess;
	}
	
	//Task 4 
	public int sumFromOneToWhat(int num) {
		int total = 0;
		for(int answer = 1; answer<=num; answer++) {
			total = total + answer;
		}
		return total;
	
	}
	
	//Task 5 
	public int sumFromWhatToWhat(int num1, int num2) {
		int total = 0;
		for(int answer = num1; answer<=num2; answer++) {
			total = total+ answer;
		}
		return total;
	}

}
