import java.util.HashMap;
import java.util.Map;
/***Question 4**

        Given a binary array nums, return *the maximum length of a contiguous subarray with an equal number of* 0 *and* 1.

        **Example 1:**

        **Input:** nums = [0,1]

        **Output:** 2

        **Explanation:**

        [0, 1] is the longest contiguous subarray with an equal number of 0 and 1.

*/
public class Q4 {
    public static void main(String[] args) {
        int[] nums = {0, 1};
        int maxLength = findMaxLength(nums);

        System.out.println("Maximum length of contiguous subarray: " + maxLength);
    }
    public static int findMaxLength(int[] nums) {
        int maxLength = 0;
        int count = 0;
        Map<Integer, Integer> countMap = new HashMap<>();
        countMap.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            count += nums[i] == 0 ? -1 : 1;

            if (countMap.containsKey(count)) {
                int prevIndex = countMap.get(count);
                maxLength = Math.max(maxLength, i - prevIndex);
            } else {
                countMap.put(count, i);
            }
        }

        return maxLength;
    }
}
