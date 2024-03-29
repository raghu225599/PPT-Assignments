import java.util.Scanner;

/***Question 1**

 Given an integer`n`, return*`true`if it is a power of three. Otherwise, return`false`*.

 An integer`n`is a power of three, if there exists an integer`x`such that`n == 3x`.

 **Example 1:**

 ```
 Input: n = 27
 Output: true
 Explanation: 27 = 33
 ```

 **Example 2:**

 ```
 Input: n = 0
 Output: false
 Explanation: There is no x where 3x = 0.

 ```

 **Example 3:**

 */
public class Ass1 {

    public static void main(String[] args) {

        System.out.println(isPowerOfThree(6));
    }
    public static boolean isPowerOfThree(int n) {
        if(n==1)
            return true;
        if(n<=0 || n%3!=0)
            return false;
        return isPowerOfThree(n/3);
    }
}
