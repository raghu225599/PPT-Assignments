/**Question 5
Given an array of integers arr, the task is to find maximum element of that array using recursion.

**Example 1:**

Input: arr = {1, 4, 3, -5, -4, 8, 6};
Output: 8

**Example 2:**

Input: arr = {1, 4, 45, 6, 10, -8};
Output: 45
*/
public class Program5 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, 3, -5, -4, 8, 6};
        System.out.print(max(arr));
    }
    public static int max(int[] arr){
        return max( arr,0);
    }
    public static int max(int[] arr,int index){
        if(index==arr.length-1)
            return arr[index];
        return Math.max(arr[index],max(arr,index+1));
    }
}
