import static org.junit.jupiter.api.Assertions.*;
import java.io.IOException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FileReadingUnitTests3 {

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


}