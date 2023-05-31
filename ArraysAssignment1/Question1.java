package ArraysAssignment1;

import java.util.Arrays;
import java.util.HashMap;

/**Q1.** Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

        You may assume that each input would have exactly one solution, and you may not use the same element twice.

        You can return the answer in any order.

        **Example:**
        Input: nums = [2,7,11,15], target = 9
        Output0 [0,1]
*/
public class Question1 {
    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int target=18;
        int[] result=twoSum(nums,target);
        System.out.println(Arrays.toString(result));
    }
    public static int[] twoSum(int[] arr,int target){
        HashMap<Integer,Integer> complementCheck=new HashMap<>();
        int i1=-1;
        int i2=-1;
        for(int i=0;i<arr.length;i++){
            int complement=target-arr[i];
            if(complementCheck.containsKey(complement)){
                i1=i;
                i2=complementCheck.get(complement);
                return new int[]{i1,i2};
            }else{
                complementCheck.put(arr[i],i);
            }
        }
        return new int[]{i1,i2};
    }
}
