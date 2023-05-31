package ArraysAssignment1;

import java.util.Arrays;

/**Q8.** You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

        You are given an integer array nums representing the data status of this set after the error.

        Find the number that occurs twice and the number that is missing and return them in the form of an array.

        **Example 1:**
        Input: nums = [1,2,2,4]
        Output: [2,3]
*/
public class Question8 {
    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        int[] result = duplicateMissing(nums);
        System.out.println(Arrays.toString(result));
    }

    public static int[] duplicateMissing(int[] nums) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int element = nums[i];
            if (i + 1 != element) {
                int index = element - 1;
                if (nums[index] != index + 1) {
                    swapNum(nums, i, index);
                }
                else if (nums[index] == nums[i]) {
                    result[0] = nums[i];
                    result[1] = i + 1;
                }
            }
        }
        return result;
    }
    public static void swapNum(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}