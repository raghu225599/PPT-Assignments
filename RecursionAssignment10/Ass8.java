/***Question 8**

Given a string, count total number of consonants in it. A consonant is an English alphabet character that is not vowel (a, e, i, o and u). Examples of constants are b, c, d, f, and g.

**Examples :**
 Input : abc de
 Output : 3
 There are three consonants b, c and d.

 Input : geeksforgeeks portal
 Output : 12
 */
public class Ass8 {
    public static void main(String[] args) {
        String str="geeksforgeeks portal";
        int count=countConsonantsRecursive(str);
        System.out.print("total no. of consonants present in given string:"+count);
    }
    public static int countConsonantsRecursive(String str){
        return countConsonantsRecursive(str,0);
    }
    private static int countConsonantsRecursive(String str, int index) {
        if (index >= str.length()) {
            return 0;
        }

        char ch = str.charAt(index);
        int count = Character.isLetter(ch) && !isVowel(ch) ? 1 : 0;
        return count + countConsonantsRecursive(str, index + 1);
    }
    private static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
