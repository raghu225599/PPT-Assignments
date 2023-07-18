import java.util.ArrayList;
import java.util.List;

/***Question 7**

Given a string str, the task is to print all the permutations of str. A permutation is an arrangement of all or part of a set of objects, with regard to the order of the arrangement. For instance, the words ‘bat’ and ‘tab’ represents two distinct permutation (or arrangements) of a similar three letter word.

**Examples:**

> Input:str = “cd”
>
>
> **Output:cd dc
>
> **Input:str = “abb”
>
> **Output:abb abb bab bba bab bba
>
 */
public class Ass7 {
    public static void main(String[] args) {
        String str = "cd";
        List<String> perms = permutations(str);
        System.out.println(perms);
    }
    public static List<String> permutations(String str) {
        List<String> result = new ArrayList<>();

        // Base case: if the string length is 1, return a list with the string as the only permutation
        if (str.length() == 1) {
            result.add(str);
            return result;
        }

        // Iterate over each character in the string
        for (int i = 0; i < str.length(); i++) {
            // Select the current character as the first character of the permutation
            char firstChar = str.charAt(i);

            // Recursively find all permutations of the remaining characters
            String remainingChars = str.substring(0, i) + str.substring(i + 1);
            List<String> permutations = permutations(remainingChars);

            // Insert the selected character at different positions to generate new permutations
            for (String perm : permutations) {
                result.add(firstChar + perm);
            }
        }

        return result;
    }

}
