import java.util.Arrays;

public class FileWritingTest {

	public static void main(String[] args) throws Exception {
		FileWriting fileWriting = new FileWriting();
		FileReading fileReading = new FileReading();
		
		//Task 1
		fileWriting.writeYourName("Mary Jane Anne Smith");
		System.out.println(fileReading.readName1(fileWriting.writeYourName("Fred")));
	
		//Task2
		String[] names = {"Bob Smith","Ruth Jones","Tom White", "Eric Arthur Smith", "Anne Thompson"};
		String[] phoneNumbers = {"01202 961120","01202 965555","01202 961223","01202 765432","01202 987654"};
		fileWriting.writeAddressBook(names, phoneNumbers);
		System.out.println(Arrays.toString(fileReading.readAddressBook(fileWriting.writeAddressBook(names, phoneNumbers))));
		
		//Task 3
		fileWriting.writeRandomNumbers(55);
		System.out.println(Arrays.toString(fileReading.readNumbers1(fileWriting.writeRandomNumbers(10))));
	}

}
