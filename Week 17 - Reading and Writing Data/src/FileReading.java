import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class FileReading {

	//Task 1 
	public String readName1(String nameFile) throws Exception  {
		
		File file = new File(nameFile);
		
		Scanner scan = new Scanner(file);
		String name = scan.nextLine() + " " + scan.nextLine();
		scan.close();
		return name;
		
	}

	
	//Task 2 
	public String readName2(String nameFile) {
		
	File file = new File(nameFile);
		
	try {
		Scanner scan = new Scanner(file);
		String name = scan.nextLine() + " " + scan.nextLine();
		scan.close();
		return name;
		}
	
	catch(FileNotFoundException e) {
		 return "Invalid filename";
		}
	}
	
	//Task 3 
	public String[] readNames(String fileName) throws Exception {

		String[] names = new String[10];
		int count = 0;
		
		File file = new File(fileName);
		Scanner scan = new Scanner(file);
		
		
		while(scan.hasNext()) {
			names[count]=scan.nextLine();
			count++;
			}
		return names;
	}
	
	//Task 4 
	public int[] readNumbers1(String numbersFile)throws Exception {
		
		int[] numbersList = new int[20];
		int count = 0;
		
		File file = new File(numbersFile);
		Scanner scan = new Scanner(file);
		
		while(scan.hasNextInt()) {
			numbersList[count]=scan.nextInt();
			count++;
			}
		return numbersList;
	}
	
	
	//Task5 
	public int[] readNumbers2(String numbersFile)throws Exception {
		int[] numbersList = new int[20];
		int count = 0;
		
		File file = new File(numbersFile);
		Scanner scan = new Scanner(file);
		
		while(scan.hasNext()) {
			if(scan.hasNextInt()) {
			numbersList[count]=scan.nextInt();
			count++;
			}
			else{
				scan.next();
			}
		}
		return numbersList;
	}
	
	
	//Task 6 
	public String[] readAddressBook(String addressBook)throws Exception {
		String[] namesNumbers = new String[5];
		int count = 0;
		
		File file = new File(addressBook);
		Scanner scan = new Scanner(file);
		
		while(scan.hasNext()) {
			namesNumbers[count] = scan.nextLine() + ": " + scan.nextLine();
			count++;
			}
		return namesNumbers;
		
	}
	
	

}
