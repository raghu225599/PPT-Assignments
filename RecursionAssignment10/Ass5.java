/***Question 5**

We are given a string S, we need to find count of all contiguous substrings starting and ending with same character.

**Examples :**
Input  : S = "abcab"
Output : 7
There are 15 substrings of "abcab"
a, ab, abc, abca, abcab, b, bc, bca
bcab, c, ca, cab, a, ab, b
Out of the above substrings, there
are 7 substrings : a, abca, b, bcab,
c, a and b.

Input  : S = "aba"
Output : 4
The substrings are a, b, a and aba
 */
public class Ass5 {
    public static void main(String[] args) {
        String str = "abcab";
        int count = countSubstrings(str);
        System.out.println("Count of contiguous substrings: " + count);
    }
    public static int countSubstrings(String str) {
        return countSubstringsRecursive(str, 0, str.length() - 1);
    }

    private static int countSubstringsRecursive(String str, int start, int end) {
        if (start > end) {
            return 0;
        }

        int count = countSubstringsRecursive(str, start, end - 1);
        count += countSubstringsWithSameStartAndEnd(str, start, end);

        return count;
    }

    private static int countSubstringsWithSameStartAndEnd(String str, int start, int end) {
        if (start == end) {
            return 1;
        }

        int count = 0;
        if (str.charAt(start) == str.charAt(end)) {
            count = 1;
        }

        count += countSubstringsWithSameStartAndEnd(str, start, end - 1);

        return count;
    }
}
