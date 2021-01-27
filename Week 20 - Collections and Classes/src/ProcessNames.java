import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProcessNames {

	//Task 1 - read in all data from a file
	public ArrayList<String> readNames(String fileName) throws Exception  {
		
		Scanner scan = new Scanner(new File(fileName));
		
		ArrayList<String> names = new ArrayList<String>();
		
		while(scan.hasNextLine()) 
		{
			names.add(scan.nextLine());
		}
		
		System.out.println(names);
		scan.close();
		return (names);
	}
	 

	//Task 2 - sort the data
	public ArrayList<String> sortNames(ArrayList<String> names){
		Collections.sort(names);
		return(names);
	}
	 

	//Task 3 - search the data
	public Boolean findName(ArrayList<String> namesList, String name) {
		
		for(String element : namesList) {
			if(element.equals(name)) {
				return true;
			}
		}
		return false;
	}
	 

	//Task4 - find name position
	public int findNamePosition(ArrayList<String> namesList, String name) {
		
		for(String element: namesList) {
			if(element.equals(name)) {
				return namesList.indexOf(name);
			}
			
		}
		return -1;
	}
	 
	
	//Task5 - delete name
	public ArrayList<String> deleteName(ArrayList<String> namesList, String nameRemove){
		
		for(String element: namesList) {
			if(element.equals(nameRemove)) 
			{
				int indexOfName = namesList.indexOf(nameRemove);
				namesList.remove(indexOfName);
				return(namesList);
			}
		}
		return (namesList);
		
	}
	 

	//Task6 - add name
	public ArrayList<String> addName(ArrayList<String> namesList, String nameAdd){
		namesList.add(nameAdd);
		return namesList;
	}
	 

	//Task7 - modify name 
	public ArrayList<String> changeName(ArrayList<String> namesList, String nameAlter, String nameNew){
		
		for(String element: namesList) {
			if(element.equals(nameAlter)) 
			{
				int indexOfName = namesList.indexOf(nameAlter);
				namesList.remove(indexOfName);
				namesList.add(indexOfName, nameNew);
				return (namesList);
			}
		}
		return (namesList);
	}
	 

	//Task 8 - write the new data back to the file
	public String writeNames(ArrayList<String> namesList) throws Exception {
		
		String writeNames = "writeNames.txt";
		PrintWriter out = new PrintWriter (new BufferedWriter(new FileWriter(writeNames)));
		
		for(int i = 0; i < namesList.size(); i++) {
			String eachName = namesList.get(i);
			out.println(eachName);
		}
		out.close();
		return writeNames;
	}
		
}
