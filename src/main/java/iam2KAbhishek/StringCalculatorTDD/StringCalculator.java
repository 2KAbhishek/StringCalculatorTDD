/**
 *
 */
package iam2KAbhishek.StringCalculatorTDD;

/**
 * @author 2KAbhishek Main string calculator class
 */
public class StringCalculator {

	private static final String delimeter = ",|\n";

	/**
	 * Add numbers present in input string
	 *
	 * @param numbers
	 * @return sum of numbers
	 */
	public int add(String numbers) {
		String[] nums = numbers.split(delimeter);
		int sum = 0;

		for (String num : nums) {
			try {
				sum += Integer.parseInt(num);
			} catch (Exception e) {
				sum += 0;
			}
		}

		return sum;
	}
}
