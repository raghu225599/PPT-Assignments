import java.util.Scanner;

/***Question 2**

Given a number n, find the sum of the first natural numbers.

**Example 1:**

Input: n = 3

Output: 6

**Example 2:**

Input  : 5

Output : 15

*/
public class Program2 {

    public static void main(String[] args) {
      System.out.println(sum(8));
    }
    public static int sum(int n){
        if(n==1)
            return n;
        return n+sum(n-1);
    }
}
