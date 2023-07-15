/***Question 8**

 Given an array, find a product of all array elements.

 **Example 1:**

 Input  : arr[] = {1, 2, 3, 4, 5}
 Output : 120
 **Example 2:**

 Input  : arr[] = {1, 6, 3}
 Output : 18

*/
public class Program8 {
    public static void main(String[] args) {
         int arr[] = new int[]{1, 2, 3, 4, 5};
        System.out.print(product(arr));
    }

    public static int product(int[] arr){
        return product(arr,0);
    }
    public static int product(int[] arr,int index){
        if(index==arr.length-1)
            return arr[index];
        return arr[index]*product(arr,index+1);
    }
}
