import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SalaryUnitTest5 {
	Salary salaryCalculator;

	@BeforeEach
	void createObject() {
		salaryCalculator = new Salary();
	}

	@Test
	void testSalaryIncreaseInteger() {
		assertEquals(23200, salaryCalculator.salaryIncrease(23000));
		assertEquals(32200, salaryCalculator.salaryIncrease(32000));
		assertEquals(200, salaryCalculator.salaryIncrease(0));
	}

	@Test
	void testSalaryIncreaseDouble() {
		assertEquals(23200.8, salaryCalculator.salaryIncrease(23000.3));
		assertEquals(32200.50, salaryCalculator.salaryIncrease(32000.00));
		assertEquals(200.50, salaryCalculator.salaryIncrease(0.0));
	}

	@Test   
	void testSalaryIncreasePercentage() {
		assertEquals(22000.0, salaryCalculator.salaryIncrease(20000.0, 10));
		assertEquals(48000.00, salaryCalculator.salaryIncrease(32000.00, 50));
		assertEquals(0, salaryCalculator.salaryIncrease(0, 50));
		assertEquals(60000, salaryCalculator.salaryIncrease(30000, 100));
	}

	@Test
	void testCalculatePay() {
		assertEquals(1920.00, salaryCalculator.calculatePay(32000.00));
		assertEquals(6000, salaryCalculator.calculatePay(100000));
		assertEquals(0, salaryCalculator.calculatePay(0));
	}

	@Test
	void testFormatCurrency()
	{
		assertEquals("£32,000.21", salaryCalculator.formatCurrency(32000.2086132));
		assertEquals("£23,000.30", salaryCalculator.formatCurrency(23000.30));
		assertEquals("£0.20", salaryCalculator.formatCurrency(0.20));
		assertEquals("£0.00", salaryCalculator.formatCurrency(0.00));
		assertEquals("£23,000.99", salaryCalculator.formatCurrency(23000.98765));
		assertEquals("£10,000,000,000.00", salaryCalculator.formatCurrency(10000000000.00));
	}
}
