/**
 *
 */
package iam2KAbhishek.StringCalculatorTDD;

/**
 * @author 2KAbhishek Main StringCalculator class
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
		if (numbers.length() == 0) {
			return 0;
		}

		String[] nums = numbers.split(delimeter);
		int sum = 0, intNum = 0;
		for (String num : nums) {
			sum = addNum(nums, sum, num);
		}

		return sum;
	}

	private int addNum(String[] nums, int sum, String num) throws Exception {
		int intNum;
		intNum = Integer.parseInt(num);
		if (intNum < 0) {
			throw new Exception("Negatives not allowed: " + getNegative(nums));
		}
		if (intNum <= 1000) {
			sum += intNum;
		}
		return sum;
	}

	/**
	 * @param nums
	 * @return String of negative numbers
	 */
	private String getNegative(String[] nums) {
		StringBuilder sbr = new StringBuilder();
		for (String num : nums) {
			try {
				if (Integer.parseInt(num) < 0) {
					sbr.append(num + " ");
				}
			} catch (NumberFormatException e) {
				continue;
			}
		}
		return sbr.toString();
	}
}
