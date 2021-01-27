import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserInputUnitTestsAll {

	UserInput userInput;

	@BeforeEach
	void createObject() {
		userInput = new UserInput();
	}

	@Test
	//Task 1
	void testSayHello() {
		assertEquals("Hello Melanie".toLowerCase(), userInput.sayHello().toLowerCase());
		assertEquals("Hello Bob".toLowerCase(), userInput.sayHello().toLowerCase());
	}

	@Test
	//Task 2
	void testReadTenNumbers() {
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		assertArrayEquals(numbers, userInput.readTenNumbers());
		int[] numbers1 = {10,20,30,40,50,60,70,80,90,100};
		assertArrayEquals(numbers1, userInput.readTenNumbers());
	}

	@Test
	//Task 3
	void testReadTenNames() {
		String[] names = {"Alice","Bob","Fred","John","Anne","Mary","Ruth","Eric","Phil","Janet"};
		assertArrayEquals(names, userInput.readTenNames());
		String[] names2 = {"a","b","c","d","e","f","g","h","i","j"};
		assertArrayEquals(names2, userInput.readTenNames());

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
