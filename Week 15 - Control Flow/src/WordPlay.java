import java.util.Random;

/**
 * 
 * @author Melanie
 * This is the WordPlay class - used to explore if and loop statements
 * 
 */

public class WordPlay {
	
	//Task1
	public String whatComesFirst(String string1, String string2) {
		int compare = string1.compareToIgnoreCase(string2);
				if (compare < 0) {  
				    return string1 + " comes before " + string2 + " in the alphabet"; 
				}
				else if(compare > 0) {
					return string2 + " comes before " + string1 + " in the alphabet";
				}
				else if(compare == 0) {
					return string1 + " is the same as " + string2;
				}
				return null;
	}
	
	
	//Task 2
	public String backwardsString(String word) {
		String reverse = "";
		for(int i = word.length() - 1; i >= 0; i--) {
			reverse = reverse + word.charAt(i);
		}
		return reverse;
	}
	
	
	//task 3
	public String[] addressBook(String[] names, String[] numbers) {
		
		String book[] = new String [names.length];
		
				for(int i = 0;i < book.length; i++) {
					book[i] = names[i] + " " + numbers[i];
					
				}
				return book;
	}
	
	
	//Task 4
	public String rockPaperScissors(String myGuess) {
		//pick the random word
		String computer[] = {"rock", "paper", "scissors"};
		Random random = new Random();
		String computerGuess = computer[random.nextInt(computer.length)];
		
		String answer = "";
		
		if(myGuess == "rock" && computerGuess == "rock") {
			answer = "USER:rock vs COMP:rock it is a draw";
		}
		else if(myGuess == "paper" && computerGuess == "paper") {
			answer = "USER:paper vs COMP:paper it is a draw";
		}
		else if(myGuess == "scissors" && computerGuess == "scissors") {
			answer = "USER:scissors vs COMP:scissors it is a draw";
		}
		else if(myGuess == "paper" && computerGuess == "scissors") {
			answer = "USER:paper vs COMP:scissors COMPUTER wins";
		}
		else if(myGuess == "rock" && computerGuess == "paper") {
			answer = "USER:rock vs COMP:paper COMPUTER wins";
		}
		else if(myGuess == "scissors" && computerGuess == "rock") {
			answer = "USER:scissors vs COMP:rock COMPUTER wins";
		}
		else if(myGuess == "scissors" && computerGuess == "paper") {
			answer = "USER:scissors vs COMP:paper user wins";
		}
		else if(myGuess == "paper" && computerGuess == "rock") {
			answer = "USER:paper vs COMP:rock user wins";
		}
		else if(myGuess == "rock" && computerGuess == "scissors") {
			answer = "USER:rock vs COMP:scissors user wins";
		}
		return answer;
	}
	
	
}
