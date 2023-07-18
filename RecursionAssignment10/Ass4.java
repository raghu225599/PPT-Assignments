/***Question 4**

Given a string calculate length of the string using recursion.

**Examples:**
 Input : str = "abcd"
 Output :4

 Input : str = "GEEKSFORGEEKS"
 Output :13
 */
public class Ass4 {
    public static void main(String[] args) {
        String str="aha";
        int length = calculateLength(str);
        System.out.println("Length of the string: " + length);
    }
    public static int calculateLength(String str) {
        // Base case: if the string is empty, return 0
        if (str.isEmpty()) {
            return 0;
        }

        // Recursive call on the remaining substring
        return 1 + calculateLength(str.substring(1));
    }
}
