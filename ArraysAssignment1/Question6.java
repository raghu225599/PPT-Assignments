package ArraysAssignment1;

import java.util.HashSet;

/**Q6.** Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

        **Example 1:**
        Input: nums = [1,2,3,1]

        Output: true
*/
public class Question6 {
    public static void main(String[] args) {
        int[] nums={1,2,3,5};
        System.out.println(duplicateNumbers(nums));
    }
    public static boolean duplicateNumbers(int[] nums){
        HashSet<Integer> hashSet=new HashSet<>();
        for(int i:nums) {
            if (hashSet.contains(i))
                return true;
            else
                hashSet.add(i);
        }
        return false;
    }
}
