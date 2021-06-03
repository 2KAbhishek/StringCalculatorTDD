package iam2KAbhishek.StringCalculatorTDD;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Unit tests for StringCalculator.
 */
public class StringCalculatorTest {

	private StringCalculator strCalc;

	@BeforeTest
	public void init() {
		strCalc = new StringCalculator();
	}

	@Test
	public void emptyReturnsZero() {
		assertEquals(strCalc.add(""), 0);
	}

}
