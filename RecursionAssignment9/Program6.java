/***Question 6**

Given first term (a), common difference (d) and a integer N of the Arithmetic Progression series, the task is to find Nth term of the series.

**Example 1:**

Input : a = 2 d = 1 N = 5
Output : 6
The 5th term of the series is : 6

**Example 2:**

Input : a = 5 d = 2 N = 10
Output : 23
The 10th term of the series is : 23

*/
public class Program6 {
    public static void main(String[] args) {
         int a = 2, d = 1, N = 5;
        System.out.print(term(a,d,N));
    }
    public static int term(int a,int d,int N){
        return a+(N-1)*d;
    }
}
