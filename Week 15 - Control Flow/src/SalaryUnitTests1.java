import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SalaryUnitTests1 {

	Salary salary;

	@BeforeEach
	void createObject() {
		salary = new Salary();
	}

	//Task 1
	@Test
	void testHighestOfTwo() {
		assertEquals(30000.0, salary.salaryTax(60000.00));
		assertEquals(21000.0, salary.salaryTax(30000.00));
		assertEquals(17000.0, salary.salaryTax(20000.00));
	}

}
