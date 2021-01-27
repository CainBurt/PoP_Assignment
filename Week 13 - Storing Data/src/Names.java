
/** 
 * Names class
 * This class contains all the String tasks following the week 13 lecture. 
 * 
 * @author melanie
 * @since 2019
 */

public class Names {
	
	// Task 1
	
	public String upperCaseName(String boris) {
		return (boris.toUpperCase());
	}
	 
	
	// Task 2
	
	public String fullName(String firstName, String SecondName) {
		return firstName + " " + SecondName;
	}
	
	// Task 3
	
	public int letterCount(String name) {
		int nameLength = name.length();
		return nameLength;
	}
	
	
	// Task 4
	public boolean theSameName(String name1, String name2) {
		return name1.equalsIgnoreCase(name2);
}
	
	// Task 5 - coming out expected true but actual is false.
	public String properCaseName(String name) {
		name = name.toLowerCase();
		name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();;
		return name;
	}
}
