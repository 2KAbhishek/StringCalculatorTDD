/**
 *
 */
package iam2KAbhishek.StringCalculatorTDD;

import java.util.Arrays;

/**
 * @author 2KAbhishek Main string calculator class
 */
public class StringCalculator {

	private static final String delimeter = "[^0-9-]";

	/**
	 * Add numbers present in input string
	 *
	 * @param numbers
	 * @return sum of numbers
	 */
	public int add(String numbers) throws Exception {
		String[] nums = numbers.split(delimeter);
		int sum = 0, intNum = 0;
		for (String num : nums) {
			try {
				intNum = Integer.parseInt(num);
				if (intNum < 0)
					throw new Exception("Negatives not allowed" + Arrays.toString(getNegative(nums)));
				else
					sum += intNum;
			} catch (NumberFormatException e) {
				sum += 0;
			}
		}

		return sum;
	}

	/**
	 * @param nums
	 * @return array of negative numbers
	 */
	private int[] getNegative(String[] nums) {
		int[] negatives = new int[nums.length];
		int intNum = 0, count = 0;
		for (String num : nums) {
			try {
				intNum = Integer.parseInt(num);
				if (intNum < 0)
					negatives[count++] = intNum;
			} catch (NumberFormatException e) {
				continue;
			}
		}
		return negatives;
	}
}
