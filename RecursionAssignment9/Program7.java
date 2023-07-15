/***Question 7**

Given a string S, the task is to write a program to print all permutations of a given string.

**Example 1:**

***Input:***

*S = “ABC”

***Output:***

“ABC”, “ACB”, “BAC”, “BCA”, “CBA”, “CAB”

**Example 2:**

***Input:***

*S = “XY”

***Output:***

“XY”, “YX”

*/
public class Program7 {
    public static void main(String[] args) {
        String s = "ABC";
        String answer = "";
        permutation(s, answer);
    }

    public static void permutation(String s, String answer) {
        if (answer.length() == s.length()) {
            System.out.print(answer + " ");
            return;
        }
        for (int i = 0; i <= answer.length(); i++) {
            String subanswer = answer.substring(0, i ) + s.charAt(answer.length()) + answer.substring(i, answer.length());
            permutation(s, subanswer);
        }
    }
}