import java.util.Scanner;

public class UserInput {
	
	//Task 1 
	public String sayHello() {
		Scanner scan = new Scanner(System.in);
		String name;
	
		System.out.println("Enter your name:");
	
		name = scan.nextLine();
	return "Hello " + name;
	}

	
	//Task 2 
	public int[] readTenNumbers() {
		
		Scanner scan = new Scanner(System.in);
		int numberList[] = new int[10];
		
	for(int i=0; i<numberList.length; i++) {
		System.out.println("Enter number " + (i+1) + ":");
		numberList[i] = scan.nextInt();
	}
	return numberList;
	
	}
	
	//Task 3 
	public String[] readTenNames() {
		
		Scanner scan = new Scanner(System.in);
		String[] nameList = new String[10];
		
	for(int i=0; i<nameList.length; i++) {
		System.out.println("Enter name " + (i+1) + ":");
		nameList[i] = scan.nextLine();
	}
	return nameList;
	}
	
	// Task 4 
	public String cinemaViewing() {
		
		Scanner scan = new Scanner(System.in);
		int age;
		
		String invalid = "Invalid age";
		String underFour = "Too young for a film";
		String underEight = "U - suitable for four years and over";
		String underTwelve = underEight+"\nPG - suitable for eight years and over";
		String underFifteen = underTwelve+"\n12 - suitable for twelve years and over";
		String underEighteen = underFifteen+"\n15 - suitable for fifteen years and over";
		String overEighteen = underEighteen+"\n18 - suitable for adults only";
		
		System.out.println("Enter age: ");
		age = scan.nextInt();
		
		if(age <0 || age >120) {
			return invalid;
		}
		else if(age > 0 && age < 4) {
			return underFour;
		}
		else if(age >= 4 && age < 8) {
			return underEight;
		}
		else if(age >= 8 && age <12) {
			return underTwelve;
		}
		else if(age >= 12 && age < 15) {
			return underFifteen;
		}
		else if(age >= 15 && age < 18) {
			return underEighteen;
		}
		else if(age >= 18) {
			return overEighteen;
		}
	return null;
	}
	
}
