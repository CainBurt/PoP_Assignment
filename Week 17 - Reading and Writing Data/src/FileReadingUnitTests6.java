import static org.junit.jupiter.api.Assertions.*;
import java.io.IOException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FileReadingUnitTests6 {

	FileReading fileReading;

	@BeforeEach
	void setUp() {
		fileReading = new FileReading();
	}

	@Test 
	//Test Task 1
	void testReadName1() throws Exception {
		assertEquals("Melanie Coles", fileReading.readName1("namefile.txt"));
		assertThrows(IOException.class,() -> fileReading.readName1("ddd.txt"));
	}

	@Test 
	//Test Task 2
	void testReadName2(){
		assertEquals("Melanie Coles", fileReading.readName2("namefile.txt"));
		assertEquals("Invalid filename", fileReading.readName2("ddd.txt"));
	}

	@Test 
	//Test Task 3
	void testReadNames() throws Exception{
		String[] names = {"Hiram Mcfarland", "Clark Snow", "Tory Warren", "Guy Cowan", "Ned Mcintosh",
				"Hugo Johnston", "Beth Bates", "Tiffany Mccarty", "Kevin Matthews", "Elisabeth Yates"};
		assertArrayEquals(names, fileReading.readNames("namesFile.txt"));
	}

	@Test 
	//Test Task 4
	void testReadNumbers1() throws Exception{
		int[] numbers = {3456, 1234, 2345, 5555, 6743, 1235, 4556, 1987, 
				1254, 6776, 4345, 3422, 2334, 2323, 4333, 0, 0, 0, 0, 0};
		assertArrayEquals(numbers, fileReading.readNumbers1("numbersFile1.txt"));
	}

	@Test 
	//Test Task 5
	void testReadNumbers2() throws Exception{
		int[] numbers = {3456, 1234, 2345, 5555, 6743, 1235, 4556, 
				1254, 6776, 4345, 3422, 2334, 2323, 4333, 0, 0, 0, 0, 0, 0};
		assertArrayEquals(numbers, fileReading.readNumbers2("numbersFile2.txt"));
	}
	
	@Test 
	//Test Task 6
	void testReadAddressBook() throws Exception{
		String[] addressBook = {"Bob Smith: 01202 961120", "Ruth Jones: 01202 965555", "Tom White: 01202 961223", 
		                        "Eric Arthur Smith: 01202 765432", "Anne Thompson: 01202 987654"};
		assertArrayEquals(addressBook, fileReading.readAddressBook("addressbook.txt"));
	}
}
