package ArraysAssignment1;
/**Q3.** Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

        You must write an algorithm with O(log n) runtime complexity.

        **Example 1:**
        Input: nums = [1,3,5,6], target = 5

        Output: 2
 */
public class Question3 {
    public static void main(String[] args) {
        int[] nums={1,3,5,6};
        int target =5;
        System.out.println(binarySearch(nums,target));
    }
    public static int binarySearch(int[] nums,int target){
        int start=0,end=nums.length-1;
        for(;start<=end;){
            int mid=start+(end-start)/2;
            if(target==nums[mid])
                return mid;
            else if(target>nums[mid])
                start=mid+1;
            else
                end=mid-1;
        }
        return start;
    }
}
