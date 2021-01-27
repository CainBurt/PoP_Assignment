
public class Craps {
	
	Dice dice1 = new Dice();
	Dice dice2 = new Dice();
	
	//Task 1
	public void shoot() {
		dice1.roll();
		dice2.roll();
	}
	
	
	//Task 1
	public Dice getDice1() {
		return dice1;
	}
	
	
	//Task 1
	public Dice getDice2() {
		return dice2;
	}
	
	
	//Task 2
	public int addUpScore() {
		int totalScore = dice1.getFaceValue() + dice2.getFaceValue();
		return totalScore;
	}
	
	
	//Task 3
	public String decideOutcome(int total) {
		if(total == 7 || total == 11) {
			return "You win";
		}
		else if(total == 2 || total == 3 || total == 12) {
			return "You lose";
		}
		else return "Throw again";
	}
	
	
	//Task 4 - No UNIT TEST FOR THIS ONE - Check the output
	public String getResults() {
		String dice1 = "Dice 1 is " + getDice1();
		String dice2 = "Dice 2 is " + getDice2();
		String total = "Total is: " + addUpScore();
		String result = "Result is " + decideOutcome(addUpScore());
		return dice1 + "\n" + dice2 + "\n" + total + "\n" + result;
	}
	
	
	//Task 5 - No UNIT TEST FOR THIS ONE - Check the output
	public String playCraps() {
		
	while(true) {
		if(getResults().contains("Throw again")) {
			dice1.roll();
			dice2.roll();
			System.out.println(getResults());
		}
		else if(!getResults().contains("Throw again")) {
			break;
		}
	}
	return "";
	}
	
	
	//Task 6 Additional tasks
	//Can you add a method that asks the user if they want to play again?

	
	
}
