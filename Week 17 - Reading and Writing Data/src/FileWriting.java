import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Random;

public class FileWriting {

	//Task 1 
	public String writeYourName(String name) throws Exception  {
		 
		String writeNameFile = "myNameFile.txt";
		PrintWriter out = new PrintWriter (new BufferedWriter(new FileWriter(writeNameFile)));
		
		Scanner fromName = new Scanner(name);
		
		while(fromName.hasNext())
		{
			String token = fromName.next();
			out.println(token);
			
		}
		out.close();
		return writeNameFile;
	}
	 
	
	//Task 2 
	public String writeAddressBook(String[]names, String[] phoneNumbers) throws Exception {
		
		String myAdressBook = "myAdressBook.txt";
		PrintWriter out = new PrintWriter (new BufferedWriter(new FileWriter(myAdressBook)));
		
		 
		for(int count = 0; count < names.length; count++) 
		{
			out.println(names[count].toString() + "\n" + phoneNumbers[count].toString());
		}
		
		out.close();
		return myAdressBook;
	}
	 
	
	//Task 3 
	public String writeRandomNumbers(int numRandomNumbers) throws Exception  {
		
		String myRandomNumbers = "myRandomNumbers.txt";
		PrintWriter out = new PrintWriter (new BufferedWriter(new FileWriter(myRandomNumbers)));
		
		//Random Number Generator 
		for(int count = 0; count != numRandomNumbers; count++)
		{
			int numbers = (int)(Math.random()*9000)+1000;
			out.println(numbers);
		}
		out.close();
		return myRandomNumbers;
	}
	 
}
