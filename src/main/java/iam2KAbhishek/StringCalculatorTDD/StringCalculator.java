/**
 *
 */
package iam2KAbhishek.StringCalculatorTDD;

/**
 * @author 2KAbhishek
 *
 */
public class StringCalculator {

	/**
	 * Add numbers present in input string
	 * @param numbers
	 * @return sum of numbers
	 */
	public int add(String numbers) {
		if (numbers.length() > 0) return Integer.parseInt(numbers);
		return 0;
	}
}
