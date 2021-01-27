import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserInputUnitTests4 {

	UserInput userInput;

	@BeforeEach
	void createObject() {
		userInput = new UserInput();
	}

	@Test
	//Task 4
		void testCinemaViewing() {
			String invalid = "Invalid age";
			String underFour = "Too young for a film";
			String underEight = "U - suitable for four years and over";
			String underTwelve = underEight+"\nPG - suitable for eight years and over";
			String underFifteen = underTwelve+"\n12 - suitable for twelve years and over";
			String underEighteen = underFifteen+"\n15 - suitable for fifteen years and over";
			String overEighteen = underEighteen+"\n18 - suitable for adults only";
					
			String answer = userInput.cinemaViewing();
			System.out.println(answer);
			assertTrue(answer.equalsIgnoreCase(invalid)||
					answer.equalsIgnoreCase(underFour) ||
					answer.equalsIgnoreCase(underEight)||
					answer.equalsIgnoreCase(underTwelve)||
					answer.equalsIgnoreCase(underFifteen)||
					answer.equalsIgnoreCase(underEighteen)||
					answer.equalsIgnoreCase(overEighteen));
		}
}
