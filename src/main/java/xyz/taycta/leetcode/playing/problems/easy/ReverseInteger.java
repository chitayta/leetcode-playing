package xyz.taycta.leetcode.playing.problems.easy;

/**
 * https://leetcode.com/problems/reverse-integer/
 */
public class ReverseInteger {
    /**
     * Implement using "củ chuối" approach
     * <ul>
     * <li>Runtime: 2ms</li>
     * <li>Memory usage: 36.3 MB</li>
     * </ul>
     *
     * @param x input
     * @return reversed character value of the input
     */
    public int reverse(int x) {
        StringBuilder valueBuilder = new StringBuilder("0");
        long currentValue = Math.abs((long) x);
        boolean isNegative = x < 0;
        while (currentValue > 0) {
            long divided = Math.floorDiv(currentValue, 10L);
            long extracted = currentValue - (divided * 10);
            valueBuilder.append(extracted);
            currentValue = divided;
        }
        long parsedResult = Long.parseLong(valueBuilder.toString()) * (isNegative ? -1 : 1);
        return parsedResult < Integer.MIN_VALUE || parsedResult > Integer.MAX_VALUE ? 0 : (int) parsedResult;
    }

    /**
     * Implement using Java support classes
     * <ul>
     * <li>Runtime: 3ms</li>
     * <li>Memory usage: 36.3 MB</li>
     * </ul>
     *
     * @param x input
     * @return reversed character value of the input
     */
    public int reverseWithJavaStringBuilder(int x) {
        long currentValue = Math.abs((long) x);
        boolean isNegative = x < 0;
        String resultStr = new
                StringBuilder(String.valueOf(currentValue))
                .reverse()
                .toString();
        long parsedResult = Long.parseLong(resultStr) * (isNegative ? -1 : 1);
        return parsedResult < Integer.MIN_VALUE || parsedResult > Integer.MAX_VALUE ? 0 : (int) parsedResult;
    }

    /**
     * SOLUTION
     * <p>
     * We can build up the reverse integer one digit at a time.
     * While doing so, we can check beforehand whether or not appending another digit would cause overflow.
     *
     * @param x input
     * @return reversed character value of the input
     */
    public int reverseWithSolution(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }
}
