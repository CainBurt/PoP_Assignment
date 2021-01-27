import static org.junit.jupiter.api.Assertions.*;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FileWritingUnitTests1 {

	FileReading fileReading;
	FileWriting fileWriting;

	@BeforeEach
	void setUp() {
		fileReading = new FileReading();
		fileWriting = new FileWriting();
	}

	@Test 
	//Test Task 1
	void testWriteYourName() throws Exception {
		assertEquals("Fred Bloggs", fileReading.readName1(fileWriting.writeYourName("Fred Bloggs")));
		assertEquals("Melanie Coles", fileReading.readName1(fileWriting.writeYourName("Melanie Coles")));
		assertEquals("Mary Jane", fileReading.readName1(fileWriting.writeYourName("Mary Jane Smith")));
		assertThrows(NoSuchElementException.class,() -> fileReading.readName1(fileWriting.writeYourName("Bob")));
	}

	
	
	
}
