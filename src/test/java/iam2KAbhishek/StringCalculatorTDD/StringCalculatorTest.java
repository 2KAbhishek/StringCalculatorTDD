package iam2KAbhishek.StringCalculatorTDD;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeTest;

/**
 * Unit tests for StringCalculator.
 */
public class StringCalculatorTest {

	private StringCalculator strCalc;

	@BeforeTest
	public void init() {
		strCalc = new StringCalculator();
	}

}
