import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserInputUnitTests3 {

	UserInput userInput;

	@BeforeEach
	void createObject() {
		userInput = new UserInput();
	}

	@Test
	//Task 3
	void testReadTenNames() {
		String[] names = {"Alice","Bob","Fred","John","Anne","Mary","Ruth","Eric","Phil","Janet"};
		assertArrayEquals(names, userInput.readTenNames());
		String[] names2 = {"a","b","c","d","e","f","g","h","i","j"};
		assertArrayEquals(names2, userInput.readTenNames());

	}
	
}
