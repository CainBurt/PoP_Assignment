import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserInputUnitTests1 {

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
}
