import java.util.Scanner;

/***Question 1**

Given an integer`n`, return`true`if it is a power of two. Otherwise, return`false`.

An integer`n`is a power of two, if there exists an integer`x`such that`n == 2x`.

**Example 1:**
Input: n = 1

Output: true

**Example 2:**
Input: n = 16

Output: true

**Example 3:**
Input: n = 3

Output: false
 */
public class Program1 {

    public static void main(String[] args) {

        System.out.println(isPowerOfTwo(8));
    }
    public static boolean isPowerOfTwo(int n) {
        if(n==1)
            return true;
        if(n<=0 || n%2!=0)
            return false;
        return isPowerOfTwo(n/2);
    }
}
