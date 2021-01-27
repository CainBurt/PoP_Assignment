import static org.junit.jupiter.api.Assertions.*;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FileWritingUnitTests2 {

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

	@Test 
	//Test Task 2
	void testWriteAddressBook() throws Exception {
		String[] names = {"Bob Smith","Ruth Jones","Tom White", "Eric Arthur Smith", "Anne Thompson"};
		String[] phoneNumbers = {"01202 961120","01202 965555","01202 961223","01202 765432","01202 987654"};
		String[] addressBook = {"Bob Smith: 01202 961120", "Ruth Jones: 01202 965555", 
				"Tom White: 01202 961223", "Eric Arthur Smith: 01202 765432", "Anne Thompson: 01202 987654"};
		assertArrayEquals(addressBook, fileReading.readAddressBook(fileWriting.writeAddressBook(names, phoneNumbers)));
		
		String[] names1 = {"a","b","c", "d", "e"};
		String[] phoneNumbers1 = {"1","2","3","4","5"};
		String[] addressBook1 = {"a: 1", "b: 2", "c: 3", "d: 4", "e: 5"};
		assertArrayEquals(addressBook1, fileReading.readAddressBook(fileWriting.writeAddressBook(names1, phoneNumbers1)));

		String[] names2 = {"a","b","c", "d", "e"};
		String[] phoneNumbers2 = {"1","2","3"};
		assertThrows(ArrayIndexOutOfBoundsException.class,() -> fileWriting.writeAddressBook(names2, phoneNumbers2));
		
	}
	
	
	
}
