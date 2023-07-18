import java.util.ArrayList;
import java.util.List;

/***Question 3**

****Given a set represented as a string, write a recursive code to print all subsets of it. The subsets can be printed in any order.

**Example 1:**

Input :set = “abc”

Output :{ “”, “a”, “b”, “c”, “ab”, “ac”, “bc”, “abc”}

**Example 2:**

Input :set = “abcd”

Output :{ “”, “a” ,”ab” ,”abc” ,”abcd”, “abd” ,”ac” ,”acd”, “ad” ,”b”, “bc” ,”bcd” ,”bd” ,”c” ,”cd” ,”d” }

 */
public class Ass3 {
    public static void main(String[] args) {
        String set = "abc";
        List<String> subsets = allSubsets(set);
        System.out.println(subsets);
    }
    public static List<String> allSubsets(String set) {
        List<String> result = new ArrayList<>();

        // Base case: if set is empty, return a list with an empty string
        if (set.isEmpty()) {
            result.add("");
            return result;
        }

        char first = set.charAt(0);
        String remaining = set.substring(1);

        // Recursively get all subsets of the remaining string
        List<String> subsets = allSubsets(remaining);

        // Add subsets to the result list and append the first character to each subset
        for (String subset : subsets) {
            result.add(subset);
            result.add(first + subset);
        }

        return result;
    }
}
