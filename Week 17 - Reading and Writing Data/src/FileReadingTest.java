import java.util.Arrays;

public class FileReadingTest {

	public static void main(String[] args) throws Exception {
		FileReading fileInput = new FileReading();
		
		//Task 1 
		System.out.println(fileInput.readName1("namefile.txt"));

		//Task 2
		System.out.println(fileInput.readName2("ddd.txt"));
		
		//Task 3
		System.out.println(Arrays.toString(fileInput.readNames("namesfile.txt")));
		
		//Task 4
		System.out.println(Arrays.toString(fileInput.readNumbers1("numbersfile1.txt")));
		
		//Task 5
		System.out.println(Arrays.toString(fileInput.readNumbers2("numbersfile2.txt")));
		
		//Task 6
		System.out.println(Arrays.toString(fileInput.readAddressBook("addressbook.txt")));
	}

}
