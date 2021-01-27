import java.util.Random;

public class Dice {
	
	int faceValue = 0;
	
	//Task 1
	public void roll() {
		
		Random r = new Random();
		faceValue = r.nextInt(6);
		faceValue++;
	}
	

	//Task 1 - second bit
	public int getFaceValue() {
		return faceValue;
	}

	
	//Task 2
	public String toString() {
		String stringValue = Integer.toString(faceValue);
		return stringValue;
	}
	

}
