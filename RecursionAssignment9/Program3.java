/***Question 3**

****Given a positive integer, N. Find the factorial of N.

**Example 1:**

Input: N = 5

Output: 120

**Example 2:**

Input: N = 4

Output: 24
*/
public class Program3 {
    public static void main(String[] args) {
        System.out.print(fact(0));
    }
    public static int fact(int n){
        if(n==0||n==1)
            return 1;
        return n*fact(n-1);
    }
}
