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
	public void emptyReturnsZero() throws Exception {
		assertEquals(strCalc.add(""), 0);
	}

	@Test
	public void singleReturnsValue() throws Exception {
		assertEquals(strCalc.add("1"), 1);
	}

	@Test
	public void twoCommaSeperatedReturnsSum() throws Exception {
		assertEquals(strCalc.add("1,2"), 3);
	}

	@Test
	public void nCommaSeperatedReturnsSum() throws Exception {
		assertEquals(strCalc.add("1,2,3,4,5"), 15);
	}

	@Test
	public void twoLineSeperatedReturnsSum() throws Exception {
		assertEquals(strCalc.add("1\n2"), 3);
	}

	@Test
	public void nLineSeperatedReturnsSum() throws Exception {
		assertEquals(strCalc.add("1\n,2,3\n4,5"), 15);
	}

	@Test
	public void twoAnyDelimeterSeperatedReturnsSum() throws Exception {
		assertEquals(strCalc.add("//;\\n1;2"), 3);
	}

	@Test
	public void nAnyDelimeterSeperatedReturnsSum() throws Exception {
		assertEquals(strCalc.add("//;\\n1XY;2_+3(4)$5"), 15);
	}

	@Test(expectedExceptions = Exception.class, expectedExceptionsMessageRegExp = "^Negatives.*")
	public void singleNegativeThrowsException() throws Exception {
		try {
			strCalc.add("-1");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw e;
		}
	}

	@Test(expectedExceptions = Exception.class, expectedExceptionsMessageRegExp = "^Negatives.*")
	public void nNegativesThrowsException() throws Exception {
		try {
			strCalc.add("-1,5,-10,-20");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw e;
		}
	}

	@Test
	public void ignoreGreaterThanThousand() throws Exception {
		assertEquals(strCalc.add("2,1001,5"), 7);
	}
}
