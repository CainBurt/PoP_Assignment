import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyArraysUnitTests5 {

	MyArrays myArrays;

	@BeforeEach
	void createObject() {
		myArrays = new MyArrays();
	}

	@Test
	//Task 1
	void testAddUpNumbersIndividual() {
		assertEquals(150, myArrays.addUpNumbers(10,20,30,40,50));
		assertEquals(0, myArrays.addUpNumbers(0,0,0,0,0));
		assertEquals(0, myArrays.addUpNumbers(-1,-1,0,1,1));
		assertEquals(5000000, myArrays.addUpNumbers(1000000,1000000,1000000,1000000,1000000));
	}
	
	@Test
	//Task 2
	void testAddUpNumbersArray() {
		int[] numbers = {10,20,30,40,50};
		assertEquals(150, myArrays.addUpNumbers(numbers));
		int[] numbers1 = {0,0,0,0,0};
		assertEquals(0, myArrays.addUpNumbers(numbers1));
		int[] numbers2 = {-1,-1,0,1,1};
		assertEquals(0, myArrays.addUpNumbers(numbers2));
		int[] numbers3 = {1000000,1000000,1000000,1000000,1000000};
		assertEquals(5000000, myArrays.addUpNumbers(numbers3));
	}
	
	@Test
	//Task 3
	void testAverageOfNumbers() {
		int[] numbers = {10,20,30,40,50};
		assertEquals(30.0, myArrays.averageOfNumbers(numbers));
		int[] numbers1 = {10,22,30,40,50};
		assertEquals(30.4, myArrays.averageOfNumbers(numbers1));
		int[] numbers2 = {-1,-1,0,1,1};
		assertEquals(0, myArrays.averageOfNumbers(numbers2));
		int[] numbers3 = {100,120,24,777777,12};
		assertEquals(155606.60, myArrays.averageOfNumbers(numbers3));
	}

	@Test
	//Task 4
	void testConvertToCelsius() {
		int[] temps1 = {70,65,84,90,45};
		int[] CTempsAnswer = {21,18,28,32,7};
		assertArrayEquals(CTempsAnswer, myArrays.convertToCelsius(temps1));
		int[] temps2 = {32,0,-20,1,34};
		int[] CTempsAnswer2 = {0,-17,-28,-17,1};
		assertArrayEquals(CTempsAnswer2, myArrays.convertToCelsius(temps2));
	}
	
	@Test
	//Task 5
	void testUnitGrades() {
		int[] grades = {64,55,45,67,65,88};
		String[] gradesAnswer = {"APP:64","BSAD:55","CF:45", "DAD:67", 
				"N&CS:65", "POP:88", "Average:64.0"};
		assertArrayEquals(gradesAnswer, myArrays.unitMarks(grades));
		int[] grades2 = {50,50,50,50,50,53};
		String[] gradesAnswer2 = {"APP:50","BSAD:50","CF:50", "DAD:50", 
				"N&CS:50", "POP:53", "Average:50.5"};
		assertArrayEquals(gradesAnswer2, myArrays.unitMarks(grades2));
		
	}
	

}
