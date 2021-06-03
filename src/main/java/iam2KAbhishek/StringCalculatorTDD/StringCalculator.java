/**
 *
 */
package iam2KAbhishek.StringCalculatorTDD;

/**
 * @author 2KAbhishek
 * Main StringCalculator class
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
					throw new Exception("Negatives not allowed: " + getNegative(nums));
				else if (intNum > 1000)
					continue;
				else
					sum += intNum;
			} catch (NumberFormatException e) {
				continue;
			}
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
				if (Integer.parseInt(num) < 0)
					sbr.append(num + " ");
			} catch (NumberFormatException e) {
				continue;
			}
		}
		return sbr.toString();
	}
}
