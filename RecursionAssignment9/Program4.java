/***Question 4**

Given a number N and a power P, the task is to find the exponent of this number raised to the given power, i.e. N^P.

**Example 1 :**

Input: N = 5, P = 2

Output: 25

**Example 2 :**
Input: N = 2, P = 5

Output: 32
 */
public class Program4 {
    public static void main(String[] args) {
        System.out.println(nPowP(2,5));
    }
    public static int nPowP(int N,int P){
        if(P==0)
            return 1;
        return N*nPowP(N,P-1);
    }
}
