import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LabExampleUnitTests3 {

	LabExample labExample;

	@BeforeEach
	void createObject() {
		labExample = new LabExample();
	}

	//Task 1
	@Test
	void testHighestOfTwo() {
		assertEquals(20, labExample.highestOfTwo(10,20));
		assertEquals(-1, labExample.highestOfTwo(5,5));
		assertEquals(345, labExample.highestOfTwo(345,5));

	}

	//Task 2
	@Test
	void testCalculateGrade() {
		assertEquals("Fail", labExample.calculateGrade(30));
		assertEquals("3rd", labExample.calculateGrade(44));
		assertEquals("Invalid mark", labExample.calculateGrade(123));
		assertEquals("1st", labExample.calculateGrade(70));
		assertEquals("2i", labExample.calculateGrade(65));
		assertEquals("Invalid mark", labExample.calculateGrade(-2));
	}

	//Task 3
	@Test
	void testHeadsOrTails() {
		String[] answers = {"Correct: you guessed heads and I flipped heads",
				"Correct: you guessed tails and I flipped tails",
				"Incorrect: you guessed heads and I flipped tails",
		"Incorrect: you guessed tails and I flipped heads"};
		assertTrue(Arrays.asList(answers).contains(labExample.headsOrTails("heads")));
		assertTrue(Arrays.asList(answers).contains(labExample.headsOrTails("tails")));

	}

	
}
